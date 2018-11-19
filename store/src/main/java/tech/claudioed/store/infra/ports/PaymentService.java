package tech.claudioed.store.infra.ports;

import io.grpc.stub.StreamObserver;
import java.math.BigDecimal;
import tech.claudioed.store.domain.Card;
import tech.claudioed.store.domain.Customer;
import tech.claudioed.store.domain.Order;
import tech.claudioed.store.domain.repository.OrderRepository;
import tech.claudioed.store.domain.service.AuthorizationService;
import tech.claudioed.store.infra.proto.PaymentGrpc;
import tech.claudioed.store.infra.proto.PaymentRequest;
import tech.claudioed.store.infra.proto.PaymentResult;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
public class PaymentService extends PaymentGrpc.PaymentImplBase {

  private final AuthorizationService authorizationService;

  private final OrderRepository orderRepository;

  public PaymentService(AuthorizationService authorizationService,
      OrderRepository orderRepository) {
    this.authorizationService = authorizationService;
    this.orderRepository = orderRepository;
  }

  @Override
  public void pay(PaymentRequest request, StreamObserver<PaymentResult> responseObserver) {

    final Customer customer = Customer.builder().id(request.getCustomer().getId())
        .name(request.getCustomer().getName()).build();

    final Order order = Order.newOrder(BigDecimal.valueOf(request.getAmount()), customer);

    final Card card = Card.builder().number(request.getCard().getNumber())
        .expireAt(request.getCard().getExpireAt()).build();

    orderRepository.register(order).flatMap(or -> this.authorizationService.authorization(or,card,BigDecimal.valueOf(request.getAmount()))).subscribe(authorizationState -> {
      final tech.claudioed.store.infra.proto.PaymentResult paymentResult = tech.claudioed.store.infra.proto.PaymentResult
          .newBuilder().setStatus(authorizationState.getStatus())
          .setProcessedAt(authorizationState.getProcessedAt()).build();

      responseObserver.onNext(paymentResult);
      responseObserver.onCompleted();

    });

  }

}
