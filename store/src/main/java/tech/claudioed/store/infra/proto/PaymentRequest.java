// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package tech.claudioed.store.infra.proto;

/**
 * Protobuf type {@code store.PaymentRequest}
 */
public  final class PaymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:store.PaymentRequest)
    PaymentRequestOrBuilder {
  // Use PaymentRequest.newBuilder() to construct.
  private PaymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentRequest() {
    amount_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PaymentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            tech.claudioed.store.infra.proto.Card.Builder subBuilder = null;
            if (card_ != null) {
              subBuilder = card_.toBuilder();
            }
            card_ = input.readMessage(tech.claudioed.store.infra.proto.Card.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(card_);
              card_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            tech.claudioed.store.infra.proto.Order.Builder subBuilder = null;
            if (order_ != null) {
              subBuilder = order_.toBuilder();
            }
            order_ = input.readMessage(tech.claudioed.store.infra.proto.Order.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(order_);
              order_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            tech.claudioed.store.infra.proto.Customer.Builder subBuilder = null;
            if (customer_ != null) {
              subBuilder = customer_.toBuilder();
            }
            customer_ = input.readMessage(tech.claudioed.store.infra.proto.Customer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customer_);
              customer_ = subBuilder.buildPartial();
            }

            break;
          }
          case 37: {

            amount_ = input.readFloat();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tech.claudioed.store.infra.proto.Store.internal_static_store_PaymentRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.claudioed.store.infra.proto.Store.internal_static_store_PaymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.claudioed.store.infra.proto.PaymentRequest.class, tech.claudioed.store.infra.proto.PaymentRequest.Builder.class);
  }

  public static final int CARD_FIELD_NUMBER = 1;
  private tech.claudioed.store.infra.proto.Card card_;
  /**
   * <code>.store.Card card = 1;</code>
   */
  public boolean hasCard() {
    return card_ != null;
  }
  /**
   * <code>.store.Card card = 1;</code>
   */
  public tech.claudioed.store.infra.proto.Card getCard() {
    return card_ == null ? tech.claudioed.store.infra.proto.Card.getDefaultInstance() : card_;
  }
  /**
   * <code>.store.Card card = 1;</code>
   */
  public tech.claudioed.store.infra.proto.CardOrBuilder getCardOrBuilder() {
    return getCard();
  }

  public static final int ORDER_FIELD_NUMBER = 2;
  private tech.claudioed.store.infra.proto.Order order_;
  /**
   * <code>.store.Order order = 2;</code>
   */
  public boolean hasOrder() {
    return order_ != null;
  }
  /**
   * <code>.store.Order order = 2;</code>
   */
  public tech.claudioed.store.infra.proto.Order getOrder() {
    return order_ == null ? tech.claudioed.store.infra.proto.Order.getDefaultInstance() : order_;
  }
  /**
   * <code>.store.Order order = 2;</code>
   */
  public tech.claudioed.store.infra.proto.OrderOrBuilder getOrderOrBuilder() {
    return getOrder();
  }

  public static final int CUSTOMER_FIELD_NUMBER = 3;
  private tech.claudioed.store.infra.proto.Customer customer_;
  /**
   * <code>.store.Customer customer = 3;</code>
   */
  public boolean hasCustomer() {
    return customer_ != null;
  }
  /**
   * <code>.store.Customer customer = 3;</code>
   */
  public tech.claudioed.store.infra.proto.Customer getCustomer() {
    return customer_ == null ? tech.claudioed.store.infra.proto.Customer.getDefaultInstance() : customer_;
  }
  /**
   * <code>.store.Customer customer = 3;</code>
   */
  public tech.claudioed.store.infra.proto.CustomerOrBuilder getCustomerOrBuilder() {
    return getCustomer();
  }

  public static final int AMOUNT_FIELD_NUMBER = 4;
  private float amount_;
  /**
   * <code>float amount = 4;</code>
   */
  public float getAmount() {
    return amount_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (card_ != null) {
      output.writeMessage(1, getCard());
    }
    if (order_ != null) {
      output.writeMessage(2, getOrder());
    }
    if (customer_ != null) {
      output.writeMessage(3, getCustomer());
    }
    if (amount_ != 0F) {
      output.writeFloat(4, amount_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (card_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCard());
    }
    if (order_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOrder());
    }
    if (customer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCustomer());
    }
    if (amount_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, amount_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tech.claudioed.store.infra.proto.PaymentRequest)) {
      return super.equals(obj);
    }
    tech.claudioed.store.infra.proto.PaymentRequest other = (tech.claudioed.store.infra.proto.PaymentRequest) obj;

    boolean result = true;
    result = result && (hasCard() == other.hasCard());
    if (hasCard()) {
      result = result && getCard()
          .equals(other.getCard());
    }
    result = result && (hasOrder() == other.hasOrder());
    if (hasOrder()) {
      result = result && getOrder()
          .equals(other.getOrder());
    }
    result = result && (hasCustomer() == other.hasCustomer());
    if (hasCustomer()) {
      result = result && getCustomer()
          .equals(other.getCustomer());
    }
    result = result && (
        java.lang.Float.floatToIntBits(getAmount())
        == java.lang.Float.floatToIntBits(
            other.getAmount()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCard()) {
      hash = (37 * hash) + CARD_FIELD_NUMBER;
      hash = (53 * hash) + getCard().hashCode();
    }
    if (hasOrder()) {
      hash = (37 * hash) + ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getOrder().hashCode();
    }
    if (hasCustomer()) {
      hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getCustomer().hashCode();
    }
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAmount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.claudioed.store.infra.proto.PaymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tech.claudioed.store.infra.proto.PaymentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code store.PaymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:store.PaymentRequest)
      tech.claudioed.store.infra.proto.PaymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.claudioed.store.infra.proto.Store.internal_static_store_PaymentRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.claudioed.store.infra.proto.Store.internal_static_store_PaymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.claudioed.store.infra.proto.PaymentRequest.class, tech.claudioed.store.infra.proto.PaymentRequest.Builder.class);
    }

    // Construct using tech.claudioed.store.infra.proto.PaymentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (cardBuilder_ == null) {
        card_ = null;
      } else {
        card_ = null;
        cardBuilder_ = null;
      }
      if (orderBuilder_ == null) {
        order_ = null;
      } else {
        order_ = null;
        orderBuilder_ = null;
      }
      if (customerBuilder_ == null) {
        customer_ = null;
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }
      amount_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.claudioed.store.infra.proto.Store.internal_static_store_PaymentRequest_descriptor;
    }

    public tech.claudioed.store.infra.proto.PaymentRequest getDefaultInstanceForType() {
      return tech.claudioed.store.infra.proto.PaymentRequest.getDefaultInstance();
    }

    public tech.claudioed.store.infra.proto.PaymentRequest build() {
      tech.claudioed.store.infra.proto.PaymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public tech.claudioed.store.infra.proto.PaymentRequest buildPartial() {
      tech.claudioed.store.infra.proto.PaymentRequest result = new tech.claudioed.store.infra.proto.PaymentRequest(this);
      if (cardBuilder_ == null) {
        result.card_ = card_;
      } else {
        result.card_ = cardBuilder_.build();
      }
      if (orderBuilder_ == null) {
        result.order_ = order_;
      } else {
        result.order_ = orderBuilder_.build();
      }
      if (customerBuilder_ == null) {
        result.customer_ = customer_;
      } else {
        result.customer_ = customerBuilder_.build();
      }
      result.amount_ = amount_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tech.claudioed.store.infra.proto.PaymentRequest) {
        return mergeFrom((tech.claudioed.store.infra.proto.PaymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.claudioed.store.infra.proto.PaymentRequest other) {
      if (other == tech.claudioed.store.infra.proto.PaymentRequest.getDefaultInstance()) return this;
      if (other.hasCard()) {
        mergeCard(other.getCard());
      }
      if (other.hasOrder()) {
        mergeOrder(other.getOrder());
      }
      if (other.hasCustomer()) {
        mergeCustomer(other.getCustomer());
      }
      if (other.getAmount() != 0F) {
        setAmount(other.getAmount());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      tech.claudioed.store.infra.proto.PaymentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech.claudioed.store.infra.proto.PaymentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private tech.claudioed.store.infra.proto.Card card_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.claudioed.store.infra.proto.Card, tech.claudioed.store.infra.proto.Card.Builder, tech.claudioed.store.infra.proto.CardOrBuilder> cardBuilder_;
    /**
     * <code>.store.Card card = 1;</code>
     */
    public boolean hasCard() {
      return cardBuilder_ != null || card_ != null;
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    public tech.claudioed.store.infra.proto.Card getCard() {
      if (cardBuilder_ == null) {
        return card_ == null ? tech.claudioed.store.infra.proto.Card.getDefaultInstance() : card_;
      } else {
        return cardBuilder_.getMessage();
      }
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    public Builder setCard(tech.claudioed.store.infra.proto.Card value) {
      if (cardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        card_ = value;
        onChanged();
      } else {
        cardBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    public Builder setCard(
        tech.claudioed.store.infra.proto.Card.Builder builderForValue) {
      if (cardBuilder_ == null) {
        card_ = builderForValue.build();
        onChanged();
      } else {
        cardBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    public Builder mergeCard(tech.claudioed.store.infra.proto.Card value) {
      if (cardBuilder_ == null) {
        if (card_ != null) {
          card_ =
            tech.claudioed.store.infra.proto.Card.newBuilder(card_).mergeFrom(value).buildPartial();
        } else {
          card_ = value;
        }
        onChanged();
      } else {
        cardBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    public Builder clearCard() {
      if (cardBuilder_ == null) {
        card_ = null;
        onChanged();
      } else {
        card_ = null;
        cardBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    public tech.claudioed.store.infra.proto.Card.Builder getCardBuilder() {
      
      onChanged();
      return getCardFieldBuilder().getBuilder();
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    public tech.claudioed.store.infra.proto.CardOrBuilder getCardOrBuilder() {
      if (cardBuilder_ != null) {
        return cardBuilder_.getMessageOrBuilder();
      } else {
        return card_ == null ?
            tech.claudioed.store.infra.proto.Card.getDefaultInstance() : card_;
      }
    }
    /**
     * <code>.store.Card card = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.claudioed.store.infra.proto.Card, tech.claudioed.store.infra.proto.Card.Builder, tech.claudioed.store.infra.proto.CardOrBuilder> 
        getCardFieldBuilder() {
      if (cardBuilder_ == null) {
        cardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tech.claudioed.store.infra.proto.Card, tech.claudioed.store.infra.proto.Card.Builder, tech.claudioed.store.infra.proto.CardOrBuilder>(
                getCard(),
                getParentForChildren(),
                isClean());
        card_ = null;
      }
      return cardBuilder_;
    }

    private tech.claudioed.store.infra.proto.Order order_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.claudioed.store.infra.proto.Order, tech.claudioed.store.infra.proto.Order.Builder, tech.claudioed.store.infra.proto.OrderOrBuilder> orderBuilder_;
    /**
     * <code>.store.Order order = 2;</code>
     */
    public boolean hasOrder() {
      return orderBuilder_ != null || order_ != null;
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    public tech.claudioed.store.infra.proto.Order getOrder() {
      if (orderBuilder_ == null) {
        return order_ == null ? tech.claudioed.store.infra.proto.Order.getDefaultInstance() : order_;
      } else {
        return orderBuilder_.getMessage();
      }
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    public Builder setOrder(tech.claudioed.store.infra.proto.Order value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        order_ = value;
        onChanged();
      } else {
        orderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    public Builder setOrder(
        tech.claudioed.store.infra.proto.Order.Builder builderForValue) {
      if (orderBuilder_ == null) {
        order_ = builderForValue.build();
        onChanged();
      } else {
        orderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    public Builder mergeOrder(tech.claudioed.store.infra.proto.Order value) {
      if (orderBuilder_ == null) {
        if (order_ != null) {
          order_ =
            tech.claudioed.store.infra.proto.Order.newBuilder(order_).mergeFrom(value).buildPartial();
        } else {
          order_ = value;
        }
        onChanged();
      } else {
        orderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    public Builder clearOrder() {
      if (orderBuilder_ == null) {
        order_ = null;
        onChanged();
      } else {
        order_ = null;
        orderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    public tech.claudioed.store.infra.proto.Order.Builder getOrderBuilder() {
      
      onChanged();
      return getOrderFieldBuilder().getBuilder();
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    public tech.claudioed.store.infra.proto.OrderOrBuilder getOrderOrBuilder() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilder();
      } else {
        return order_ == null ?
            tech.claudioed.store.infra.proto.Order.getDefaultInstance() : order_;
      }
    }
    /**
     * <code>.store.Order order = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.claudioed.store.infra.proto.Order, tech.claudioed.store.infra.proto.Order.Builder, tech.claudioed.store.infra.proto.OrderOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tech.claudioed.store.infra.proto.Order, tech.claudioed.store.infra.proto.Order.Builder, tech.claudioed.store.infra.proto.OrderOrBuilder>(
                getOrder(),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
    }

    private tech.claudioed.store.infra.proto.Customer customer_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.claudioed.store.infra.proto.Customer, tech.claudioed.store.infra.proto.Customer.Builder, tech.claudioed.store.infra.proto.CustomerOrBuilder> customerBuilder_;
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public boolean hasCustomer() {
      return customerBuilder_ != null || customer_ != null;
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public tech.claudioed.store.infra.proto.Customer getCustomer() {
      if (customerBuilder_ == null) {
        return customer_ == null ? tech.claudioed.store.infra.proto.Customer.getDefaultInstance() : customer_;
      } else {
        return customerBuilder_.getMessage();
      }
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public Builder setCustomer(tech.claudioed.store.infra.proto.Customer value) {
      if (customerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customer_ = value;
        onChanged();
      } else {
        customerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public Builder setCustomer(
        tech.claudioed.store.infra.proto.Customer.Builder builderForValue) {
      if (customerBuilder_ == null) {
        customer_ = builderForValue.build();
        onChanged();
      } else {
        customerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public Builder mergeCustomer(tech.claudioed.store.infra.proto.Customer value) {
      if (customerBuilder_ == null) {
        if (customer_ != null) {
          customer_ =
            tech.claudioed.store.infra.proto.Customer.newBuilder(customer_).mergeFrom(value).buildPartial();
        } else {
          customer_ = value;
        }
        onChanged();
      } else {
        customerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public Builder clearCustomer() {
      if (customerBuilder_ == null) {
        customer_ = null;
        onChanged();
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public tech.claudioed.store.infra.proto.Customer.Builder getCustomerBuilder() {
      
      onChanged();
      return getCustomerFieldBuilder().getBuilder();
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    public tech.claudioed.store.infra.proto.CustomerOrBuilder getCustomerOrBuilder() {
      if (customerBuilder_ != null) {
        return customerBuilder_.getMessageOrBuilder();
      } else {
        return customer_ == null ?
            tech.claudioed.store.infra.proto.Customer.getDefaultInstance() : customer_;
      }
    }
    /**
     * <code>.store.Customer customer = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.claudioed.store.infra.proto.Customer, tech.claudioed.store.infra.proto.Customer.Builder, tech.claudioed.store.infra.proto.CustomerOrBuilder> 
        getCustomerFieldBuilder() {
      if (customerBuilder_ == null) {
        customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tech.claudioed.store.infra.proto.Customer, tech.claudioed.store.infra.proto.Customer.Builder, tech.claudioed.store.infra.proto.CustomerOrBuilder>(
                getCustomer(),
                getParentForChildren(),
                isClean());
        customer_ = null;
      }
      return customerBuilder_;
    }

    private float amount_ ;
    /**
     * <code>float amount = 4;</code>
     */
    public float getAmount() {
      return amount_;
    }
    /**
     * <code>float amount = 4;</code>
     */
    public Builder setAmount(float value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float amount = 4;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0F;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:store.PaymentRequest)
  }

  // @@protoc_insertion_point(class_scope:store.PaymentRequest)
  private static final tech.claudioed.store.infra.proto.PaymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.claudioed.store.infra.proto.PaymentRequest();
  }

  public static tech.claudioed.store.infra.proto.PaymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<PaymentRequest>() {
    public PaymentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaymentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentRequest> getParserForType() {
    return PARSER;
  }

  public tech.claudioed.store.infra.proto.PaymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
