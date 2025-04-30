package obj;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Object service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: object.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ObjectServiceGrpc {

  private ObjectServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "object.ObjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<obj.CreateObjectRequest,
      obj.ObjectResponse> getCreateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObject",
      requestType = obj.CreateObjectRequest.class,
      responseType = obj.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.CreateObjectRequest,
      obj.ObjectResponse> getCreateObjectMethod() {
    io.grpc.MethodDescriptor<obj.CreateObjectRequest, obj.ObjectResponse> getCreateObjectMethod;
    if ((getCreateObjectMethod = ObjectServiceGrpc.getCreateObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCreateObjectMethod = ObjectServiceGrpc.getCreateObjectMethod) == null) {
          ObjectServiceGrpc.getCreateObjectMethod = getCreateObjectMethod =
              io.grpc.MethodDescriptor.<obj.CreateObjectRequest, obj.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.CreateObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CreateObject"))
              .build();
        }
      }
    }
    return getCreateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.CreateObjectsRequest,
      obj.ObjectsResponse> getCreateObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObjects",
      requestType = obj.CreateObjectsRequest.class,
      responseType = obj.ObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.CreateObjectsRequest,
      obj.ObjectsResponse> getCreateObjectsMethod() {
    io.grpc.MethodDescriptor<obj.CreateObjectsRequest, obj.ObjectsResponse> getCreateObjectsMethod;
    if ((getCreateObjectsMethod = ObjectServiceGrpc.getCreateObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCreateObjectsMethod = ObjectServiceGrpc.getCreateObjectsMethod) == null) {
          ObjectServiceGrpc.getCreateObjectsMethod = getCreateObjectsMethod =
              io.grpc.MethodDescriptor.<obj.CreateObjectsRequest, obj.ObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.CreateObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CreateObjects"))
              .build();
        }
      }
    }
    return getCreateObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.GetObjectRequest,
      obj.ObjectResponse> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = obj.GetObjectRequest.class,
      responseType = obj.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.GetObjectRequest,
      obj.ObjectResponse> getGetObjectMethod() {
    io.grpc.MethodDescriptor<obj.GetObjectRequest, obj.ObjectResponse> getGetObjectMethod;
    if ((getGetObjectMethod = ObjectServiceGrpc.getGetObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectMethod = ObjectServiceGrpc.getGetObjectMethod) == null) {
          ObjectServiceGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<obj.GetObjectRequest, obj.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.GetObjectsRequest,
      obj.ObjectsResponse> getGetObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjects",
      requestType = obj.GetObjectsRequest.class,
      responseType = obj.ObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.GetObjectsRequest,
      obj.ObjectsResponse> getGetObjectsMethod() {
    io.grpc.MethodDescriptor<obj.GetObjectsRequest, obj.ObjectsResponse> getGetObjectsMethod;
    if ((getGetObjectsMethod = ObjectServiceGrpc.getGetObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectsMethod = ObjectServiceGrpc.getGetObjectsMethod) == null) {
          ObjectServiceGrpc.getGetObjectsMethod = getGetObjectsMethod =
              io.grpc.MethodDescriptor.<obj.GetObjectsRequest, obj.ObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.GetObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjects"))
              .build();
        }
      }
    }
    return getGetObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.UpdateObjectRequest,
      obj.ObjectResponse> getUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObject",
      requestType = obj.UpdateObjectRequest.class,
      responseType = obj.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.UpdateObjectRequest,
      obj.ObjectResponse> getUpdateObjectMethod() {
    io.grpc.MethodDescriptor<obj.UpdateObjectRequest, obj.ObjectResponse> getUpdateObjectMethod;
    if ((getUpdateObjectMethod = ObjectServiceGrpc.getUpdateObjectMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getUpdateObjectMethod = ObjectServiceGrpc.getUpdateObjectMethod) == null) {
          ObjectServiceGrpc.getUpdateObjectMethod = getUpdateObjectMethod =
              io.grpc.MethodDescriptor.<obj.UpdateObjectRequest, obj.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.UpdateObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("UpdateObject"))
              .build();
        }
      }
    }
    return getUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.UpdateObjectsRequest,
      obj.ObjectsResponse> getUpdateObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObjects",
      requestType = obj.UpdateObjectsRequest.class,
      responseType = obj.ObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.UpdateObjectsRequest,
      obj.ObjectsResponse> getUpdateObjectsMethod() {
    io.grpc.MethodDescriptor<obj.UpdateObjectsRequest, obj.ObjectsResponse> getUpdateObjectsMethod;
    if ((getUpdateObjectsMethod = ObjectServiceGrpc.getUpdateObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getUpdateObjectsMethod = ObjectServiceGrpc.getUpdateObjectsMethod) == null) {
          ObjectServiceGrpc.getUpdateObjectsMethod = getUpdateObjectsMethod =
              io.grpc.MethodDescriptor.<obj.UpdateObjectsRequest, obj.ObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.UpdateObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("UpdateObjects"))
              .build();
        }
      }
    }
    return getUpdateObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.ListObjectsRequest,
      obj.ListObjectsResponse> getListObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListObjects",
      requestType = obj.ListObjectsRequest.class,
      responseType = obj.ListObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.ListObjectsRequest,
      obj.ListObjectsResponse> getListObjectsMethod() {
    io.grpc.MethodDescriptor<obj.ListObjectsRequest, obj.ListObjectsResponse> getListObjectsMethod;
    if ((getListObjectsMethod = ObjectServiceGrpc.getListObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getListObjectsMethod = ObjectServiceGrpc.getListObjectsMethod) == null) {
          ObjectServiceGrpc.getListObjectsMethod = getListObjectsMethod =
              io.grpc.MethodDescriptor.<obj.ListObjectsRequest, obj.ListObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ListObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ListObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("ListObjects"))
              .build();
        }
      }
    }
    return getListObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.DeleteObjectsFieldsRequest,
      obj.ObjectResponse> getDeleteObjectFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjectField",
      requestType = obj.DeleteObjectsFieldsRequest.class,
      responseType = obj.ObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.DeleteObjectsFieldsRequest,
      obj.ObjectResponse> getDeleteObjectFieldMethod() {
    io.grpc.MethodDescriptor<obj.DeleteObjectsFieldsRequest, obj.ObjectResponse> getDeleteObjectFieldMethod;
    if ((getDeleteObjectFieldMethod = ObjectServiceGrpc.getDeleteObjectFieldMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getDeleteObjectFieldMethod = ObjectServiceGrpc.getDeleteObjectFieldMethod) == null) {
          ObjectServiceGrpc.getDeleteObjectFieldMethod = getDeleteObjectFieldMethod =
              io.grpc.MethodDescriptor.<obj.DeleteObjectsFieldsRequest, obj.ObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjectField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.DeleteObjectsFieldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("DeleteObjectField"))
              .build();
        }
      }
    }
    return getDeleteObjectFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.ExecuteActionRequest,
      obj.ExecuteActionResponse> getExecuteActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteAction",
      requestType = obj.ExecuteActionRequest.class,
      responseType = obj.ExecuteActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.ExecuteActionRequest,
      obj.ExecuteActionResponse> getExecuteActionMethod() {
    io.grpc.MethodDescriptor<obj.ExecuteActionRequest, obj.ExecuteActionResponse> getExecuteActionMethod;
    if ((getExecuteActionMethod = ObjectServiceGrpc.getExecuteActionMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getExecuteActionMethod = ObjectServiceGrpc.getExecuteActionMethod) == null) {
          ObjectServiceGrpc.getExecuteActionMethod = getExecuteActionMethod =
              io.grpc.MethodDescriptor.<obj.ExecuteActionRequest, obj.ExecuteActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ExecuteActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ExecuteActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("ExecuteAction"))
              .build();
        }
      }
    }
    return getExecuteActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.TransferObjectsRequest,
      obj.TransferObjectsResponse> getTransferObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferObjects",
      requestType = obj.TransferObjectsRequest.class,
      responseType = obj.TransferObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.TransferObjectsRequest,
      obj.TransferObjectsResponse> getTransferObjectsMethod() {
    io.grpc.MethodDescriptor<obj.TransferObjectsRequest, obj.TransferObjectsResponse> getTransferObjectsMethod;
    if ((getTransferObjectsMethod = ObjectServiceGrpc.getTransferObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getTransferObjectsMethod = ObjectServiceGrpc.getTransferObjectsMethod) == null) {
          ObjectServiceGrpc.getTransferObjectsMethod = getTransferObjectsMethod =
              io.grpc.MethodDescriptor.<obj.TransferObjectsRequest, obj.TransferObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.TransferObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.TransferObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("TransferObjects"))
              .build();
        }
      }
    }
    return getTransferObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.TransferObjectsRequest,
      obj.ReceiveObjectsResponse> getReceiveObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveObjects",
      requestType = obj.TransferObjectsRequest.class,
      responseType = obj.ReceiveObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.TransferObjectsRequest,
      obj.ReceiveObjectsResponse> getReceiveObjectsMethod() {
    io.grpc.MethodDescriptor<obj.TransferObjectsRequest, obj.ReceiveObjectsResponse> getReceiveObjectsMethod;
    if ((getReceiveObjectsMethod = ObjectServiceGrpc.getReceiveObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getReceiveObjectsMethod = ObjectServiceGrpc.getReceiveObjectsMethod) == null) {
          ObjectServiceGrpc.getReceiveObjectsMethod = getReceiveObjectsMethod =
              io.grpc.MethodDescriptor.<obj.TransferObjectsRequest, obj.ReceiveObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.TransferObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ReceiveObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("ReceiveObjects"))
              .build();
        }
      }
    }
    return getReceiveObjectsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectServiceStub>() {
        @java.lang.Override
        public ObjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectServiceStub(channel, callOptions);
        }
      };
    return ObjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ObjectServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectServiceBlockingV2Stub>() {
        @java.lang.Override
        public ObjectServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ObjectServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectServiceBlockingStub>() {
        @java.lang.Override
        public ObjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectServiceBlockingStub(channel, callOptions);
        }
      };
    return ObjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectServiceFutureStub>() {
        @java.lang.Override
        public ObjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectServiceFutureStub(channel, callOptions);
        }
      };
    return ObjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Object service definition
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createObject(obj.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectMethod(), responseObserver);
    }

    /**
     */
    default void createObjects(obj.CreateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectsMethod(), responseObserver);
    }

    /**
     */
    default void getObject(obj.GetObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    default void getObjects(obj.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectsMethod(), responseObserver);
    }

    /**
     */
    default void updateObject(obj.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectMethod(), responseObserver);
    }

    /**
     */
    default void updateObjects(obj.UpdateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectsMethod(), responseObserver);
    }

    /**
     */
    default void listObjects(obj.ListObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ListObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListObjectsMethod(), responseObserver);
    }

    /**
     */
    default void deleteObjectField(obj.DeleteObjectsFieldsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectFieldMethod(), responseObserver);
    }

    /**
     */
    default void executeAction(obj.ExecuteActionRequest request,
        io.grpc.stub.StreamObserver<obj.ExecuteActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteActionMethod(), responseObserver);
    }

    /**
     */
    default void transferObjects(obj.TransferObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.TransferObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferObjectsMethod(), responseObserver);
    }

    /**
     */
    default void receiveObjects(obj.TransferObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ReceiveObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveObjectsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ObjectService.
   * <pre>
   * Object service definition
   * </pre>
   */
  public static abstract class ObjectServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ObjectServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ObjectService.
   * <pre>
   * Object service definition
   * </pre>
   */
  public static final class ObjectServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ObjectServiceStub> {
    private ObjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectServiceStub(channel, callOptions);
    }

    /**
     */
    public void createObject(obj.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createObjects(obj.CreateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObject(obj.GetObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjects(obj.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateObject(obj.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateObjects(obj.UpdateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listObjects(obj.ListObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ListObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteObjectField(obj.DeleteObjectsFieldsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeAction(obj.ExecuteActionRequest request,
        io.grpc.stub.StreamObserver<obj.ExecuteActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferObjects(obj.TransferObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.TransferObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void receiveObjects(obj.TransferObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ReceiveObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceiveObjectsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ObjectService.
   * <pre>
   * Object service definition
   * </pre>
   */
  public static final class ObjectServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ObjectServiceBlockingV2Stub> {
    private ObjectServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public obj.ObjectResponse createObject(obj.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse createObjects(obj.CreateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse getObject(obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse getObjects(obj.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse updateObject(obj.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse updateObjects(obj.UpdateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ListObjectsResponse listObjects(obj.ListObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse deleteObjectField(obj.DeleteObjectsFieldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectFieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ExecuteActionResponse executeAction(obj.ExecuteActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.TransferObjectsResponse transferObjects(obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ReceiveObjectsResponse receiveObjects(obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveObjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ObjectService.
   * <pre>
   * Object service definition
   * </pre>
   */
  public static final class ObjectServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ObjectServiceBlockingStub> {
    private ObjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public obj.ObjectResponse createObject(obj.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse createObjects(obj.CreateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse getObject(obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse getObjects(obj.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse updateObject(obj.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse updateObjects(obj.UpdateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ListObjectsResponse listObjects(obj.ListObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse deleteObjectField(obj.DeleteObjectsFieldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectFieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ExecuteActionResponse executeAction(obj.ExecuteActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.TransferObjectsResponse transferObjects(obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ReceiveObjectsResponse receiveObjects(obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveObjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ObjectService.
   * <pre>
   * Object service definition
   * </pre>
   */
  public static final class ObjectServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ObjectServiceFutureStub> {
    private ObjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectResponse> createObject(
        obj.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> createObjects(
        obj.CreateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectResponse> getObject(
        obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> getObjects(
        obj.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectResponse> updateObject(
        obj.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> updateObjects(
        obj.UpdateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ListObjectsResponse> listObjects(
        obj.ListObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectResponse> deleteObjectField(
        obj.DeleteObjectsFieldsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectFieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ExecuteActionResponse> executeAction(
        obj.ExecuteActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteActionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.TransferObjectsResponse> transferObjects(
        obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ReceiveObjectsResponse> receiveObjects(
        obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceiveObjectsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OBJECT = 0;
  private static final int METHODID_CREATE_OBJECTS = 1;
  private static final int METHODID_GET_OBJECT = 2;
  private static final int METHODID_GET_OBJECTS = 3;
  private static final int METHODID_UPDATE_OBJECT = 4;
  private static final int METHODID_UPDATE_OBJECTS = 5;
  private static final int METHODID_LIST_OBJECTS = 6;
  private static final int METHODID_DELETE_OBJECT_FIELD = 7;
  private static final int METHODID_EXECUTE_ACTION = 8;
  private static final int METHODID_TRANSFER_OBJECTS = 9;
  private static final int METHODID_RECEIVE_OBJECTS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OBJECT:
          serviceImpl.createObject((obj.CreateObjectRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectResponse>) responseObserver);
          break;
        case METHODID_CREATE_OBJECTS:
          serviceImpl.createObjects((obj.CreateObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((obj.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECTS:
          serviceImpl.getObjects((obj.GetObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT:
          serviceImpl.updateObject((obj.UpdateObjectRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECTS:
          serviceImpl.updateObjects((obj.UpdateObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_LIST_OBJECTS:
          serviceImpl.listObjects((obj.ListObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ListObjectsResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_FIELD:
          serviceImpl.deleteObjectField((obj.DeleteObjectsFieldsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ACTION:
          serviceImpl.executeAction((obj.ExecuteActionRequest) request,
              (io.grpc.stub.StreamObserver<obj.ExecuteActionResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_OBJECTS:
          serviceImpl.transferObjects((obj.TransferObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.TransferObjectsResponse>) responseObserver);
          break;
        case METHODID_RECEIVE_OBJECTS:
          serviceImpl.receiveObjects((obj.TransferObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ReceiveObjectsResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.CreateObjectRequest,
              obj.ObjectResponse>(
                service, METHODID_CREATE_OBJECT)))
        .addMethod(
          getCreateObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.CreateObjectsRequest,
              obj.ObjectsResponse>(
                service, METHODID_CREATE_OBJECTS)))
        .addMethod(
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.GetObjectRequest,
              obj.ObjectResponse>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getGetObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.GetObjectsRequest,
              obj.ObjectsResponse>(
                service, METHODID_GET_OBJECTS)))
        .addMethod(
          getUpdateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.UpdateObjectRequest,
              obj.ObjectResponse>(
                service, METHODID_UPDATE_OBJECT)))
        .addMethod(
          getUpdateObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.UpdateObjectsRequest,
              obj.ObjectsResponse>(
                service, METHODID_UPDATE_OBJECTS)))
        .addMethod(
          getListObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.ListObjectsRequest,
              obj.ListObjectsResponse>(
                service, METHODID_LIST_OBJECTS)))
        .addMethod(
          getDeleteObjectFieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.DeleteObjectsFieldsRequest,
              obj.ObjectResponse>(
                service, METHODID_DELETE_OBJECT_FIELD)))
        .addMethod(
          getExecuteActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.ExecuteActionRequest,
              obj.ExecuteActionResponse>(
                service, METHODID_EXECUTE_ACTION)))
        .addMethod(
          getTransferObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.TransferObjectsRequest,
              obj.TransferObjectsResponse>(
                service, METHODID_TRANSFER_OBJECTS)))
        .addMethod(
          getReceiveObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.TransferObjectsRequest,
              obj.ReceiveObjectsResponse>(
                service, METHODID_RECEIVE_OBJECTS)))
        .build();
  }

  private static abstract class ObjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return obj.Obj.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ObjectService");
    }
  }

  private static final class ObjectServiceFileDescriptorSupplier
      extends ObjectServiceBaseDescriptorSupplier {
    ObjectServiceFileDescriptorSupplier() {}
  }

  private static final class ObjectServiceMethodDescriptorSupplier
      extends ObjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ObjectServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ObjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObjectServiceFileDescriptorSupplier())
              .addMethod(getCreateObjectMethod())
              .addMethod(getCreateObjectsMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getGetObjectsMethod())
              .addMethod(getUpdateObjectMethod())
              .addMethod(getUpdateObjectsMethod())
              .addMethod(getListObjectsMethod())
              .addMethod(getDeleteObjectFieldMethod())
              .addMethod(getExecuteActionMethod())
              .addMethod(getTransferObjectsMethod())
              .addMethod(getReceiveObjectsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
