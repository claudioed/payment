package tech.claudioed.store.infra.application;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
public class StoreApplication {

  public static void main(String[] args){
    Server server = ServerBuilder.forPort(8080).build();






  }

}
