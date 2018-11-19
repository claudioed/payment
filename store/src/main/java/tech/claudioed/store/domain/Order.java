package tech.claudioed.store.domain;

import com.google.common.collect.Sets;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import lombok.Value;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
@Value
public class Order {

  String number;

  BigDecimal total;

  Customer customer;

  Set<OrderState> events;

  public static Order newOrder(BigDecimal total,Customer customer){
    final HashSet<OrderState> states = Sets
        .newHashSet(OrderState.builder().changedAt(LocalDateTime.now()).status("new").build());
    return new Order(UUID.randomUUID().toString(),total,customer,states);
  }

}
