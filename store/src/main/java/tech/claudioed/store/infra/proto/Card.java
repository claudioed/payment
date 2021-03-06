// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package tech.claudioed.store.infra.proto;

/**
 * Protobuf type {@code store.Card}
 */
public  final class Card extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:store.Card)
    CardOrBuilder {
  // Use Card.newBuilder() to construct.
  private Card(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Card() {
    number_ = "";
    expireAt_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Card(
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
            java.lang.String s = input.readStringRequireUtf8();

            number_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            expireAt_ = s;
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
    return tech.claudioed.store.infra.proto.Store.internal_static_store_Card_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.claudioed.store.infra.proto.Store.internal_static_store_Card_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.claudioed.store.infra.proto.Card.class, tech.claudioed.store.infra.proto.Card.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object number_;
  /**
   * <code>string number = 1;</code>
   */
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <code>string number = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIREAT_FIELD_NUMBER = 2;
  private volatile java.lang.Object expireAt_;
  /**
   * <code>string expireAt = 2;</code>
   */
  public java.lang.String getExpireAt() {
    java.lang.Object ref = expireAt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expireAt_ = s;
      return s;
    }
  }
  /**
   * <code>string expireAt = 2;</code>
   */
  public com.google.protobuf.ByteString
      getExpireAtBytes() {
    java.lang.Object ref = expireAt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expireAt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
    }
    if (!getExpireAtBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, expireAt_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
    }
    if (!getExpireAtBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, expireAt_);
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
    if (!(obj instanceof tech.claudioed.store.infra.proto.Card)) {
      return super.equals(obj);
    }
    tech.claudioed.store.infra.proto.Card other = (tech.claudioed.store.infra.proto.Card) obj;

    boolean result = true;
    result = result && getNumber()
        .equals(other.getNumber());
    result = result && getExpireAt()
        .equals(other.getExpireAt());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (37 * hash) + EXPIREAT_FIELD_NUMBER;
    hash = (53 * hash) + getExpireAt().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.claudioed.store.infra.proto.Card parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.Card parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech.claudioed.store.infra.proto.Card parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.claudioed.store.infra.proto.Card parseFrom(
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
  public static Builder newBuilder(tech.claudioed.store.infra.proto.Card prototype) {
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
   * Protobuf type {@code store.Card}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:store.Card)
      tech.claudioed.store.infra.proto.CardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.claudioed.store.infra.proto.Store.internal_static_store_Card_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.claudioed.store.infra.proto.Store.internal_static_store_Card_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.claudioed.store.infra.proto.Card.class, tech.claudioed.store.infra.proto.Card.Builder.class);
    }

    // Construct using tech.claudioed.store.infra.proto.Card.newBuilder()
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
      number_ = "";

      expireAt_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.claudioed.store.infra.proto.Store.internal_static_store_Card_descriptor;
    }

    public tech.claudioed.store.infra.proto.Card getDefaultInstanceForType() {
      return tech.claudioed.store.infra.proto.Card.getDefaultInstance();
    }

    public tech.claudioed.store.infra.proto.Card build() {
      tech.claudioed.store.infra.proto.Card result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public tech.claudioed.store.infra.proto.Card buildPartial() {
      tech.claudioed.store.infra.proto.Card result = new tech.claudioed.store.infra.proto.Card(this);
      result.number_ = number_;
      result.expireAt_ = expireAt_;
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
      if (other instanceof tech.claudioed.store.infra.proto.Card) {
        return mergeFrom((tech.claudioed.store.infra.proto.Card)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.claudioed.store.infra.proto.Card other) {
      if (other == tech.claudioed.store.infra.proto.Card.getDefaultInstance()) return this;
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        onChanged();
      }
      if (!other.getExpireAt().isEmpty()) {
        expireAt_ = other.expireAt_;
        onChanged();
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
      tech.claudioed.store.infra.proto.Card parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech.claudioed.store.infra.proto.Card) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object number_ = "";
    /**
     * <code>string number = 1;</code>
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string number = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 1;</code>
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string number = 1;</code>
     */
    public Builder clearNumber() {
      
      number_ = getDefaultInstance().getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string number = 1;</code>
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      number_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expireAt_ = "";
    /**
     * <code>string expireAt = 2;</code>
     */
    public java.lang.String getExpireAt() {
      java.lang.Object ref = expireAt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expireAt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expireAt = 2;</code>
     */
    public com.google.protobuf.ByteString
        getExpireAtBytes() {
      java.lang.Object ref = expireAt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expireAt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expireAt = 2;</code>
     */
    public Builder setExpireAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expireAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string expireAt = 2;</code>
     */
    public Builder clearExpireAt() {
      
      expireAt_ = getDefaultInstance().getExpireAt();
      onChanged();
      return this;
    }
    /**
     * <code>string expireAt = 2;</code>
     */
    public Builder setExpireAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expireAt_ = value;
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


    // @@protoc_insertion_point(builder_scope:store.Card)
  }

  // @@protoc_insertion_point(class_scope:store.Card)
  private static final tech.claudioed.store.infra.proto.Card DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.claudioed.store.infra.proto.Card();
  }

  public static tech.claudioed.store.infra.proto.Card getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Card>
      PARSER = new com.google.protobuf.AbstractParser<Card>() {
    public Card parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Card(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Card> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Card> getParserForType() {
    return PARSER;
  }

  public tech.claudioed.store.infra.proto.Card getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

