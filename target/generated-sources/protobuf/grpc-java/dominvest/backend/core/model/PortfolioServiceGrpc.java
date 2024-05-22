package dominvest.backend.core.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: PortfolioAtheneService.proto")
public final class PortfolioServiceGrpc {

  private PortfolioServiceGrpc() {}

  public static final String SERVICE_NAME = "dominvest.backend.core.model.PortfolioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dominvest.backend.core.model.TransactionCreateRequest,
      dominvest.backend.core.model.TransactionCreateResponse> getCreateOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createOperation",
      requestType = dominvest.backend.core.model.TransactionCreateRequest.class,
      responseType = dominvest.backend.core.model.TransactionCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dominvest.backend.core.model.TransactionCreateRequest,
      dominvest.backend.core.model.TransactionCreateResponse> getCreateOperationMethod() {
    io.grpc.MethodDescriptor<dominvest.backend.core.model.TransactionCreateRequest, dominvest.backend.core.model.TransactionCreateResponse> getCreateOperationMethod;
    if ((getCreateOperationMethod = PortfolioServiceGrpc.getCreateOperationMethod) == null) {
      synchronized (PortfolioServiceGrpc.class) {
        if ((getCreateOperationMethod = PortfolioServiceGrpc.getCreateOperationMethod) == null) {
          PortfolioServiceGrpc.getCreateOperationMethod = getCreateOperationMethod =
              io.grpc.MethodDescriptor.<dominvest.backend.core.model.TransactionCreateRequest, dominvest.backend.core.model.TransactionCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dominvest.backend.core.model.TransactionCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dominvest.backend.core.model.TransactionCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PortfolioServiceMethodDescriptorSupplier("createOperation"))
              .build();
        }
      }
    }
    return getCreateOperationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PortfolioServiceStub newStub(io.grpc.Channel channel) {
    return new PortfolioServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PortfolioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PortfolioServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PortfolioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PortfolioServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PortfolioServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOperation(dominvest.backend.core.model.TransactionCreateRequest request,
        io.grpc.stub.StreamObserver<dominvest.backend.core.model.TransactionCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOperationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOperationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dominvest.backend.core.model.TransactionCreateRequest,
                dominvest.backend.core.model.TransactionCreateResponse>(
                  this, METHODID_CREATE_OPERATION)))
          .build();
    }
  }

  /**
   */
  public static final class PortfolioServiceStub extends io.grpc.stub.AbstractStub<PortfolioServiceStub> {
    private PortfolioServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortfolioServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortfolioServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortfolioServiceStub(channel, callOptions);
    }

    /**
     */
    public void createOperation(dominvest.backend.core.model.TransactionCreateRequest request,
        io.grpc.stub.StreamObserver<dominvest.backend.core.model.TransactionCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOperationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PortfolioServiceBlockingStub extends io.grpc.stub.AbstractStub<PortfolioServiceBlockingStub> {
    private PortfolioServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortfolioServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortfolioServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortfolioServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dominvest.backend.core.model.TransactionCreateResponse createOperation(dominvest.backend.core.model.TransactionCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOperationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PortfolioServiceFutureStub extends io.grpc.stub.AbstractStub<PortfolioServiceFutureStub> {
    private PortfolioServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortfolioServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortfolioServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortfolioServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dominvest.backend.core.model.TransactionCreateResponse> createOperation(
        dominvest.backend.core.model.TransactionCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOperationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OPERATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PortfolioServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PortfolioServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OPERATION:
          serviceImpl.createOperation((dominvest.backend.core.model.TransactionCreateRequest) request,
              (io.grpc.stub.StreamObserver<dominvest.backend.core.model.TransactionCreateResponse>) responseObserver);
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

  private static abstract class PortfolioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PortfolioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dominvest.backend.core.model.PortfolioAtheneService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PortfolioService");
    }
  }

  private static final class PortfolioServiceFileDescriptorSupplier
      extends PortfolioServiceBaseDescriptorSupplier {
    PortfolioServiceFileDescriptorSupplier() {}
  }

  private static final class PortfolioServiceMethodDescriptorSupplier
      extends PortfolioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PortfolioServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PortfolioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PortfolioServiceFileDescriptorSupplier())
              .addMethod(getCreateOperationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
