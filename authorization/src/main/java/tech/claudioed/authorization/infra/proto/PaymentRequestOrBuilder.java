// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authorization.proto

package tech.claudioed.authorization.infra.proto;

public interface PaymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:authorization.PaymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.authorization.Card card = 1;</code>
   */
  boolean hasCard();
  /**
   * <code>.authorization.Card card = 1;</code>
   */
  tech.claudioed.authorization.infra.proto.Card getCard();
  /**
   * <code>.authorization.Card card = 1;</code>
   */
  tech.claudioed.authorization.infra.proto.CardOrBuilder getCardOrBuilder();

  /**
   * <code>.authorization.Order order = 2;</code>
   */
  boolean hasOrder();
  /**
   * <code>.authorization.Order order = 2;</code>
   */
  tech.claudioed.authorization.infra.proto.Order getOrder();
  /**
   * <code>.authorization.Order order = 2;</code>
   */
  tech.claudioed.authorization.infra.proto.OrderOrBuilder getOrderOrBuilder();

  /**
   * <code>float amount = 3;</code>
   */
  float getAmount();
}