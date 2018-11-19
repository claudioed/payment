package tech.claudioed.store.domain.repository;

import io.reactivex.Single;
import tech.claudioed.store.domain.Order;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
public interface OrderRepository {

  Single<Order> register(Order order);

}
