package tech.claudioed.authorization.infra.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: authorization.proto")
public final class PaymentGrpc {

  private PaymentGrpc() {}

  public static final String SERVICE_NAME = "authorization.Payment";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<tech.claudioed.authorization.infra.proto.PaymentRequest,
      tech.claudioed.authorization.infra.proto.PaymentResult> METHOD_PAY =
      io.grpc.MethodDescriptor.<tech.claudioed.authorization.infra.proto.PaymentRequest, tech.claudioed.authorization.infra.proto.PaymentResult>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "authorization.Payment", "pay"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              tech.claudioed.authorization.infra.proto.PaymentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              tech.claudioed.authorization.infra.proto.PaymentResult.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentStub newStub(io.grpc.Channel channel) {
    return new PaymentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaymentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaymentFutureStub(channel);
  }

  /**
   */
  public static abstract class PaymentImplBase implements io.grpc.BindableService {

    /**
     */
    public void pay(tech.claudioed.authorization.infra.proto.PaymentRequest request,
        io.grpc.stub.StreamObserver<tech.claudioed.authorization.infra.proto.PaymentResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PAY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PAY,
            asyncUnaryCall(
              new MethodHandlers<
                tech.claudioed.authorization.infra.proto.PaymentRequest,
                tech.claudioed.authorization.infra.proto.PaymentResult>(
                  this, METHODID_PAY)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentStub extends io.grpc.stub.AbstractStub<PaymentStub> {
    private PaymentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentStub(channel, callOptions);
    }

    /**
     */
    public void pay(tech.claudioed.authorization.infra.proto.PaymentRequest request,
        io.grpc.stub.StreamObserver<tech.claudioed.authorization.infra.proto.PaymentResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PAY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentBlockingStub extends io.grpc.stub.AbstractStub<PaymentBlockingStub> {
    private PaymentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentBlockingStub(channel, callOptions);
    }

    /**
     */
    public tech.claudioed.authorization.infra.proto.PaymentResult pay(tech.claudioed.authorization.infra.proto.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PAY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentFutureStub extends io.grpc.stub.AbstractStub<PaymentFutureStub> {
    private PaymentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tech.claudioed.authorization.infra.proto.PaymentResult> pay(
        tech.claudioed.authorization.infra.proto.PaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PAY, getCallOptions()), request);
    }
  }

  private static final int METHODID_PAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAY:
          serviceImpl.pay((tech.claudioed.authorization.infra.proto.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<tech.claudioed.authorization.infra.proto.PaymentResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class PaymentDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tech.claudioed.authorization.infra.proto.Authorization.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PaymentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentDescriptorSupplier())
              .addMethod(METHOD_PAY)
              .build();
        }
      }
    }
    return result;
  }
}
