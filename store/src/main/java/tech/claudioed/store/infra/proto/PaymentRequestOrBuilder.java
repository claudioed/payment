// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package tech.claudioed.store.infra.proto;

public interface PaymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:store.PaymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.store.Card card = 1;</code>
   */
  boolean hasCard();
  /**
   * <code>.store.Card card = 1;</code>
   */
  tech.claudioed.store.infra.proto.Card getCard();
  /**
   * <code>.store.Card card = 1;</code>
   */
  tech.claudioed.store.infra.proto.CardOrBuilder getCardOrBuilder();

  /**
   * <code>.store.Order order = 2;</code>
   */
  boolean hasOrder();
  /**
   * <code>.store.Order order = 2;</code>
   */
  tech.claudioed.store.infra.proto.Order getOrder();
  /**
   * <code>.store.Order order = 2;</code>
   */
  tech.claudioed.store.infra.proto.OrderOrBuilder getOrderOrBuilder();

  /**
   * <code>.store.Customer customer = 3;</code>
   */
  boolean hasCustomer();
  /**
   * <code>.store.Customer customer = 3;</code>
   */
  tech.claudioed.store.infra.proto.Customer getCustomer();
  /**
   * <code>.store.Customer customer = 3;</code>
   */
  tech.claudioed.store.infra.proto.CustomerOrBuilder getCustomerOrBuilder();

  /**
   * <code>float amount = 4;</code>
   */
  float getAmount();
}