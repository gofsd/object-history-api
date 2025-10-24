// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var cmd_cmd_pb = require('../cmd/cmd_pb.js');

function serialize_cmd_AddCommandRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.AddCommandRequest)) {
    throw new Error('Expected argument of type cmd.AddCommandRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_AddCommandRequest(buffer_arg) {
  return cmd_cmd_pb.AddCommandRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_AddCommandToGroupRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.AddCommandToGroupRequest)) {
    throw new Error('Expected argument of type cmd.AddCommandToGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_AddCommandToGroupRequest(buffer_arg) {
  return cmd_cmd_pb.AddCommandToGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_AddObjectsRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.AddObjectsRequest)) {
    throw new Error('Expected argument of type cmd.AddObjectsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_AddObjectsRequest(buffer_arg) {
  return cmd_cmd_pb.AddObjectsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_CancelRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.CancelRequest)) {
    throw new Error('Expected argument of type cmd.CancelRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_CancelRequest(buffer_arg) {
  return cmd_cmd_pb.CancelRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_CancelResponse(arg) {
  if (!(arg instanceof cmd_cmd_pb.CancelResponse)) {
    throw new Error('Expected argument of type cmd.CancelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_CancelResponse(buffer_arg) {
  return cmd_cmd_pb.CancelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_Command(arg) {
  if (!(arg instanceof cmd_cmd_pb.Command)) {
    throw new Error('Expected argument of type cmd.Command');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_Command(buffer_arg) {
  return cmd_cmd_pb.Command.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_CommandEvent(arg) {
  if (!(arg instanceof cmd_cmd_pb.CommandEvent)) {
    throw new Error('Expected argument of type cmd.CommandEvent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_CommandEvent(buffer_arg) {
  return cmd_cmd_pb.CommandEvent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_CommandLog(arg) {
  if (!(arg instanceof cmd_cmd_pb.CommandLog)) {
    throw new Error('Expected argument of type cmd.CommandLog');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_CommandLog(buffer_arg) {
  return cmd_cmd_pb.CommandLog.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_CommandRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.CommandRequest)) {
    throw new Error('Expected argument of type cmd.CommandRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_CommandRequest(buffer_arg) {
  return cmd_cmd_pb.CommandRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_CommandsResponse(arg) {
  if (!(arg instanceof cmd_cmd_pb.CommandsResponse)) {
    throw new Error('Expected argument of type cmd.CommandsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_CommandsResponse(buffer_arg) {
  return cmd_cmd_pb.CommandsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_Contact(arg) {
  if (!(arg instanceof cmd_cmd_pb.Contact)) {
    throw new Error('Expected argument of type cmd.Contact');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_Contact(buffer_arg) {
  return cmd_cmd_pb.Contact.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_DryRunResult(arg) {
  if (!(arg instanceof cmd_cmd_pb.DryRunResult)) {
    throw new Error('Expected argument of type cmd.DryRunResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_DryRunResult(buffer_arg) {
  return cmd_cmd_pb.DryRunResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_Empty(arg) {
  if (!(arg instanceof cmd_cmd_pb.Empty)) {
    throw new Error('Expected argument of type cmd.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_Empty(buffer_arg) {
  return cmd_cmd_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_ExecuteRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.ExecuteRequest)) {
    throw new Error('Expected argument of type cmd.ExecuteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_ExecuteRequest(buffer_arg) {
  return cmd_cmd_pb.ExecuteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_ExecuteResponse(arg) {
  if (!(arg instanceof cmd_cmd_pb.ExecuteResponse)) {
    throw new Error('Expected argument of type cmd.ExecuteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_ExecuteResponse(buffer_arg) {
  return cmd_cmd_pb.ExecuteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_Group(arg) {
  if (!(arg instanceof cmd_cmd_pb.Group)) {
    throw new Error('Expected argument of type cmd.Group');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_Group(buffer_arg) {
  return cmd_cmd_pb.Group.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_GroupRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.GroupRequest)) {
    throw new Error('Expected argument of type cmd.GroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_GroupRequest(buffer_arg) {
  return cmd_cmd_pb.GroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_GroupsResponse(arg) {
  if (!(arg instanceof cmd_cmd_pb.GroupsResponse)) {
    throw new Error('Expected argument of type cmd.GroupsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_GroupsResponse(buffer_arg) {
  return cmd_cmd_pb.GroupsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_RetryRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.RetryRequest)) {
    throw new Error('Expected argument of type cmd.RetryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_RetryRequest(buffer_arg) {
  return cmd_cmd_pb.RetryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_SubscribeRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.SubscribeRequest)) {
    throw new Error('Expected argument of type cmd.SubscribeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_SubscribeRequest(buffer_arg) {
  return cmd_cmd_pb.SubscribeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_UpdateExecutionStatusRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.UpdateExecutionStatusRequest)) {
    throw new Error('Expected argument of type cmd.UpdateExecutionStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_UpdateExecutionStatusRequest(buffer_arg) {
  return cmd_cmd_pb.UpdateExecutionStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_UpdateExecutionStatusResponse(arg) {
  if (!(arg instanceof cmd_cmd_pb.UpdateExecutionStatusResponse)) {
    throw new Error('Expected argument of type cmd.UpdateExecutionStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_UpdateExecutionStatusResponse(buffer_arg) {
  return cmd_cmd_pb.UpdateExecutionStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_UserGroupRequest(arg) {
  if (!(arg instanceof cmd_cmd_pb.UserGroupRequest)) {
    throw new Error('Expected argument of type cmd.UserGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_UserGroupRequest(buffer_arg) {
  return cmd_cmd_pb.UserGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cmd_UserGroupResponse(arg) {
  if (!(arg instanceof cmd_cmd_pb.UserGroupResponse)) {
    throw new Error('Expected argument of type cmd.UserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cmd_UserGroupResponse(buffer_arg) {
  return cmd_cmd_pb.UserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// CommandService provides all command and group management operations.
var CommandServiceService = exports.CommandServiceService = {
  // Group management
listGroups: {
    path: '/cmd.CommandService/ListGroups',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.Empty,
    responseType: cmd_cmd_pb.GroupsResponse,
    requestSerialize: serialize_cmd_Empty,
    requestDeserialize: deserialize_cmd_Empty,
    responseSerialize: serialize_cmd_GroupsResponse,
    responseDeserialize: deserialize_cmd_GroupsResponse,
  },
  addGroup: {
    path: '/cmd.CommandService/AddGroup',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.Group,
    responseType: cmd_cmd_pb.Group,
    requestSerialize: serialize_cmd_Group,
    requestDeserialize: deserialize_cmd_Group,
    responseSerialize: serialize_cmd_Group,
    responseDeserialize: deserialize_cmd_Group,
  },
  deleteGroup: {
    path: '/cmd.CommandService/DeleteGroup',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.GroupRequest,
    responseType: cmd_cmd_pb.Group,
    requestSerialize: serialize_cmd_GroupRequest,
    requestDeserialize: deserialize_cmd_GroupRequest,
    responseSerialize: serialize_cmd_Group,
    responseDeserialize: deserialize_cmd_Group,
  },
  addUserToGroup: {
    path: '/cmd.CommandService/AddUserToGroup',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.UserGroupRequest,
    responseType: cmd_cmd_pb.UserGroupResponse,
    requestSerialize: serialize_cmd_UserGroupRequest,
    requestDeserialize: deserialize_cmd_UserGroupRequest,
    responseSerialize: serialize_cmd_UserGroupResponse,
    responseDeserialize: deserialize_cmd_UserGroupResponse,
  },
  removeUserFromGroup: {
    path: '/cmd.CommandService/RemoveUserFromGroup',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.UserGroupRequest,
    responseType: cmd_cmd_pb.UserGroupResponse,
    requestSerialize: serialize_cmd_UserGroupRequest,
    requestDeserialize: deserialize_cmd_UserGroupRequest,
    responseSerialize: serialize_cmd_UserGroupResponse,
    responseDeserialize: deserialize_cmd_UserGroupResponse,
  },
  // Template management
listCommands: {
    path: '/cmd.CommandService/ListCommands',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.CommandRequest,
    responseType: cmd_cmd_pb.CommandsResponse,
    requestSerialize: serialize_cmd_CommandRequest,
    requestDeserialize: deserialize_cmd_CommandRequest,
    responseSerialize: serialize_cmd_CommandsResponse,
    responseDeserialize: deserialize_cmd_CommandsResponse,
  },
  addCommand: {
    path: '/cmd.CommandService/AddCommand',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.AddCommandRequest,
    responseType: cmd_cmd_pb.Command,
    requestSerialize: serialize_cmd_AddCommandRequest,
    requestDeserialize: deserialize_cmd_AddCommandRequest,
    responseSerialize: serialize_cmd_Command,
    responseDeserialize: deserialize_cmd_Command,
  },
  deleteCommand: {
    path: '/cmd.CommandService/DeleteCommand',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.CommandRequest,
    responseType: cmd_cmd_pb.Command,
    requestSerialize: serialize_cmd_CommandRequest,
    requestDeserialize: deserialize_cmd_CommandRequest,
    responseSerialize: serialize_cmd_Command,
    responseDeserialize: deserialize_cmd_Command,
  },
  addCommandToGroup: {
    path: '/cmd.CommandService/AddCommandToGroup',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.AddCommandToGroupRequest,
    responseType: cmd_cmd_pb.UserGroupResponse,
    requestSerialize: serialize_cmd_AddCommandToGroupRequest,
    requestDeserialize: deserialize_cmd_AddCommandToGroupRequest,
    responseSerialize: serialize_cmd_UserGroupResponse,
    responseDeserialize: deserialize_cmd_UserGroupResponse,
  },
  deleteCommandFromGroup: {
    path: '/cmd.CommandService/DeleteCommandFromGroup',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.UserGroupRequest,
    responseType: cmd_cmd_pb.UserGroupResponse,
    requestSerialize: serialize_cmd_UserGroupRequest,
    requestDeserialize: deserialize_cmd_UserGroupRequest,
    responseSerialize: serialize_cmd_UserGroupResponse,
    responseDeserialize: deserialize_cmd_UserGroupResponse,
  },
  // Object management
addObjectsToGroup: {
    path: '/cmd.CommandService/AddObjectsToGroup',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.AddObjectsRequest,
    responseType: cmd_cmd_pb.UserGroupResponse,
    requestSerialize: serialize_cmd_AddObjectsRequest,
    requestDeserialize: deserialize_cmd_AddObjectsRequest,
    responseSerialize: serialize_cmd_UserGroupResponse,
    responseDeserialize: deserialize_cmd_UserGroupResponse,
  },
  // Execution
listExecutions: {
    path: '/cmd.CommandService/ListExecutions',
    requestStream: false,
    responseStream: true,
    requestType: cmd_cmd_pb.Empty,
    responseType: cmd_cmd_pb.CommandLog,
    requestSerialize: serialize_cmd_Empty,
    requestDeserialize: deserialize_cmd_Empty,
    responseSerialize: serialize_cmd_CommandLog,
    responseDeserialize: deserialize_cmd_CommandLog,
  },
  execute: {
    path: '/cmd.CommandService/Execute',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.ExecuteRequest,
    responseType: cmd_cmd_pb.ExecuteResponse,
    requestSerialize: serialize_cmd_ExecuteRequest,
    requestDeserialize: deserialize_cmd_ExecuteRequest,
    responseSerialize: serialize_cmd_ExecuteResponse,
    responseDeserialize: deserialize_cmd_ExecuteResponse,
  },
  cancel: {
    path: '/cmd.CommandService/Cancel',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.CancelRequest,
    responseType: cmd_cmd_pb.CancelResponse,
    requestSerialize: serialize_cmd_CancelRequest,
    requestDeserialize: deserialize_cmd_CancelRequest,
    responseSerialize: serialize_cmd_CancelResponse,
    responseDeserialize: deserialize_cmd_CancelResponse,
  },
  retry: {
    path: '/cmd.CommandService/Retry',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.RetryRequest,
    responseType: cmd_cmd_pb.ExecuteResponse,
    requestSerialize: serialize_cmd_RetryRequest,
    requestDeserialize: deserialize_cmd_RetryRequest,
    responseSerialize: serialize_cmd_ExecuteResponse,
    responseDeserialize: deserialize_cmd_ExecuteResponse,
  },
  dryRun: {
    path: '/cmd.CommandService/DryRun',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.ExecuteRequest,
    responseType: cmd_cmd_pb.DryRunResult,
    requestSerialize: serialize_cmd_ExecuteRequest,
    requestDeserialize: deserialize_cmd_ExecuteRequest,
    responseSerialize: serialize_cmd_DryRunResult,
    responseDeserialize: deserialize_cmd_DryRunResult,
  },
  // Update execution status
updateExecutionStatus: {
    path: '/cmd.CommandService/UpdateExecutionStatus',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.UpdateExecutionStatusRequest,
    responseType: cmd_cmd_pb.UpdateExecutionStatusResponse,
    requestSerialize: serialize_cmd_UpdateExecutionStatusRequest,
    requestDeserialize: deserialize_cmd_UpdateExecutionStatusRequest,
    responseSerialize: serialize_cmd_UpdateExecutionStatusResponse,
    responseDeserialize: deserialize_cmd_UpdateExecutionStatusResponse,
  },
  // Streaming logs
subscribeLogs: {
    path: '/cmd.CommandService/SubscribeLogs',
    requestStream: true,
    responseStream: true,
    requestType: cmd_cmd_pb.SubscribeRequest,
    responseType: cmd_cmd_pb.CommandLog,
    requestSerialize: serialize_cmd_SubscribeRequest,
    requestDeserialize: deserialize_cmd_SubscribeRequest,
    responseSerialize: serialize_cmd_CommandLog,
    responseDeserialize: deserialize_cmd_CommandLog,
  },
  // Event listener for executors
subscribeCommandEvents: {
    path: '/cmd.CommandService/SubscribeCommandEvents',
    requestStream: true,
    responseStream: true,
    requestType: cmd_cmd_pb.CommandLog,
    responseType: cmd_cmd_pb.CommandEvent,
    requestSerialize: serialize_cmd_CommandLog,
    requestDeserialize: deserialize_cmd_CommandLog,
    responseSerialize: serialize_cmd_CommandEvent,
    responseDeserialize: deserialize_cmd_CommandEvent,
  },
  // Add a contact for a user.
addMutualContact: {
    path: '/cmd.CommandService/AddMutualContact',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.Contact,
    responseType: cmd_cmd_pb.Contact,
    requestSerialize: serialize_cmd_Contact,
    requestDeserialize: deserialize_cmd_Contact,
    responseSerialize: serialize_cmd_Contact,
    responseDeserialize: deserialize_cmd_Contact,
  },
  removeMutualContact: {
    path: '/cmd.CommandService/RemoveMutualContact',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.Contact,
    responseType: cmd_cmd_pb.Contact,
    requestSerialize: serialize_cmd_Contact,
    requestDeserialize: deserialize_cmd_Contact,
    responseSerialize: serialize_cmd_Contact,
    responseDeserialize: deserialize_cmd_Contact,
  },
  showMyContact: {
    path: '/cmd.CommandService/ShowMyContact',
    requestStream: false,
    responseStream: false,
    requestType: cmd_cmd_pb.Empty,
    responseType: cmd_cmd_pb.Contact,
    requestSerialize: serialize_cmd_Empty,
    requestDeserialize: deserialize_cmd_Empty,
    responseSerialize: serialize_cmd_Contact,
    responseDeserialize: deserialize_cmd_Contact,
  },
};

exports.CommandServiceClient = grpc.makeGenericClientConstructor(CommandServiceService, 'CommandService');
