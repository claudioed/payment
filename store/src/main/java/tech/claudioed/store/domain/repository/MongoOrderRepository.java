package tech.claudioed.store.domain.repository;

import com.mongodb.ConnectionString;
import com.mongodb.async.client.MongoClient;
import com.mongodb.async.client.MongoClients;
import io.reactivex.Single;
import tech.claudioed.store.domain.Order;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
public class MongoOrderRepository implements OrderRepository {

  MongoClient mongoClient = MongoClients.create(new ConnectionString("mongodb://localhost:27017"));


  public MongoOrderRepository() {
  }


  public Single<Order> register(final Order order) {
    return Single.just(null);
  }


}
