package tech.claudioed.store.domain.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.reactivex.Single;
import java.math.BigDecimal;
import tech.claudioed.authorization.infra.proto.PaymentGrpc;
import tech.claudioed.authorization.infra.proto.PaymentRequest;
import tech.claudioed.store.domain.AuthorizationState;
import tech.claudioed.store.domain.Card;
import tech.claudioed.store.domain.Order;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
public class AuthorizationService {

  private final ManagedChannel managedChannel = ManagedChannelBuilder
      .forTarget(System.getenv("AUTHORIZATION_SERVICE")).usePlaintext().build();

  public Single<AuthorizationState> authorization(final Order order,final Card card,final BigDecimal amount){
    PaymentGrpc.PaymentFutureStub paymentService = PaymentGrpc.newFutureStub(managedChannel);
    final PaymentRequest paymentRequest = PaymentRequest.newBuilder().setAmount(amount.floatValue())
        .setOrder(tech.claudioed.authorization.infra.proto.Order.newBuilder().setNumber(order.getNumber()).setTotal(order.getTotal().floatValue()).build())
        .setCard(tech.claudioed.authorization.infra.proto.Card.newBuilder().setExpireAt(card.getExpireAt()).setNumber(card.getNumber()).build())
        .build();
    return Single.fromFuture(paymentService.pay(paymentRequest)).map(auth -> AuthorizationState.builder().processedAt(auth.getProcessedAt()).status(auth.getStatus()).order(order).build());
  }

}
