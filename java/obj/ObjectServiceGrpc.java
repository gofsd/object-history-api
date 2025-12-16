package obj;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ------------------- SERVICE -------------------
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: object/object.proto")
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

  private static volatile io.grpc.MethodDescriptor<obj.CreateObjectsUniqueRequest,
      obj.ObjectsResponse> getCreateObjectsUniqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObjectsUnique",
      requestType = obj.CreateObjectsUniqueRequest.class,
      responseType = obj.ObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.CreateObjectsUniqueRequest,
      obj.ObjectsResponse> getCreateObjectsUniqueMethod() {
    io.grpc.MethodDescriptor<obj.CreateObjectsUniqueRequest, obj.ObjectsResponse> getCreateObjectsUniqueMethod;
    if ((getCreateObjectsUniqueMethod = ObjectServiceGrpc.getCreateObjectsUniqueMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getCreateObjectsUniqueMethod = ObjectServiceGrpc.getCreateObjectsUniqueMethod) == null) {
          ObjectServiceGrpc.getCreateObjectsUniqueMethod = getCreateObjectsUniqueMethod =
              io.grpc.MethodDescriptor.<obj.CreateObjectsUniqueRequest, obj.ObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObjectsUnique"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.CreateObjectsUniqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("CreateObjectsUnique"))
              .build();
        }
      }
    }
    return getCreateObjectsUniqueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.UpdateObjectsUniqueRequest,
      obj.ObjectsResponse> getUpdateObjectsUniqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObjectsUnique",
      requestType = obj.UpdateObjectsUniqueRequest.class,
      responseType = obj.ObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.UpdateObjectsUniqueRequest,
      obj.ObjectsResponse> getUpdateObjectsUniqueMethod() {
    io.grpc.MethodDescriptor<obj.UpdateObjectsUniqueRequest, obj.ObjectsResponse> getUpdateObjectsUniqueMethod;
    if ((getUpdateObjectsUniqueMethod = ObjectServiceGrpc.getUpdateObjectsUniqueMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getUpdateObjectsUniqueMethod = ObjectServiceGrpc.getUpdateObjectsUniqueMethod) == null) {
          ObjectServiceGrpc.getUpdateObjectsUniqueMethod = getUpdateObjectsUniqueMethod =
              io.grpc.MethodDescriptor.<obj.UpdateObjectsUniqueRequest, obj.ObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObjectsUnique"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.UpdateObjectsUniqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("UpdateObjectsUnique"))
              .build();
        }
      }
    }
    return getUpdateObjectsUniqueMethod;
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

  private static volatile io.grpc.MethodDescriptor<obj.ExecuteActionsRequest,
      obj.ExecuteActionResponse> getExecuteActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteActions",
      requestType = obj.ExecuteActionsRequest.class,
      responseType = obj.ExecuteActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.ExecuteActionsRequest,
      obj.ExecuteActionResponse> getExecuteActionsMethod() {
    io.grpc.MethodDescriptor<obj.ExecuteActionsRequest, obj.ExecuteActionResponse> getExecuteActionsMethod;
    if ((getExecuteActionsMethod = ObjectServiceGrpc.getExecuteActionsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getExecuteActionsMethod = ObjectServiceGrpc.getExecuteActionsMethod) == null) {
          ObjectServiceGrpc.getExecuteActionsMethod = getExecuteActionsMethod =
              io.grpc.MethodDescriptor.<obj.ExecuteActionsRequest, obj.ExecuteActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ExecuteActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ExecuteActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("ExecuteActions"))
              .build();
        }
      }
    }
    return getExecuteActionsMethod;
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

  private static volatile io.grpc.MethodDescriptor<obj.TransferObjectsResponse,
      obj.ReceiveObjectsResponse> getReceiveObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveObjects",
      requestType = obj.TransferObjectsResponse.class,
      responseType = obj.ReceiveObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.TransferObjectsResponse,
      obj.ReceiveObjectsResponse> getReceiveObjectsMethod() {
    io.grpc.MethodDescriptor<obj.TransferObjectsResponse, obj.ReceiveObjectsResponse> getReceiveObjectsMethod;
    if ((getReceiveObjectsMethod = ObjectServiceGrpc.getReceiveObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getReceiveObjectsMethod = ObjectServiceGrpc.getReceiveObjectsMethod) == null) {
          ObjectServiceGrpc.getReceiveObjectsMethod = getReceiveObjectsMethod =
              io.grpc.MethodDescriptor.<obj.TransferObjectsResponse, obj.ReceiveObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.TransferObjectsResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ReceiveObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("ReceiveObjects"))
              .build();
        }
      }
    }
    return getReceiveObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.Empty,
      obj.SubscriptionResponse> getSubscribeToUsersObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToUsersObjects",
      requestType = obj.Empty.class,
      responseType = obj.SubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<obj.Empty,
      obj.SubscriptionResponse> getSubscribeToUsersObjectsMethod() {
    io.grpc.MethodDescriptor<obj.Empty, obj.SubscriptionResponse> getSubscribeToUsersObjectsMethod;
    if ((getSubscribeToUsersObjectsMethod = ObjectServiceGrpc.getSubscribeToUsersObjectsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getSubscribeToUsersObjectsMethod = ObjectServiceGrpc.getSubscribeToUsersObjectsMethod) == null) {
          ObjectServiceGrpc.getSubscribeToUsersObjectsMethod = getSubscribeToUsersObjectsMethod =
              io.grpc.MethodDescriptor.<obj.Empty, obj.SubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToUsersObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.SubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("SubscribeToUsersObjects"))
              .build();
        }
      }
    }
    return getSubscribeToUsersObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.Empty,
      obj.Object> getSubscribeToMyselfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToMyself",
      requestType = obj.Empty.class,
      responseType = obj.Object.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<obj.Empty,
      obj.Object> getSubscribeToMyselfMethod() {
    io.grpc.MethodDescriptor<obj.Empty, obj.Object> getSubscribeToMyselfMethod;
    if ((getSubscribeToMyselfMethod = ObjectServiceGrpc.getSubscribeToMyselfMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getSubscribeToMyselfMethod = ObjectServiceGrpc.getSubscribeToMyselfMethod) == null) {
          ObjectServiceGrpc.getSubscribeToMyselfMethod = getSubscribeToMyselfMethod =
              io.grpc.MethodDescriptor.<obj.Empty, obj.Object>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToMyself"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.Object.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("SubscribeToMyself"))
              .build();
        }
      }
    }
    return getSubscribeToMyselfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.DiffByUsers,
      obj.ActionBatch> getSyncWithUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncWithUsers",
      requestType = obj.DiffByUsers.class,
      responseType = obj.ActionBatch.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<obj.DiffByUsers,
      obj.ActionBatch> getSyncWithUsersMethod() {
    io.grpc.MethodDescriptor<obj.DiffByUsers, obj.ActionBatch> getSyncWithUsersMethod;
    if ((getSyncWithUsersMethod = ObjectServiceGrpc.getSyncWithUsersMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getSyncWithUsersMethod = ObjectServiceGrpc.getSyncWithUsersMethod) == null) {
          ObjectServiceGrpc.getSyncWithUsersMethod = getSyncWithUsersMethod =
              io.grpc.MethodDescriptor.<obj.DiffByUsers, obj.ActionBatch>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncWithUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.DiffByUsers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ActionBatch.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("SyncWithUsers"))
              .build();
        }
      }
    }
    return getSyncWithUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.ActionBatch,
      obj.ActionBatch> getSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sync",
      requestType = obj.ActionBatch.class,
      responseType = obj.ActionBatch.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<obj.ActionBatch,
      obj.ActionBatch> getSyncMethod() {
    io.grpc.MethodDescriptor<obj.ActionBatch, obj.ActionBatch> getSyncMethod;
    if ((getSyncMethod = ObjectServiceGrpc.getSyncMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getSyncMethod = ObjectServiceGrpc.getSyncMethod) == null) {
          ObjectServiceGrpc.getSyncMethod = getSyncMethod =
              io.grpc.MethodDescriptor.<obj.ActionBatch, obj.ActionBatch>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ActionBatch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ActionBatch.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("Sync"))
              .build();
        }
      }
    }
    return getSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<obj.GetObjectRequest,
      obj.ObjectsResponse> getGetObjectCommandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectCommands",
      requestType = obj.GetObjectRequest.class,
      responseType = obj.ObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<obj.GetObjectRequest,
      obj.ObjectsResponse> getGetObjectCommandsMethod() {
    io.grpc.MethodDescriptor<obj.GetObjectRequest, obj.ObjectsResponse> getGetObjectCommandsMethod;
    if ((getGetObjectCommandsMethod = ObjectServiceGrpc.getGetObjectCommandsMethod) == null) {
      synchronized (ObjectServiceGrpc.class) {
        if ((getGetObjectCommandsMethod = ObjectServiceGrpc.getGetObjectCommandsMethod) == null) {
          ObjectServiceGrpc.getGetObjectCommandsMethod = getGetObjectCommandsMethod =
              io.grpc.MethodDescriptor.<obj.GetObjectRequest, obj.ObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectCommands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  obj.ObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectServiceMethodDescriptorSupplier("GetObjectCommands"))
              .build();
        }
      }
    }
    return getGetObjectCommandsMethod;
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
   * ------------------- SERVICE -------------------
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CRUD
     * </pre>
     */
    default void createObject(obj.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectMethod(), responseObserver);
    }

    /**
     */
    default void getObject(obj.GetObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    default void updateObject(obj.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectMethod(), responseObserver);
    }

    /**
     */
    default void deleteObjectField(obj.DeleteObjectsFieldsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectFieldMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch/Unique
     * </pre>
     */
    default void createObjects(obj.CreateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectsMethod(), responseObserver);
    }

    /**
     */
    default void getObjects(obj.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectsMethod(), responseObserver);
    }

    /**
     */
    default void updateObjects(obj.UpdateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectsMethod(), responseObserver);
    }

    /**
     */
    default void createObjectsUnique(obj.CreateObjectsUniqueRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateObjectsUniqueMethod(), responseObserver);
    }

    /**
     */
    default void updateObjectsUnique(obj.UpdateObjectsUniqueRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateObjectsUniqueMethod(), responseObserver);
    }

    /**
     * <pre>
     * List &amp; Pagination
     * </pre>
     */
    default void listObjects(obj.ListObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ListObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Action/Transfer
     * </pre>
     */
    default void executeAction(obj.ExecuteActionRequest request,
        io.grpc.stub.StreamObserver<obj.ExecuteActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteActionMethod(), responseObserver);
    }

    /**
     */
    default void executeActions(obj.ExecuteActionsRequest request,
        io.grpc.stub.StreamObserver<obj.ExecuteActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteActionsMethod(), responseObserver);
    }

    /**
     */
    default void transferObjects(obj.TransferObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.TransferObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferObjectsMethod(), responseObserver);
    }

    /**
     */
    default void receiveObjects(obj.TransferObjectsResponse request,
        io.grpc.stub.StreamObserver<obj.ReceiveObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streaming/Subscription
     * </pre>
     */
    default void subscribeToUsersObjects(obj.Empty request,
        io.grpc.stub.StreamObserver<obj.SubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeToUsersObjectsMethod(), responseObserver);
    }

    /**
     */
    default void subscribeToMyself(obj.Empty request,
        io.grpc.stub.StreamObserver<obj.Object> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeToMyselfMethod(), responseObserver);
    }

    /**
     */
    default void syncWithUsers(obj.DiffByUsers request,
        io.grpc.stub.StreamObserver<obj.ActionBatch> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncWithUsersMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<obj.ActionBatch> sync(
        io.grpc.stub.StreamObserver<obj.ActionBatch> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get object commands
     * </pre>
     */
    default void getObjectCommands(obj.GetObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectCommandsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ObjectService.
   * <pre>
   * ------------------- SERVICE -------------------
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
   * ------------------- SERVICE -------------------
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
     * <pre>
     * CRUD
     * </pre>
     */
    public void createObject(obj.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request, responseObserver);
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
    public void updateObject(obj.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteObjectField(obj.DeleteObjectsFieldsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch/Unique
     * </pre>
     */
    public void createObjects(obj.CreateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectsMethod(), getCallOptions()), request, responseObserver);
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
    public void updateObjects(obj.UpdateObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createObjectsUnique(obj.CreateObjectsUniqueRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateObjectsUniqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateObjectsUnique(obj.UpdateObjectsUniqueRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateObjectsUniqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List &amp; Pagination
     * </pre>
     */
    public void listObjects(obj.ListObjectsRequest request,
        io.grpc.stub.StreamObserver<obj.ListObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Action/Transfer
     * </pre>
     */
    public void executeAction(obj.ExecuteActionRequest request,
        io.grpc.stub.StreamObserver<obj.ExecuteActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeActions(obj.ExecuteActionsRequest request,
        io.grpc.stub.StreamObserver<obj.ExecuteActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteActionsMethod(), getCallOptions()), request, responseObserver);
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
    public void receiveObjects(obj.TransferObjectsResponse request,
        io.grpc.stub.StreamObserver<obj.ReceiveObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceiveObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streaming/Subscription
     * </pre>
     */
    public void subscribeToUsersObjects(obj.Empty request,
        io.grpc.stub.StreamObserver<obj.SubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeToUsersObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToMyself(obj.Empty request,
        io.grpc.stub.StreamObserver<obj.Object> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeToMyselfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncWithUsers(obj.DiffByUsers request,
        io.grpc.stub.StreamObserver<obj.ActionBatch> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSyncWithUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<obj.ActionBatch> sync(
        io.grpc.stub.StreamObserver<obj.ActionBatch> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSyncMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Get object commands
     * </pre>
     */
    public void getObjectCommands(obj.GetObjectRequest request,
        io.grpc.stub.StreamObserver<obj.ObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectCommandsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ObjectService.
   * <pre>
   * ------------------- SERVICE -------------------
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
     * <pre>
     * CRUD
     * </pre>
     */
    public obj.ObjectResponse createObject(obj.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse getObject(obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse updateObject(obj.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse deleteObjectField(obj.DeleteObjectsFieldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch/Unique
     * </pre>
     */
    public obj.ObjectsResponse createObjects(obj.CreateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse getObjects(obj.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse updateObjects(obj.UpdateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse createObjectsUnique(obj.CreateObjectsUniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectsUniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse updateObjectsUnique(obj.UpdateObjectsUniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectsUniqueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List &amp; Pagination
     * </pre>
     */
    public obj.ListObjectsResponse listObjects(obj.ListObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Action/Transfer
     * </pre>
     */
    public obj.ExecuteActionResponse executeAction(obj.ExecuteActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ExecuteActionResponse executeActions(obj.ExecuteActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteActionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.TransferObjectsResponse transferObjects(obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ReceiveObjectsResponse receiveObjects(obj.TransferObjectsResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streaming/Subscription
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, obj.SubscriptionResponse>
        subscribeToUsersObjects(obj.Empty request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getSubscribeToUsersObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, obj.Object>
        subscribeToMyself(obj.Empty request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getSubscribeToMyselfMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, obj.ActionBatch>
        syncWithUsers(obj.DiffByUsers request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getSyncWithUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<obj.ActionBatch, obj.ActionBatch>
        sync() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getSyncMethod(), getCallOptions());
    }

    /**
     * <pre>
     * Get object commands
     * </pre>
     */
    public obj.ObjectsResponse getObjectCommands(obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectCommandsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ObjectService.
   * <pre>
   * ------------------- SERVICE -------------------
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
     * <pre>
     * CRUD
     * </pre>
     */
    public obj.ObjectResponse createObject(obj.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse getObject(obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse updateObject(obj.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectResponse deleteObjectField(obj.DeleteObjectsFieldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch/Unique
     * </pre>
     */
    public obj.ObjectsResponse createObjects(obj.CreateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse getObjects(obj.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse updateObjects(obj.UpdateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse createObjectsUnique(obj.CreateObjectsUniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateObjectsUniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ObjectsResponse updateObjectsUnique(obj.UpdateObjectsUniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateObjectsUniqueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List &amp; Pagination
     * </pre>
     */
    public obj.ListObjectsResponse listObjects(obj.ListObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Action/Transfer
     * </pre>
     */
    public obj.ExecuteActionResponse executeAction(obj.ExecuteActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ExecuteActionResponse executeActions(obj.ExecuteActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteActionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.TransferObjectsResponse transferObjects(obj.TransferObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public obj.ReceiveObjectsResponse receiveObjects(obj.TransferObjectsResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streaming/Subscription
     * </pre>
     */
    public java.util.Iterator<obj.SubscriptionResponse> subscribeToUsersObjects(
        obj.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeToUsersObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<obj.Object> subscribeToMyself(
        obj.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeToMyselfMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<obj.ActionBatch> syncWithUsers(
        obj.DiffByUsers request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSyncWithUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get object commands
     * </pre>
     */
    public obj.ObjectsResponse getObjectCommands(obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectCommandsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ObjectService.
   * <pre>
   * ------------------- SERVICE -------------------
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
     * <pre>
     * CRUD
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectResponse> createObject(
        obj.CreateObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectResponse> updateObject(
        obj.UpdateObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectResponse> deleteObjectField(
        obj.DeleteObjectsFieldsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectFieldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch/Unique
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> createObjects(
        obj.CreateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> updateObjects(
        obj.UpdateObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> createObjectsUnique(
        obj.CreateObjectsUniqueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateObjectsUniqueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> updateObjectsUnique(
        obj.UpdateObjectsUniqueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateObjectsUniqueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List &amp; Pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ListObjectsResponse> listObjects(
        obj.ListObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Action/Transfer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ExecuteActionResponse> executeAction(
        obj.ExecuteActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteActionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ExecuteActionResponse> executeActions(
        obj.ExecuteActionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteActionsMethod(), getCallOptions()), request);
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
        obj.TransferObjectsResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceiveObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get object commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<obj.ObjectsResponse> getObjectCommands(
        obj.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectCommandsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OBJECT = 0;
  private static final int METHODID_GET_OBJECT = 1;
  private static final int METHODID_UPDATE_OBJECT = 2;
  private static final int METHODID_DELETE_OBJECT_FIELD = 3;
  private static final int METHODID_CREATE_OBJECTS = 4;
  private static final int METHODID_GET_OBJECTS = 5;
  private static final int METHODID_UPDATE_OBJECTS = 6;
  private static final int METHODID_CREATE_OBJECTS_UNIQUE = 7;
  private static final int METHODID_UPDATE_OBJECTS_UNIQUE = 8;
  private static final int METHODID_LIST_OBJECTS = 9;
  private static final int METHODID_EXECUTE_ACTION = 10;
  private static final int METHODID_EXECUTE_ACTIONS = 11;
  private static final int METHODID_TRANSFER_OBJECTS = 12;
  private static final int METHODID_RECEIVE_OBJECTS = 13;
  private static final int METHODID_SUBSCRIBE_TO_USERS_OBJECTS = 14;
  private static final int METHODID_SUBSCRIBE_TO_MYSELF = 15;
  private static final int METHODID_SYNC_WITH_USERS = 16;
  private static final int METHODID_GET_OBJECT_COMMANDS = 17;
  private static final int METHODID_SYNC = 18;

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
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((obj.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT:
          serviceImpl.updateObject((obj.UpdateObjectRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_FIELD:
          serviceImpl.deleteObjectField((obj.DeleteObjectsFieldsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectResponse>) responseObserver);
          break;
        case METHODID_CREATE_OBJECTS:
          serviceImpl.createObjects((obj.CreateObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECTS:
          serviceImpl.getObjects((obj.GetObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECTS:
          serviceImpl.updateObjects((obj.UpdateObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_CREATE_OBJECTS_UNIQUE:
          serviceImpl.createObjectsUnique((obj.CreateObjectsUniqueRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECTS_UNIQUE:
          serviceImpl.updateObjectsUnique((obj.UpdateObjectsUniqueRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
          break;
        case METHODID_LIST_OBJECTS:
          serviceImpl.listObjects((obj.ListObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ListObjectsResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ACTION:
          serviceImpl.executeAction((obj.ExecuteActionRequest) request,
              (io.grpc.stub.StreamObserver<obj.ExecuteActionResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ACTIONS:
          serviceImpl.executeActions((obj.ExecuteActionsRequest) request,
              (io.grpc.stub.StreamObserver<obj.ExecuteActionResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_OBJECTS:
          serviceImpl.transferObjects((obj.TransferObjectsRequest) request,
              (io.grpc.stub.StreamObserver<obj.TransferObjectsResponse>) responseObserver);
          break;
        case METHODID_RECEIVE_OBJECTS:
          serviceImpl.receiveObjects((obj.TransferObjectsResponse) request,
              (io.grpc.stub.StreamObserver<obj.ReceiveObjectsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_USERS_OBJECTS:
          serviceImpl.subscribeToUsersObjects((obj.Empty) request,
              (io.grpc.stub.StreamObserver<obj.SubscriptionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_MYSELF:
          serviceImpl.subscribeToMyself((obj.Empty) request,
              (io.grpc.stub.StreamObserver<obj.Object>) responseObserver);
          break;
        case METHODID_SYNC_WITH_USERS:
          serviceImpl.syncWithUsers((obj.DiffByUsers) request,
              (io.grpc.stub.StreamObserver<obj.ActionBatch>) responseObserver);
          break;
        case METHODID_GET_OBJECT_COMMANDS:
          serviceImpl.getObjectCommands((obj.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<obj.ObjectsResponse>) responseObserver);
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
        case METHODID_SYNC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sync(
              (io.grpc.stub.StreamObserver<obj.ActionBatch>) responseObserver);
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
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.GetObjectRequest,
              obj.ObjectResponse>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getUpdateObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.UpdateObjectRequest,
              obj.ObjectResponse>(
                service, METHODID_UPDATE_OBJECT)))
        .addMethod(
          getDeleteObjectFieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.DeleteObjectsFieldsRequest,
              obj.ObjectResponse>(
                service, METHODID_DELETE_OBJECT_FIELD)))
        .addMethod(
          getCreateObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.CreateObjectsRequest,
              obj.ObjectsResponse>(
                service, METHODID_CREATE_OBJECTS)))
        .addMethod(
          getGetObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.GetObjectsRequest,
              obj.ObjectsResponse>(
                service, METHODID_GET_OBJECTS)))
        .addMethod(
          getUpdateObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.UpdateObjectsRequest,
              obj.ObjectsResponse>(
                service, METHODID_UPDATE_OBJECTS)))
        .addMethod(
          getCreateObjectsUniqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.CreateObjectsUniqueRequest,
              obj.ObjectsResponse>(
                service, METHODID_CREATE_OBJECTS_UNIQUE)))
        .addMethod(
          getUpdateObjectsUniqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.UpdateObjectsUniqueRequest,
              obj.ObjectsResponse>(
                service, METHODID_UPDATE_OBJECTS_UNIQUE)))
        .addMethod(
          getListObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.ListObjectsRequest,
              obj.ListObjectsResponse>(
                service, METHODID_LIST_OBJECTS)))
        .addMethod(
          getExecuteActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.ExecuteActionRequest,
              obj.ExecuteActionResponse>(
                service, METHODID_EXECUTE_ACTION)))
        .addMethod(
          getExecuteActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.ExecuteActionsRequest,
              obj.ExecuteActionResponse>(
                service, METHODID_EXECUTE_ACTIONS)))
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
              obj.TransferObjectsResponse,
              obj.ReceiveObjectsResponse>(
                service, METHODID_RECEIVE_OBJECTS)))
        .addMethod(
          getSubscribeToUsersObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              obj.Empty,
              obj.SubscriptionResponse>(
                service, METHODID_SUBSCRIBE_TO_USERS_OBJECTS)))
        .addMethod(
          getSubscribeToMyselfMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              obj.Empty,
              obj.Object>(
                service, METHODID_SUBSCRIBE_TO_MYSELF)))
        .addMethod(
          getSyncWithUsersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              obj.DiffByUsers,
              obj.ActionBatch>(
                service, METHODID_SYNC_WITH_USERS)))
        .addMethod(
          getSyncMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              obj.ActionBatch,
              obj.ActionBatch>(
                service, METHODID_SYNC)))
        .addMethod(
          getGetObjectCommandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              obj.GetObjectRequest,
              obj.ObjectsResponse>(
                service, METHODID_GET_OBJECT_COMMANDS)))
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
              .addMethod(getGetObjectMethod())
              .addMethod(getUpdateObjectMethod())
              .addMethod(getDeleteObjectFieldMethod())
              .addMethod(getCreateObjectsMethod())
              .addMethod(getGetObjectsMethod())
              .addMethod(getUpdateObjectsMethod())
              .addMethod(getCreateObjectsUniqueMethod())
              .addMethod(getUpdateObjectsUniqueMethod())
              .addMethod(getListObjectsMethod())
              .addMethod(getExecuteActionMethod())
              .addMethod(getExecuteActionsMethod())
              .addMethod(getTransferObjectsMethod())
              .addMethod(getReceiveObjectsMethod())
              .addMethod(getSubscribeToUsersObjectsMethod())
              .addMethod(getSubscribeToMyselfMethod())
              .addMethod(getSyncWithUsersMethod())
              .addMethod(getSyncMethod())
              .addMethod(getGetObjectCommandsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
