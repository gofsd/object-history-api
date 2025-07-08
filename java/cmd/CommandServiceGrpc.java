package cmd;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CommandService provides all command and group management operations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: cmd.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommandServiceGrpc {

  private CommandServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cmd.CommandService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cmd.Empty,
      cmd.GroupsResponse> getListGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroups",
      requestType = cmd.Empty.class,
      responseType = cmd.GroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.Empty,
      cmd.GroupsResponse> getListGroupsMethod() {
    io.grpc.MethodDescriptor<cmd.Empty, cmd.GroupsResponse> getListGroupsMethod;
    if ((getListGroupsMethod = CommandServiceGrpc.getListGroupsMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getListGroupsMethod = CommandServiceGrpc.getListGroupsMethod) == null) {
          CommandServiceGrpc.getListGroupsMethod = getListGroupsMethod =
              io.grpc.MethodDescriptor.<cmd.Empty, cmd.GroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.GroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("ListGroups"))
              .build();
        }
      }
    }
    return getListGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.Group,
      cmd.Group> getAddGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGroup",
      requestType = cmd.Group.class,
      responseType = cmd.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.Group,
      cmd.Group> getAddGroupMethod() {
    io.grpc.MethodDescriptor<cmd.Group, cmd.Group> getAddGroupMethod;
    if ((getAddGroupMethod = CommandServiceGrpc.getAddGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddGroupMethod = CommandServiceGrpc.getAddGroupMethod) == null) {
          CommandServiceGrpc.getAddGroupMethod = getAddGroupMethod =
              io.grpc.MethodDescriptor.<cmd.Group, cmd.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Group.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddGroup"))
              .build();
        }
      }
    }
    return getAddGroupMethod;
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
      cmd.UserGroupResponse> getAddUserToGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserToGroup",
      requestType = cmd.UserGroupRequest.class,
      responseType = cmd.UserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupResponse> getAddUserToGroupMethod() {
    io.grpc.MethodDescriptor<cmd.UserGroupRequest, cmd.UserGroupResponse> getAddUserToGroupMethod;
    if ((getAddUserToGroupMethod = CommandServiceGrpc.getAddUserToGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddUserToGroupMethod = CommandServiceGrpc.getAddUserToGroupMethod) == null) {
          CommandServiceGrpc.getAddUserToGroupMethod = getAddUserToGroupMethod =
              io.grpc.MethodDescriptor.<cmd.UserGroupRequest, cmd.UserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserToGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddUserToGroup"))
              .build();
        }
      }
    }
    return getAddUserToGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupResponse> getRemoveUserFromGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserFromGroup",
      requestType = cmd.UserGroupRequest.class,
      responseType = cmd.UserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupResponse> getRemoveUserFromGroupMethod() {
    io.grpc.MethodDescriptor<cmd.UserGroupRequest, cmd.UserGroupResponse> getRemoveUserFromGroupMethod;
    if ((getRemoveUserFromGroupMethod = CommandServiceGrpc.getRemoveUserFromGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getRemoveUserFromGroupMethod = CommandServiceGrpc.getRemoveUserFromGroupMethod) == null) {
          CommandServiceGrpc.getRemoveUserFromGroupMethod = getRemoveUserFromGroupMethod =
              io.grpc.MethodDescriptor.<cmd.UserGroupRequest, cmd.UserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserFromGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("RemoveUserFromGroup"))
              .build();
        }
      }
    }
    return getRemoveUserFromGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.CommandRequest,
      cmd.CommandsResponse> getListCommandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCommands",
      requestType = cmd.CommandRequest.class,
      responseType = cmd.CommandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.CommandRequest,
      cmd.CommandsResponse> getListCommandsMethod() {
    io.grpc.MethodDescriptor<cmd.CommandRequest, cmd.CommandsResponse> getListCommandsMethod;
    if ((getListCommandsMethod = CommandServiceGrpc.getListCommandsMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getListCommandsMethod = CommandServiceGrpc.getListCommandsMethod) == null) {
          CommandServiceGrpc.getListCommandsMethod = getListCommandsMethod =
              io.grpc.MethodDescriptor.<cmd.CommandRequest, cmd.CommandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCommands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("ListCommands"))
              .build();
        }
      }
    }
    return getListCommandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.AddCommandRequest,
      cmd.Command> getAddCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCommand",
      requestType = cmd.AddCommandRequest.class,
      responseType = cmd.Command.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.AddCommandRequest,
      cmd.Command> getAddCommandMethod() {
    io.grpc.MethodDescriptor<cmd.AddCommandRequest, cmd.Command> getAddCommandMethod;
    if ((getAddCommandMethod = CommandServiceGrpc.getAddCommandMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddCommandMethod = CommandServiceGrpc.getAddCommandMethod) == null) {
          CommandServiceGrpc.getAddCommandMethod = getAddCommandMethod =
              io.grpc.MethodDescriptor.<cmd.AddCommandRequest, cmd.Command>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.AddCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Command.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddCommand"))
              .build();
        }
      }
    }
    return getAddCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.CommandRequest,
      cmd.Command> getDeleteCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCommand",
      requestType = cmd.CommandRequest.class,
      responseType = cmd.Command.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.CommandRequest,
      cmd.Command> getDeleteCommandMethod() {
    io.grpc.MethodDescriptor<cmd.CommandRequest, cmd.Command> getDeleteCommandMethod;
    if ((getDeleteCommandMethod = CommandServiceGrpc.getDeleteCommandMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getDeleteCommandMethod = CommandServiceGrpc.getDeleteCommandMethod) == null) {
          CommandServiceGrpc.getDeleteCommandMethod = getDeleteCommandMethod =
              io.grpc.MethodDescriptor.<cmd.CommandRequest, cmd.Command>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Command.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("DeleteCommand"))
              .build();
        }
      }
    }
    return getDeleteCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.AddCommandRequest,
      cmd.UserGroupResponse> getAddCommandToGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCommandToGroup",
      requestType = cmd.AddCommandRequest.class,
      responseType = cmd.UserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.AddCommandRequest,
      cmd.UserGroupResponse> getAddCommandToGroupMethod() {
    io.grpc.MethodDescriptor<cmd.AddCommandRequest, cmd.UserGroupResponse> getAddCommandToGroupMethod;
    if ((getAddCommandToGroupMethod = CommandServiceGrpc.getAddCommandToGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddCommandToGroupMethod = CommandServiceGrpc.getAddCommandToGroupMethod) == null) {
          CommandServiceGrpc.getAddCommandToGroupMethod = getAddCommandToGroupMethod =
              io.grpc.MethodDescriptor.<cmd.AddCommandRequest, cmd.UserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCommandToGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.AddCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddCommandToGroup"))
              .build();
        }
      }
    }
    return getAddCommandToGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupResponse> getDeleteCommandFromGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCommandFromGroup",
      requestType = cmd.UserGroupRequest.class,
      responseType = cmd.UserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.UserGroupRequest,
      cmd.UserGroupResponse> getDeleteCommandFromGroupMethod() {
    io.grpc.MethodDescriptor<cmd.UserGroupRequest, cmd.UserGroupResponse> getDeleteCommandFromGroupMethod;
    if ((getDeleteCommandFromGroupMethod = CommandServiceGrpc.getDeleteCommandFromGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getDeleteCommandFromGroupMethod = CommandServiceGrpc.getDeleteCommandFromGroupMethod) == null) {
          CommandServiceGrpc.getDeleteCommandFromGroupMethod = getDeleteCommandFromGroupMethod =
              io.grpc.MethodDescriptor.<cmd.UserGroupRequest, cmd.UserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCommandFromGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("DeleteCommandFromGroup"))
              .build();
        }
      }
    }
    return getDeleteCommandFromGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.AddObjectsRequest,
      cmd.UserGroupResponse> getAddObjectsToGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddObjectsToGroup",
      requestType = cmd.AddObjectsRequest.class,
      responseType = cmd.UserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.AddObjectsRequest,
      cmd.UserGroupResponse> getAddObjectsToGroupMethod() {
    io.grpc.MethodDescriptor<cmd.AddObjectsRequest, cmd.UserGroupResponse> getAddObjectsToGroupMethod;
    if ((getAddObjectsToGroupMethod = CommandServiceGrpc.getAddObjectsToGroupMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddObjectsToGroupMethod = CommandServiceGrpc.getAddObjectsToGroupMethod) == null) {
          CommandServiceGrpc.getAddObjectsToGroupMethod = getAddObjectsToGroupMethod =
              io.grpc.MethodDescriptor.<cmd.AddObjectsRequest, cmd.UserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddObjectsToGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.AddObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddObjectsToGroup"))
              .build();
        }
      }
    }
    return getAddObjectsToGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.Empty,
      cmd.CommandLog> getListExecutionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExecutions",
      requestType = cmd.Empty.class,
      responseType = cmd.CommandLog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cmd.Empty,
      cmd.CommandLog> getListExecutionsMethod() {
    io.grpc.MethodDescriptor<cmd.Empty, cmd.CommandLog> getListExecutionsMethod;
    if ((getListExecutionsMethod = CommandServiceGrpc.getListExecutionsMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getListExecutionsMethod = CommandServiceGrpc.getListExecutionsMethod) == null) {
          CommandServiceGrpc.getListExecutionsMethod = getListExecutionsMethod =
              io.grpc.MethodDescriptor.<cmd.Empty, cmd.CommandLog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExecutions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandLog.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("ListExecutions"))
              .build();
        }
      }
    }
    return getListExecutionsMethod;
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

  private static volatile io.grpc.MethodDescriptor<cmd.UpdateExecutionStatusRequest,
      cmd.UpdateExecutionStatusResponse> getUpdateExecutionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExecutionStatus",
      requestType = cmd.UpdateExecutionStatusRequest.class,
      responseType = cmd.UpdateExecutionStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.UpdateExecutionStatusRequest,
      cmd.UpdateExecutionStatusResponse> getUpdateExecutionStatusMethod() {
    io.grpc.MethodDescriptor<cmd.UpdateExecutionStatusRequest, cmd.UpdateExecutionStatusResponse> getUpdateExecutionStatusMethod;
    if ((getUpdateExecutionStatusMethod = CommandServiceGrpc.getUpdateExecutionStatusMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getUpdateExecutionStatusMethod = CommandServiceGrpc.getUpdateExecutionStatusMethod) == null) {
          CommandServiceGrpc.getUpdateExecutionStatusMethod = getUpdateExecutionStatusMethod =
              io.grpc.MethodDescriptor.<cmd.UpdateExecutionStatusRequest, cmd.UpdateExecutionStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExecutionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UpdateExecutionStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.UpdateExecutionStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("UpdateExecutionStatus"))
              .build();
        }
      }
    }
    return getUpdateExecutionStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.SubscribeRequest,
      cmd.CommandLog> getSubscribeLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeLogs",
      requestType = cmd.SubscribeRequest.class,
      responseType = cmd.CommandLog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<cmd.SubscribeRequest,
      cmd.CommandLog> getSubscribeLogsMethod() {
    io.grpc.MethodDescriptor<cmd.SubscribeRequest, cmd.CommandLog> getSubscribeLogsMethod;
    if ((getSubscribeLogsMethod = CommandServiceGrpc.getSubscribeLogsMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getSubscribeLogsMethod = CommandServiceGrpc.getSubscribeLogsMethod) == null) {
          CommandServiceGrpc.getSubscribeLogsMethod = getSubscribeLogsMethod =
              io.grpc.MethodDescriptor.<cmd.SubscribeRequest, cmd.CommandLog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
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

  private static volatile io.grpc.MethodDescriptor<cmd.CommandLog,
      cmd.CommandEvent> getSubscribeCommandEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCommandEvents",
      requestType = cmd.CommandLog.class,
      responseType = cmd.CommandEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<cmd.CommandLog,
      cmd.CommandEvent> getSubscribeCommandEventsMethod() {
    io.grpc.MethodDescriptor<cmd.CommandLog, cmd.CommandEvent> getSubscribeCommandEventsMethod;
    if ((getSubscribeCommandEventsMethod = CommandServiceGrpc.getSubscribeCommandEventsMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getSubscribeCommandEventsMethod = CommandServiceGrpc.getSubscribeCommandEventsMethod) == null) {
          CommandServiceGrpc.getSubscribeCommandEventsMethod = getSubscribeCommandEventsMethod =
              io.grpc.MethodDescriptor.<cmd.CommandLog, cmd.CommandEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCommandEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandLog.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.CommandEvent.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("SubscribeCommandEvents"))
              .build();
        }
      }
    }
    return getSubscribeCommandEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.Contact,
      cmd.Contact> getAddMutualContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMutualContact",
      requestType = cmd.Contact.class,
      responseType = cmd.Contact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.Contact,
      cmd.Contact> getAddMutualContactMethod() {
    io.grpc.MethodDescriptor<cmd.Contact, cmd.Contact> getAddMutualContactMethod;
    if ((getAddMutualContactMethod = CommandServiceGrpc.getAddMutualContactMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getAddMutualContactMethod = CommandServiceGrpc.getAddMutualContactMethod) == null) {
          CommandServiceGrpc.getAddMutualContactMethod = getAddMutualContactMethod =
              io.grpc.MethodDescriptor.<cmd.Contact, cmd.Contact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMutualContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Contact.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Contact.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("AddMutualContact"))
              .build();
        }
      }
    }
    return getAddMutualContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.Contact,
      cmd.Contact> getRemoveMutualContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMutualContact",
      requestType = cmd.Contact.class,
      responseType = cmd.Contact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.Contact,
      cmd.Contact> getRemoveMutualContactMethod() {
    io.grpc.MethodDescriptor<cmd.Contact, cmd.Contact> getRemoveMutualContactMethod;
    if ((getRemoveMutualContactMethod = CommandServiceGrpc.getRemoveMutualContactMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getRemoveMutualContactMethod = CommandServiceGrpc.getRemoveMutualContactMethod) == null) {
          CommandServiceGrpc.getRemoveMutualContactMethod = getRemoveMutualContactMethod =
              io.grpc.MethodDescriptor.<cmd.Contact, cmd.Contact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMutualContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Contact.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Contact.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("RemoveMutualContact"))
              .build();
        }
      }
    }
    return getRemoveMutualContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cmd.Empty,
      cmd.Contact> getShowMyContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowMyContact",
      requestType = cmd.Empty.class,
      responseType = cmd.Contact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cmd.Empty,
      cmd.Contact> getShowMyContactMethod() {
    io.grpc.MethodDescriptor<cmd.Empty, cmd.Contact> getShowMyContactMethod;
    if ((getShowMyContactMethod = CommandServiceGrpc.getShowMyContactMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getShowMyContactMethod = CommandServiceGrpc.getShowMyContactMethod) == null) {
          CommandServiceGrpc.getShowMyContactMethod = getShowMyContactMethod =
              io.grpc.MethodDescriptor.<cmd.Empty, cmd.Contact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShowMyContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cmd.Contact.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("ShowMyContact"))
              .build();
        }
      }
    }
    return getShowMyContactMethod;
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
   * <pre>
   * CommandService provides all command and group management operations.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Group management
     * </pre>
     */
    default void listGroups(cmd.Empty request,
        io.grpc.stub.StreamObserver<cmd.GroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGroupsMethod(), responseObserver);
    }

    /**
     */
    default void addGroup(cmd.Group request,
        io.grpc.stub.StreamObserver<cmd.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddGroupMethod(), responseObserver);
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
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserToGroupMethod(), responseObserver);
    }

    /**
     */
    default void removeUserFromGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserFromGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    default void listCommands(cmd.CommandRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCommandsMethod(), responseObserver);
    }

    /**
     */
    default void addCommand(cmd.AddCommandRequest request,
        io.grpc.stub.StreamObserver<cmd.Command> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCommandMethod(), responseObserver);
    }

    /**
     */
    default void deleteCommand(cmd.CommandRequest request,
        io.grpc.stub.StreamObserver<cmd.Command> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommandMethod(), responseObserver);
    }

    /**
     */
    default void addCommandToGroup(cmd.AddCommandRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCommandToGroupMethod(), responseObserver);
    }

    /**
     */
    default void deleteCommandFromGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommandFromGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Object management
     * </pre>
     */
    default void addObjectsToGroup(cmd.AddObjectsRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddObjectsToGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    default void listExecutions(cmd.Empty request,
        io.grpc.stub.StreamObserver<cmd.CommandLog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExecutionsMethod(), responseObserver);
    }

    /**
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
     * Update execution status
     * </pre>
     */
    default void updateExecutionStatus(cmd.UpdateExecutionStatusRequest request,
        io.grpc.stub.StreamObserver<cmd.UpdateExecutionStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExecutionStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streaming logs
     * </pre>
     */
    default io.grpc.stub.StreamObserver<cmd.SubscribeRequest> subscribeLogs(
        io.grpc.stub.StreamObserver<cmd.CommandLog> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscribeLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Event listener for executors
     * </pre>
     */
    default io.grpc.stub.StreamObserver<cmd.CommandLog> subscribeCommandEvents(
        io.grpc.stub.StreamObserver<cmd.CommandEvent> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscribeCommandEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a contact for a user.
     * </pre>
     */
    default void addMutualContact(cmd.Contact request,
        io.grpc.stub.StreamObserver<cmd.Contact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMutualContactMethod(), responseObserver);
    }

    /**
     */
    default void removeMutualContact(cmd.Contact request,
        io.grpc.stub.StreamObserver<cmd.Contact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMutualContactMethod(), responseObserver);
    }

    /**
     */
    default void showMyContact(cmd.Empty request,
        io.grpc.stub.StreamObserver<cmd.Contact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowMyContactMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommandService.
   * <pre>
   * CommandService provides all command and group management operations.
   * </pre>
   */
  public static abstract class CommandServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommandServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommandService.
   * <pre>
   * CommandService provides all command and group management operations.
   * </pre>
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
    public void listGroups(cmd.Empty request,
        io.grpc.stub.StreamObserver<cmd.GroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGroup(cmd.Group request,
        io.grpc.stub.StreamObserver<cmd.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddGroupMethod(), getCallOptions()), request, responseObserver);
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
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserToGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserFromGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserFromGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public void listCommands(cmd.CommandRequest request,
        io.grpc.stub.StreamObserver<cmd.CommandsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCommandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCommand(cmd.AddCommandRequest request,
        io.grpc.stub.StreamObserver<cmd.Command> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCommand(cmd.CommandRequest request,
        io.grpc.stub.StreamObserver<cmd.Command> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCommandToGroup(cmd.AddCommandRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCommandToGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCommandFromGroup(cmd.UserGroupRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommandFromGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Object management
     * </pre>
     */
    public void addObjectsToGroup(cmd.AddObjectsRequest request,
        io.grpc.stub.StreamObserver<cmd.UserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddObjectsToGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    public void listExecutions(cmd.Empty request,
        io.grpc.stub.StreamObserver<cmd.CommandLog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListExecutionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
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
     * Update execution status
     * </pre>
     */
    public void updateExecutionStatus(cmd.UpdateExecutionStatusRequest request,
        io.grpc.stub.StreamObserver<cmd.UpdateExecutionStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExecutionStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streaming logs
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cmd.SubscribeRequest> subscribeLogs(
        io.grpc.stub.StreamObserver<cmd.CommandLog> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeLogsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Event listener for executors
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cmd.CommandLog> subscribeCommandEvents(
        io.grpc.stub.StreamObserver<cmd.CommandEvent> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeCommandEventsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Add a contact for a user.
     * </pre>
     */
    public void addMutualContact(cmd.Contact request,
        io.grpc.stub.StreamObserver<cmd.Contact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMutualContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMutualContact(cmd.Contact request,
        io.grpc.stub.StreamObserver<cmd.Contact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMutualContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showMyContact(cmd.Empty request,
        io.grpc.stub.StreamObserver<cmd.Contact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowMyContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommandService.
   * <pre>
   * CommandService provides all command and group management operations.
   * </pre>
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
    public cmd.GroupsResponse listGroups(cmd.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Group addGroup(cmd.Group request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Group deleteGroup(cmd.GroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse addUserToGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse removeUserFromGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserFromGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public cmd.CommandsResponse listCommands(cmd.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommandsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Command addCommand(cmd.AddCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Command deleteCommand(cmd.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse addCommandToGroup(cmd.AddCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommandToGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse deleteCommandFromGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommandFromGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Object management
     * </pre>
     */
    public cmd.UserGroupResponse addObjectsToGroup(cmd.AddObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddObjectsToGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, cmd.CommandLog>
        listExecutions(cmd.Empty request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getListExecutionsMethod(), getCallOptions(), request);
    }

    /**
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
     * Update execution status
     * </pre>
     */
    public cmd.UpdateExecutionStatusResponse updateExecutionStatus(cmd.UpdateExecutionStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExecutionStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streaming logs
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<cmd.SubscribeRequest, cmd.CommandLog>
        subscribeLogs() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getSubscribeLogsMethod(), getCallOptions());
    }

    /**
     * <pre>
     * Event listener for executors
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<cmd.CommandLog, cmd.CommandEvent>
        subscribeCommandEvents() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getSubscribeCommandEventsMethod(), getCallOptions());
    }

    /**
     * <pre>
     * Add a contact for a user.
     * </pre>
     */
    public cmd.Contact addMutualContact(cmd.Contact request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMutualContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Contact removeMutualContact(cmd.Contact request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMutualContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Contact showMyContact(cmd.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowMyContactMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CommandService.
   * <pre>
   * CommandService provides all command and group management operations.
   * </pre>
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
    public cmd.GroupsResponse listGroups(cmd.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Group addGroup(cmd.Group request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Group deleteGroup(cmd.GroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse addUserToGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse removeUserFromGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserFromGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public cmd.CommandsResponse listCommands(cmd.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCommandsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Command addCommand(cmd.AddCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Command deleteCommand(cmd.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse addCommandToGroup(cmd.AddCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommandToGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.UserGroupResponse deleteCommandFromGroup(cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommandFromGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Object management
     * </pre>
     */
    public cmd.UserGroupResponse addObjectsToGroup(cmd.AddObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddObjectsToGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execution
     * </pre>
     */
    public java.util.Iterator<cmd.CommandLog> listExecutions(
        cmd.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListExecutionsMethod(), getCallOptions(), request);
    }

    /**
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
     * Update execution status
     * </pre>
     */
    public cmd.UpdateExecutionStatusResponse updateExecutionStatus(cmd.UpdateExecutionStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExecutionStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a contact for a user.
     * </pre>
     */
    public cmd.Contact addMutualContact(cmd.Contact request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMutualContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Contact removeMutualContact(cmd.Contact request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMutualContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public cmd.Contact showMyContact(cmd.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowMyContactMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommandService.
   * <pre>
   * CommandService provides all command and group management operations.
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<cmd.GroupsResponse> listGroups(
        cmd.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Group> addGroup(
        cmd.Group request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddGroupMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<cmd.UserGroupResponse> addUserToGroup(
        cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserToGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.UserGroupResponse> removeUserFromGroup(
        cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserFromGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.CommandsResponse> listCommands(
        cmd.CommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCommandsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Command> addCommand(
        cmd.AddCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Command> deleteCommand(
        cmd.CommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.UserGroupResponse> addCommandToGroup(
        cmd.AddCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCommandToGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.UserGroupResponse> deleteCommandFromGroup(
        cmd.UserGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommandFromGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Object management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.UserGroupResponse> addObjectsToGroup(
        cmd.AddObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddObjectsToGroupMethod(), getCallOptions()), request);
    }

    /**
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

    /**
     * <pre>
     * Update execution status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.UpdateExecutionStatusResponse> updateExecutionStatus(
        cmd.UpdateExecutionStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExecutionStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a contact for a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Contact> addMutualContact(
        cmd.Contact request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMutualContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Contact> removeMutualContact(
        cmd.Contact request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMutualContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cmd.Contact> showMyContact(
        cmd.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowMyContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GROUPS = 0;
  private static final int METHODID_ADD_GROUP = 1;
  private static final int METHODID_DELETE_GROUP = 2;
  private static final int METHODID_ADD_USER_TO_GROUP = 3;
  private static final int METHODID_REMOVE_USER_FROM_GROUP = 4;
  private static final int METHODID_LIST_COMMANDS = 5;
  private static final int METHODID_ADD_COMMAND = 6;
  private static final int METHODID_DELETE_COMMAND = 7;
  private static final int METHODID_ADD_COMMAND_TO_GROUP = 8;
  private static final int METHODID_DELETE_COMMAND_FROM_GROUP = 9;
  private static final int METHODID_ADD_OBJECTS_TO_GROUP = 10;
  private static final int METHODID_LIST_EXECUTIONS = 11;
  private static final int METHODID_EXECUTE = 12;
  private static final int METHODID_CANCEL = 13;
  private static final int METHODID_RETRY = 14;
  private static final int METHODID_DRY_RUN = 15;
  private static final int METHODID_UPDATE_EXECUTION_STATUS = 16;
  private static final int METHODID_ADD_MUTUAL_CONTACT = 17;
  private static final int METHODID_REMOVE_MUTUAL_CONTACT = 18;
  private static final int METHODID_SHOW_MY_CONTACT = 19;
  private static final int METHODID_SUBSCRIBE_LOGS = 20;
  private static final int METHODID_SUBSCRIBE_COMMAND_EVENTS = 21;

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
        case METHODID_LIST_GROUPS:
          serviceImpl.listGroups((cmd.Empty) request,
              (io.grpc.stub.StreamObserver<cmd.GroupsResponse>) responseObserver);
          break;
        case METHODID_ADD_GROUP:
          serviceImpl.addGroup((cmd.Group) request,
              (io.grpc.stub.StreamObserver<cmd.Group>) responseObserver);
          break;
        case METHODID_DELETE_GROUP:
          serviceImpl.deleteGroup((cmd.GroupRequest) request,
              (io.grpc.stub.StreamObserver<cmd.Group>) responseObserver);
          break;
        case METHODID_ADD_USER_TO_GROUP:
          serviceImpl.addUserToGroup((cmd.UserGroupRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UserGroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_FROM_GROUP:
          serviceImpl.removeUserFromGroup((cmd.UserGroupRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UserGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_COMMANDS:
          serviceImpl.listCommands((cmd.CommandRequest) request,
              (io.grpc.stub.StreamObserver<cmd.CommandsResponse>) responseObserver);
          break;
        case METHODID_ADD_COMMAND:
          serviceImpl.addCommand((cmd.AddCommandRequest) request,
              (io.grpc.stub.StreamObserver<cmd.Command>) responseObserver);
          break;
        case METHODID_DELETE_COMMAND:
          serviceImpl.deleteCommand((cmd.CommandRequest) request,
              (io.grpc.stub.StreamObserver<cmd.Command>) responseObserver);
          break;
        case METHODID_ADD_COMMAND_TO_GROUP:
          serviceImpl.addCommandToGroup((cmd.AddCommandRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UserGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMMAND_FROM_GROUP:
          serviceImpl.deleteCommandFromGroup((cmd.UserGroupRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UserGroupResponse>) responseObserver);
          break;
        case METHODID_ADD_OBJECTS_TO_GROUP:
          serviceImpl.addObjectsToGroup((cmd.AddObjectsRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UserGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_EXECUTIONS:
          serviceImpl.listExecutions((cmd.Empty) request,
              (io.grpc.stub.StreamObserver<cmd.CommandLog>) responseObserver);
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
        case METHODID_UPDATE_EXECUTION_STATUS:
          serviceImpl.updateExecutionStatus((cmd.UpdateExecutionStatusRequest) request,
              (io.grpc.stub.StreamObserver<cmd.UpdateExecutionStatusResponse>) responseObserver);
          break;
        case METHODID_ADD_MUTUAL_CONTACT:
          serviceImpl.addMutualContact((cmd.Contact) request,
              (io.grpc.stub.StreamObserver<cmd.Contact>) responseObserver);
          break;
        case METHODID_REMOVE_MUTUAL_CONTACT:
          serviceImpl.removeMutualContact((cmd.Contact) request,
              (io.grpc.stub.StreamObserver<cmd.Contact>) responseObserver);
          break;
        case METHODID_SHOW_MY_CONTACT:
          serviceImpl.showMyContact((cmd.Empty) request,
              (io.grpc.stub.StreamObserver<cmd.Contact>) responseObserver);
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
        case METHODID_SUBSCRIBE_LOGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribeLogs(
              (io.grpc.stub.StreamObserver<cmd.CommandLog>) responseObserver);
        case METHODID_SUBSCRIBE_COMMAND_EVENTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribeCommandEvents(
              (io.grpc.stub.StreamObserver<cmd.CommandEvent>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.Empty,
              cmd.GroupsResponse>(
                service, METHODID_LIST_GROUPS)))
        .addMethod(
          getAddGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.Group,
              cmd.Group>(
                service, METHODID_ADD_GROUP)))
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
              cmd.UserGroupResponse>(
                service, METHODID_ADD_USER_TO_GROUP)))
        .addMethod(
          getRemoveUserFromGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.UserGroupRequest,
              cmd.UserGroupResponse>(
                service, METHODID_REMOVE_USER_FROM_GROUP)))
        .addMethod(
          getListCommandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.CommandRequest,
              cmd.CommandsResponse>(
                service, METHODID_LIST_COMMANDS)))
        .addMethod(
          getAddCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.AddCommandRequest,
              cmd.Command>(
                service, METHODID_ADD_COMMAND)))
        .addMethod(
          getDeleteCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.CommandRequest,
              cmd.Command>(
                service, METHODID_DELETE_COMMAND)))
        .addMethod(
          getAddCommandToGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.AddCommandRequest,
              cmd.UserGroupResponse>(
                service, METHODID_ADD_COMMAND_TO_GROUP)))
        .addMethod(
          getDeleteCommandFromGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.UserGroupRequest,
              cmd.UserGroupResponse>(
                service, METHODID_DELETE_COMMAND_FROM_GROUP)))
        .addMethod(
          getAddObjectsToGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.AddObjectsRequest,
              cmd.UserGroupResponse>(
                service, METHODID_ADD_OBJECTS_TO_GROUP)))
        .addMethod(
          getListExecutionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              cmd.Empty,
              cmd.CommandLog>(
                service, METHODID_LIST_EXECUTIONS)))
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
          getUpdateExecutionStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.UpdateExecutionStatusRequest,
              cmd.UpdateExecutionStatusResponse>(
                service, METHODID_UPDATE_EXECUTION_STATUS)))
        .addMethod(
          getSubscribeLogsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              cmd.SubscribeRequest,
              cmd.CommandLog>(
                service, METHODID_SUBSCRIBE_LOGS)))
        .addMethod(
          getSubscribeCommandEventsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              cmd.CommandLog,
              cmd.CommandEvent>(
                service, METHODID_SUBSCRIBE_COMMAND_EVENTS)))
        .addMethod(
          getAddMutualContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.Contact,
              cmd.Contact>(
                service, METHODID_ADD_MUTUAL_CONTACT)))
        .addMethod(
          getRemoveMutualContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.Contact,
              cmd.Contact>(
                service, METHODID_REMOVE_MUTUAL_CONTACT)))
        .addMethod(
          getShowMyContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cmd.Empty,
              cmd.Contact>(
                service, METHODID_SHOW_MY_CONTACT)))
        .build();
  }

  private static abstract class CommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cmd.Cmd.getDescriptor();
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
              .addMethod(getListGroupsMethod())
              .addMethod(getAddGroupMethod())
              .addMethod(getDeleteGroupMethod())
              .addMethod(getAddUserToGroupMethod())
              .addMethod(getRemoveUserFromGroupMethod())
              .addMethod(getListCommandsMethod())
              .addMethod(getAddCommandMethod())
              .addMethod(getDeleteCommandMethod())
              .addMethod(getAddCommandToGroupMethod())
              .addMethod(getDeleteCommandFromGroupMethod())
              .addMethod(getAddObjectsToGroupMethod())
              .addMethod(getListExecutionsMethod())
              .addMethod(getExecuteMethod())
              .addMethod(getCancelMethod())
              .addMethod(getRetryMethod())
              .addMethod(getDryRunMethod())
              .addMethod(getUpdateExecutionStatusMethod())
              .addMethod(getSubscribeLogsMethod())
              .addMethod(getSubscribeCommandEventsMethod())
              .addMethod(getAddMutualContactMethod())
              .addMethod(getRemoveMutualContactMethod())
              .addMethod(getShowMyContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
