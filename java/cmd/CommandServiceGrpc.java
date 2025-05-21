package cmd;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: cmd.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommandServiceGrpc {

  private CommandServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "command.CommandService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cmd.Group,
      cmd.Group> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = cmd.Group.class,
      responseType = cmd.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.Group,
      cmd.Group> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<cmd.Group, cmd.Group> getCreateGroupMethod;
    if ((getCreateGroupMethod = CommandServiceGrpc.getCreateGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getCreateGroupMethod = CommandServiceGrpc.getCreateGroupMethod) == null) {
          CommandServiceGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<cmd.Group, cmd.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Group.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("CreateGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.GroupRequest,
      cmd.Group> getDeleteGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGroup",
      requestType = cmd.GroupRequest.class,
      responseType = cmd.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.GroupRequest,
      cmd.Group> getDeleteGroupMethod() {
    io.grpc.MethodDescriptor<cmd.GroupRequest, cmd.Group> getDeleteGroupMethod;
    if ((getDeleteGroupMethod = CommandServiceGrpc.getDeleteGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getDeleteGroupMethod = CommandServiceGrpc.getDeleteGroupMethod) == null) {
          CommandServiceGrpc.getDeleteGroupMethod = getDeleteGroupMethod =
              io.grpc.MethodDescriptor.<cmd.GroupRequest, cmd.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.GroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Group.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("DeleteGroup"))
              .build();
        }
      }
    }
    return getDeleteGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupRequest> getAddUserToGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserToGroup",
      requestType = cmd.UserGroupRequest.class,
      responseType = cmd.UserGroupRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupRequest> getAddUserToGroupMethod() {
    io.grpc.MethodDescriptor<cmd.UserGroupRequest, cmd.UserGroupRequest> getAddUserToGroupMethod;
    if ((getAddUserToGroupMethod = CommandServiceGrpc.getAddUserToGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddUserToGroupMethod = CommandServiceGrpc.getAddUserToGroupMethod) == null) {
          CommandServiceGrpc.getAddUserToGroupMethod = getAddUserToGroupMethod =
              io.grpc.MethodDescriptor.<cmd.UserGroupRequest, cmd.UserGroupRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserToGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupRequest.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddUserToGroup"))
              .build();
        }
      }
    }
    return getAddUserToGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupRequest> getRemoveUserFromGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserFromGroup",
      requestType = cmd.UserGroupRequest.class,
      responseType = cmd.UserGroupRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupRequest> getRemoveUserFromGroupMethod() {
    io.grpc.MethodDescriptor<cmd.UserGroupRequest, cmd.UserGroupRequest> getRemoveUserFromGroupMethod;
    if ((getRemoveUserFromGroupMethod = CommandServiceGrpc.getRemoveUserFromGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getRemoveUserFromGroupMethod = CommandServiceGrpc.getRemoveUserFromGroupMethod) == null) {
          CommandServiceGrpc.getRemoveUserFromGroupMethod = getRemoveUserFromGroupMethod =
              io.grpc.MethodDescriptor.<cmd.UserGroupRequest, cmd.UserGroupRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserFromGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupRequest.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("RemoveUserFromGroup"))
              .build();
        }
      }
    }
    return getRemoveUserFromGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.AddCommandTemplateRequest,
      cmd.CommandTemplate> getAddCommandTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCommandTemplate",
      requestType = cmd.AddCommandTemplateRequest.class,
      responseType = cmd.CommandTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.AddCommandTemplateRequest,
      cmd.CommandTemplate> getAddCommandTemplateMethod() {
    io.grpc.MethodDescriptor<cmd.AddCommandTemplateRequest, cmd.CommandTemplate> getAddCommandTemplateMethod;
    if ((getAddCommandTemplateMethod = CommandServiceGrpc.getAddCommandTemplateMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddCommandTemplateMethod = CommandServiceGrpc.getAddCommandTemplateMethod) == null) {
          CommandServiceGrpc.getAddCommandTemplateMethod = getAddCommandTemplateMethod =
              io.grpc.MethodDescriptor.<cmd.AddCommandTemplateRequest, cmd.CommandTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCommandTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.AddCommandTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandTemplate.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddCommandTemplate"))
              .build();
        }
      }
    }
    return getAddCommandTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.DeleteCommandTemplateRequest,
      cmd.CommandTemplate> getDeleteCommandTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCommandTemplate",
      requestType = cmd.DeleteCommandTemplateRequest.class,
      responseType = cmd.CommandTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.DeleteCommandTemplateRequest,
      cmd.CommandTemplate> getDeleteCommandTemplateMethod() {
    io.grpc.MethodDescriptor<cmd.DeleteCommandTemplateRequest, cmd.CommandTemplate> getDeleteCommandTemplateMethod;
    if ((getDeleteCommandTemplateMethod = CommandServiceGrpc.getDeleteCommandTemplateMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getDeleteCommandTemplateMethod = CommandServiceGrpc.getDeleteCommandTemplateMethod) == null) {
          CommandServiceGrpc.getDeleteCommandTemplateMethod = getDeleteCommandTemplateMethod =
              io.grpc.MethodDescriptor.<cmd.DeleteCommandTemplateRequest, cmd.CommandTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCommandTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.DeleteCommandTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandTemplate.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("DeleteCommandTemplate"))
              .build();
        }
      }
    }
    return getDeleteCommandTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.ExecuteRequest,
      cmd.ExecuteResponse> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = cmd.ExecuteRequest.class,
      responseType = cmd.ExecuteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.ExecuteRequest,
      cmd.ExecuteResponse> getExecuteMethod() {
    io.grpc.MethodDescriptor<cmd.ExecuteRequest, cmd.ExecuteResponse> getExecuteMethod;
    if ((getExecuteMethod = CommandServiceGrpc.getExecuteMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getExecuteMethod = CommandServiceGrpc.getExecuteMethod) == null) {
          CommandServiceGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<cmd.ExecuteRequest, cmd.ExecuteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.ExecuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.ExecuteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("Execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.CancelRequest,
      cmd.CancelResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = cmd.CancelRequest.class,
      responseType = cmd.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.CancelRequest,
      cmd.CancelResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<cmd.CancelRequest, cmd.CancelResponse> getCancelMethod;
    if ((getCancelMethod = CommandServiceGrpc.getCancelMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getCancelMethod = CommandServiceGrpc.getCancelMethod) == null) {
          CommandServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<cmd.CancelRequest, cmd.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.RetryRequest,
      cmd.ExecuteResponse> getRetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retry",
      requestType = cmd.RetryRequest.class,
      responseType = cmd.ExecuteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.RetryRequest,
      cmd.ExecuteResponse> getRetryMethod() {
    io.grpc.MethodDescriptor<cmd.RetryRequest, cmd.ExecuteResponse> getRetryMethod;
    if ((getRetryMethod = CommandServiceGrpc.getRetryMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getRetryMethod = CommandServiceGrpc.getRetryMethod) == null) {
          CommandServiceGrpc.getRetryMethod = getRetryMethod =
              io.grpc.MethodDescriptor.<cmd.RetryRequest, cmd.ExecuteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.RetryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.ExecuteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("Retry"))
              .build();
        }
      }
    }
    return getRetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.ExecuteRequest,
      cmd.DryRunResult> getDryRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DryRun",
      requestType = cmd.ExecuteRequest.class,
      responseType = cmd.DryRunResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.ExecuteRequest,
      cmd.DryRunResult> getDryRunMethod() {
    io.grpc.MethodDescriptor<cmd.ExecuteRequest, cmd.DryRunResult> getDryRunMethod;
    if ((getDryRunMethod = CommandServiceGrpc.getDryRunMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getDryRunMethod = CommandServiceGrpc.getDryRunMethod) == null) {
          CommandServiceGrpc.getDryRunMethod = getDryRunMethod =
              io.grpc.MethodDescriptor.<cmd.ExecuteRequest, cmd.DryRunResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DryRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.ExecuteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.DryRunResult.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("DryRun"))
              .build();
        }
      }
    }
    return getDryRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.SubscribeRequest,
      cmd.CommandLog> getSubscribeLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeLogs",
      requestType = cmd.SubscribeRequest.class,
      responseType = cmd.CommandLog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cmd.SubscribeRequest,
      cmd.CommandLog> getSubscribeLogsMethod() {
    io.grpc.MethodDescriptor<cmd.SubscribeRequest, cmd.CommandLog> getSubscribeLogsMethod;
    if ((getSubscribeLogsMethod = CommandServiceGrpc.getSubscribeLogsMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getSubscribeLogsMethod = CommandServiceGrpc.getSubscribeLogsMethod) == null) {
          CommandServiceGrpc.getSubscribeLogsMethod = getSubscribeLogsMethod =
              io.grpc.MethodDescriptor.<cmd.SubscribeRequest, cmd.CommandLog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandLog.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("SubscribeLogs"))
              .build();
        }
      }
    }
    return getSubscribeLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServiceStub>() {
        @java.lang.Override
        public CommandServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServiceStub(channel, callOptions);
        }
      };
    return CommandServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CommandServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServiceBlockingV2Stub>() {
        @java.lang.Override
        public CommandServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CommandServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServiceBlockingStub>() {
        @java.lang.Override
        public CommandServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServiceBlockingStub(channel, callOptions);
        }
      };
    return CommandServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommandServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServiceFutureStub>() {
        @java.lang.Override
        public CommandServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServiceFutureStub(channel, callOptions);
        }
      };
    return CommandServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Group management
     * </pre>
     */
    default void createGroup(cmd.Group request,
        io.grpc.stub.StreamObserver<cmd.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     */
    default void deleteGroup(cmd.GroupRequest request,
        io.grpc.stub.StreamObserver<cmd.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGroupMethod(), responseObserver);
    }

    /**
     */
    default void addUserToGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserToGroupMethod(), responseObserver);
    }

    /**
     */
    default void removeUserFromGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserFromGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    default void addCommandTemplate(cmd.AddCommandTemplateRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandTemplate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCommandTemplateMethod(), responseObserver);
    }

    /**
     */
    default void deleteCommandTemplate(cmd.DeleteCommandTemplateRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandTemplate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommandTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    default void execute(cmd.ExecuteRequest request,
        io.grpc.stub.StreamObserver<cmd.ExecuteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     */
    default void cancel(cmd.CancelRequest request,
        io.grpc.stub.StreamObserver<cmd.CancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     */
    default void retry(cmd.RetryRequest request,
        io.grpc.stub.StreamObserver<cmd.ExecuteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetryMethod(), responseObserver);
    }

    /**
     */
    default void dryRun(cmd.ExecuteRequest request,
        io.grpc.stub.StreamObserver<cmd.DryRunResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDryRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streaming logs
     * </pre>
     */
    default void subscribeLogs(cmd.SubscribeRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandLog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeLogsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommandService.
   */
  public static abstract class CommandServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommandServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommandService.
   */
  public static final class CommandServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CommandServiceStub> {
    private CommandServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Group management
     * </pre>
     */
    public void createGroup(cmd.Group request,
        io.grpc.stub.StreamObserver<cmd.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGroup(cmd.GroupRequest request,
        io.grpc.stub.StreamObserver<cmd.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserToGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserToGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserFromGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserFromGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public void addCommandTemplate(cmd.AddCommandTemplateRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandTemplate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCommandTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCommandTemplate(cmd.DeleteCommandTemplateRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandTemplate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommandTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    public void execute(cmd.ExecuteRequest request,
        io.grpc.stub.StreamObserver<cmd.ExecuteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancel(cmd.CancelRequest request,
        io.grpc.stub.StreamObserver<cmd.CancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retry(cmd.RetryRequest request,
        io.grpc.stub.StreamObserver<cmd.ExecuteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dryRun(cmd.ExecuteRequest request,
        io.grpc.stub.StreamObserver<cmd.DryRunResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDryRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streaming logs
     * </pre>
     */
    public void subscribeLogs(cmd.SubscribeRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandLog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommandService.
   */
  public static final class CommandServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CommandServiceBlockingV2Stub> {
    private CommandServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Group management
     * </pre>
     */
    public cmd.Group createGroup(cmd.Group request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Group deleteGroup(cmd.GroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupRequest addUserToGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupRequest removeUserFromGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserFromGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public cmd.CommandTemplate addCommandTemplate(cmd.AddCommandTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommandTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.CommandTemplate deleteCommandTemplate(cmd.DeleteCommandTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommandTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    public cmd.ExecuteResponse execute(cmd.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.CancelResponse cancel(cmd.CancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.ExecuteResponse retry(cmd.RetryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetryMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.DryRunResult dryRun(cmd.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDryRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streaming logs
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, cmd.CommandLog>
        subscribeLogs(cmd.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getSubscribeLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CommandService.
   */
  public static final class CommandServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommandServiceBlockingStub> {
    private CommandServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Group management
     * </pre>
     */
    public cmd.Group createGroup(cmd.Group request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Group deleteGroup(cmd.GroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupRequest addUserToGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupRequest removeUserFromGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserFromGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public cmd.CommandTemplate addCommandTemplate(cmd.AddCommandTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommandTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.CommandTemplate deleteCommandTemplate(cmd.DeleteCommandTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommandTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    public cmd.ExecuteResponse execute(cmd.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.CancelResponse cancel(cmd.CancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.ExecuteResponse retry(cmd.RetryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetryMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.DryRunResult dryRun(cmd.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDryRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streaming logs
     * </pre>
     */
    public java.util.Iterator<cmd.CommandLog> subscribeLogs(
        cmd.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommandService.
   */
  public static final class CommandServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommandServiceFutureStub> {
    private CommandServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Group management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Group> createGroup(
        cmd.Group request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Group> deleteGroup(
        cmd.GroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.UserGroupRequest> addUserToGroup(
        cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserToGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.UserGroupRequest> removeUserFromGroup(
        cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserFromGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.CommandTemplate> addCommandTemplate(
        cmd.AddCommandTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCommandTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.CommandTemplate> deleteCommandTemplate(
        cmd.DeleteCommandTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommandTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.ExecuteResponse> execute(
        cmd.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.CancelResponse> cancel(
        cmd.CancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.ExecuteResponse> retry(
        cmd.RetryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.DryRunResult> dryRun(
        cmd.ExecuteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDryRunMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GROUP = 0;
  private static final int METHODID_DELETE_GROUP = 1;
  private static final int METHODID_ADD_USER_TO_GROUP = 2;
  private static final int METHODID_REMOVE_USER_FROM_GROUP = 3;
  private static final int METHODID_ADD_COMMAND_TEMPLATE = 4;
  private static final int METHODID_DELETE_COMMAND_TEMPLATE = 5;
  private static final int METHODID_EXECUTE = 6;
  private static final int METHODID_CANCEL = 7;
  private static final int METHODID_RETRY = 8;
  private static final int METHODID_DRY_RUN = 9;
  private static final int METHODID_SUBSCRIBE_LOGS = 10;

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
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((cmd.Group) request,
              (io.grpc.stub.StreamObserver<cmd.Group>) responseObserver);
          break;
        case METHODID_DELETE_GROUP:
          serviceImpl.deleteGroup((cmd.GroupRequest) request,
              (io.grpc.stub.StreamObserver<cmd.Group>) responseObserver);
          break;
        case METHODID_ADD_USER_TO_GROUP:
          serviceImpl.addUserToGroup((cmd.UserGroupRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UserGroupRequest>) responseObserver);
          break;
        case METHODID_REMOVE_USER_FROM_GROUP:
          serviceImpl.removeUserFromGroup((cmd.UserGroupRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UserGroupRequest>) responseObserver);
          break;
        case METHODID_ADD_COMMAND_TEMPLATE:
          serviceImpl.addCommandTemplate((cmd.AddCommandTemplateRequest) request,
              (io.grpc.stub.StreamObserver<cmd.CommandTemplate>) responseObserver);
          break;
        case METHODID_DELETE_COMMAND_TEMPLATE:
          serviceImpl.deleteCommandTemplate((cmd.DeleteCommandTemplateRequest) request,
              (io.grpc.stub.StreamObserver<cmd.CommandTemplate>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((cmd.ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<cmd.ExecuteResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((cmd.CancelRequest) request,
              (io.grpc.stub.StreamObserver<cmd.CancelResponse>) responseObserver);
          break;
        case METHODID_RETRY:
          serviceImpl.retry((cmd.RetryRequest) request,
              (io.grpc.stub.StreamObserver<cmd.ExecuteResponse>) responseObserver);
          break;
        case METHODID_DRY_RUN:
          serviceImpl.dryRun((cmd.ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<cmd.DryRunResult>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_LOGS:
          serviceImpl.subscribeLogs((cmd.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<cmd.CommandLog>) responseObserver);
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
          getCreateGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.Group,
              cmd.Group>(
                service, METHODID_CREATE_GROUP)))
        .addMethod(
          getDeleteGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.GroupRequest,
              cmd.Group>(
                service, METHODID_DELETE_GROUP)))
        .addMethod(
          getAddUserToGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.UserGroupRequest,
              cmd.UserGroupRequest>(
                service, METHODID_ADD_USER_TO_GROUP)))
        .addMethod(
          getRemoveUserFromGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.UserGroupRequest,
              cmd.UserGroupRequest>(
                service, METHODID_REMOVE_USER_FROM_GROUP)))
        .addMethod(
          getAddCommandTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.AddCommandTemplateRequest,
              cmd.CommandTemplate>(
                service, METHODID_ADD_COMMAND_TEMPLATE)))
        .addMethod(
          getDeleteCommandTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.DeleteCommandTemplateRequest,
              cmd.CommandTemplate>(
                service, METHODID_DELETE_COMMAND_TEMPLATE)))
        .addMethod(
          getExecuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.ExecuteRequest,
              cmd.ExecuteResponse>(
                service, METHODID_EXECUTE)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.CancelRequest,
              cmd.CancelResponse>(
                service, METHODID_CANCEL)))
        .addMethod(
          getRetryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.RetryRequest,
              cmd.ExecuteResponse>(
                service, METHODID_RETRY)))
        .addMethod(
          getDryRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.ExecuteRequest,
              cmd.DryRunResult>(
                service, METHODID_DRY_RUN)))
        .addMethod(
          getSubscribeLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              cmd.SubscribeRequest,
              cmd.CommandLog>(
                service, METHODID_SUBSCRIBE_LOGS)))
        .build();
  }

  private static abstract class CommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cmd.Command.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommandService");
    }
  }

  private static final class CommandServiceFileDescriptorSupplier
      extends CommandServiceBaseDescriptorSupplier {
    CommandServiceFileDescriptorSupplier() {}
  }

  private static final class CommandServiceMethodDescriptorSupplier
      extends CommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CommandServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CommandServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommandServiceFileDescriptorSupplier())
              .addMethod(getCreateGroupMethod())
              .addMethod(getDeleteGroupMethod())
              .addMethod(getAddUserToGroupMethod())
              .addMethod(getRemoveUserFromGroupMethod())
              .addMethod(getAddCommandTemplateMethod())
              .addMethod(getDeleteCommandTemplateMethod())
              .addMethod(getExecuteMethod())
              .addMethod(getCancelMethod())
              .addMethod(getRetryMethod())
              .addMethod(getDryRunMethod())
              .addMethod(getSubscribeLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
