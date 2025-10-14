// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var object_object_pb = require('../object/object_pb.js');

function serialize_object_CreateObjectRequest(arg) {
  if (!(arg instanceof object_object_pb.CreateObjectRequest)) {
    throw new Error('Expected argument of type object.CreateObjectRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_CreateObjectRequest(buffer_arg) {
  return object_object_pb.CreateObjectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_CreateObjectsRequest(arg) {
  if (!(arg instanceof object_object_pb.CreateObjectsRequest)) {
    throw new Error('Expected argument of type object.CreateObjectsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_CreateObjectsRequest(buffer_arg) {
  return object_object_pb.CreateObjectsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_CreateObjectsUniqueRequest(arg) {
  if (!(arg instanceof object_object_pb.CreateObjectsUniqueRequest)) {
    throw new Error('Expected argument of type object.CreateObjectsUniqueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_CreateObjectsUniqueRequest(buffer_arg) {
  return object_object_pb.CreateObjectsUniqueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_DeleteObjectsFieldsRequest(arg) {
  if (!(arg instanceof object_object_pb.DeleteObjectsFieldsRequest)) {
    throw new Error('Expected argument of type object.DeleteObjectsFieldsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_DeleteObjectsFieldsRequest(buffer_arg) {
  return object_object_pb.DeleteObjectsFieldsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_DiffByUsers(arg) {
  if (!(arg instanceof object_object_pb.DiffByUsers)) {
    throw new Error('Expected argument of type object.DiffByUsers');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_DiffByUsers(buffer_arg) {
  return object_object_pb.DiffByUsers.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_Empty(arg) {
  if (!(arg instanceof object_object_pb.Empty)) {
    throw new Error('Expected argument of type object.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_Empty(buffer_arg) {
  return object_object_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ExecuteActionRequest(arg) {
  if (!(arg instanceof object_object_pb.ExecuteActionRequest)) {
    throw new Error('Expected argument of type object.ExecuteActionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ExecuteActionRequest(buffer_arg) {
  return object_object_pb.ExecuteActionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ExecuteActionResponse(arg) {
  if (!(arg instanceof object_object_pb.ExecuteActionResponse)) {
    throw new Error('Expected argument of type object.ExecuteActionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ExecuteActionResponse(buffer_arg) {
  return object_object_pb.ExecuteActionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ExecuteActionsRequest(arg) {
  if (!(arg instanceof object_object_pb.ExecuteActionsRequest)) {
    throw new Error('Expected argument of type object.ExecuteActionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ExecuteActionsRequest(buffer_arg) {
  return object_object_pb.ExecuteActionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_GetObjectRequest(arg) {
  if (!(arg instanceof object_object_pb.GetObjectRequest)) {
    throw new Error('Expected argument of type object.GetObjectRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_GetObjectRequest(buffer_arg) {
  return object_object_pb.GetObjectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_GetObjectsRequest(arg) {
  if (!(arg instanceof object_object_pb.GetObjectsRequest)) {
    throw new Error('Expected argument of type object.GetObjectsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_GetObjectsRequest(buffer_arg) {
  return object_object_pb.GetObjectsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ListObjectsRequest(arg) {
  if (!(arg instanceof object_object_pb.ListObjectsRequest)) {
    throw new Error('Expected argument of type object.ListObjectsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ListObjectsRequest(buffer_arg) {
  return object_object_pb.ListObjectsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ListObjectsResponse(arg) {
  if (!(arg instanceof object_object_pb.ListObjectsResponse)) {
    throw new Error('Expected argument of type object.ListObjectsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ListObjectsResponse(buffer_arg) {
  return object_object_pb.ListObjectsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_Object(arg) {
  if (!(arg instanceof object_object_pb.Object)) {
    throw new Error('Expected argument of type object.Object');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_Object(buffer_arg) {
  return object_object_pb.Object.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ObjectActions(arg) {
  if (!(arg instanceof object_object_pb.ObjectActions)) {
    throw new Error('Expected argument of type object.ObjectActions');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ObjectActions(buffer_arg) {
  return object_object_pb.ObjectActions.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ObjectResponse(arg) {
  if (!(arg instanceof object_object_pb.ObjectResponse)) {
    throw new Error('Expected argument of type object.ObjectResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ObjectResponse(buffer_arg) {
  return object_object_pb.ObjectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ObjectsResponse(arg) {
  if (!(arg instanceof object_object_pb.ObjectsResponse)) {
    throw new Error('Expected argument of type object.ObjectsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ObjectsResponse(buffer_arg) {
  return object_object_pb.ObjectsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_ReceiveObjectsResponse(arg) {
  if (!(arg instanceof object_object_pb.ReceiveObjectsResponse)) {
    throw new Error('Expected argument of type object.ReceiveObjectsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_ReceiveObjectsResponse(buffer_arg) {
  return object_object_pb.ReceiveObjectsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_SubscriptionResponse(arg) {
  if (!(arg instanceof object_object_pb.SubscriptionResponse)) {
    throw new Error('Expected argument of type object.SubscriptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_SubscriptionResponse(buffer_arg) {
  return object_object_pb.SubscriptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_TransferObjectsRequest(arg) {
  if (!(arg instanceof object_object_pb.TransferObjectsRequest)) {
    throw new Error('Expected argument of type object.TransferObjectsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_TransferObjectsRequest(buffer_arg) {
  return object_object_pb.TransferObjectsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_TransferObjectsResponse(arg) {
  if (!(arg instanceof object_object_pb.TransferObjectsResponse)) {
    throw new Error('Expected argument of type object.TransferObjectsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_TransferObjectsResponse(buffer_arg) {
  return object_object_pb.TransferObjectsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_UpdateObjectRequest(arg) {
  if (!(arg instanceof object_object_pb.UpdateObjectRequest)) {
    throw new Error('Expected argument of type object.UpdateObjectRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_UpdateObjectRequest(buffer_arg) {
  return object_object_pb.UpdateObjectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_UpdateObjectsRequest(arg) {
  if (!(arg instanceof object_object_pb.UpdateObjectsRequest)) {
    throw new Error('Expected argument of type object.UpdateObjectsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_UpdateObjectsRequest(buffer_arg) {
  return object_object_pb.UpdateObjectsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_object_UpdateObjectsUniqueRequest(arg) {
  if (!(arg instanceof object_object_pb.UpdateObjectsUniqueRequest)) {
    throw new Error('Expected argument of type object.UpdateObjectsUniqueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_object_UpdateObjectsUniqueRequest(buffer_arg) {
  return object_object_pb.UpdateObjectsUniqueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


// ------------------- SERVICE -------------------
var ObjectServiceService = exports.ObjectServiceService = {
  // CRUD
createObject: {
    path: '/object.ObjectService/CreateObject',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.CreateObjectRequest,
    responseType: object_object_pb.ObjectResponse,
    requestSerialize: serialize_object_CreateObjectRequest,
    requestDeserialize: deserialize_object_CreateObjectRequest,
    responseSerialize: serialize_object_ObjectResponse,
    responseDeserialize: deserialize_object_ObjectResponse,
  },
  getObject: {
    path: '/object.ObjectService/GetObject',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.GetObjectRequest,
    responseType: object_object_pb.ObjectResponse,
    requestSerialize: serialize_object_GetObjectRequest,
    requestDeserialize: deserialize_object_GetObjectRequest,
    responseSerialize: serialize_object_ObjectResponse,
    responseDeserialize: deserialize_object_ObjectResponse,
  },
  updateObject: {
    path: '/object.ObjectService/UpdateObject',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.UpdateObjectRequest,
    responseType: object_object_pb.ObjectResponse,
    requestSerialize: serialize_object_UpdateObjectRequest,
    requestDeserialize: deserialize_object_UpdateObjectRequest,
    responseSerialize: serialize_object_ObjectResponse,
    responseDeserialize: deserialize_object_ObjectResponse,
  },
  deleteObjectField: {
    path: '/object.ObjectService/DeleteObjectField',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.DeleteObjectsFieldsRequest,
    responseType: object_object_pb.ObjectResponse,
    requestSerialize: serialize_object_DeleteObjectsFieldsRequest,
    requestDeserialize: deserialize_object_DeleteObjectsFieldsRequest,
    responseSerialize: serialize_object_ObjectResponse,
    responseDeserialize: deserialize_object_ObjectResponse,
  },
  // Batch/Unique
createObjects: {
    path: '/object.ObjectService/CreateObjects',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.CreateObjectsRequest,
    responseType: object_object_pb.ObjectsResponse,
    requestSerialize: serialize_object_CreateObjectsRequest,
    requestDeserialize: deserialize_object_CreateObjectsRequest,
    responseSerialize: serialize_object_ObjectsResponse,
    responseDeserialize: deserialize_object_ObjectsResponse,
  },
  getObjects: {
    path: '/object.ObjectService/GetObjects',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.GetObjectsRequest,
    responseType: object_object_pb.ObjectsResponse,
    requestSerialize: serialize_object_GetObjectsRequest,
    requestDeserialize: deserialize_object_GetObjectsRequest,
    responseSerialize: serialize_object_ObjectsResponse,
    responseDeserialize: deserialize_object_ObjectsResponse,
  },
  updateObjects: {
    path: '/object.ObjectService/UpdateObjects',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.UpdateObjectsRequest,
    responseType: object_object_pb.ObjectsResponse,
    requestSerialize: serialize_object_UpdateObjectsRequest,
    requestDeserialize: deserialize_object_UpdateObjectsRequest,
    responseSerialize: serialize_object_ObjectsResponse,
    responseDeserialize: deserialize_object_ObjectsResponse,
  },
  createObjectsUnique: {
    path: '/object.ObjectService/CreateObjectsUnique',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.CreateObjectsUniqueRequest,
    responseType: object_object_pb.ObjectsResponse,
    requestSerialize: serialize_object_CreateObjectsUniqueRequest,
    requestDeserialize: deserialize_object_CreateObjectsUniqueRequest,
    responseSerialize: serialize_object_ObjectsResponse,
    responseDeserialize: deserialize_object_ObjectsResponse,
  },
  updateObjectsUnique: {
    path: '/object.ObjectService/UpdateObjectsUnique',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.UpdateObjectsUniqueRequest,
    responseType: object_object_pb.ObjectsResponse,
    requestSerialize: serialize_object_UpdateObjectsUniqueRequest,
    requestDeserialize: deserialize_object_UpdateObjectsUniqueRequest,
    responseSerialize: serialize_object_ObjectsResponse,
    responseDeserialize: deserialize_object_ObjectsResponse,
  },
  // List & Pagination
listObjects: {
    path: '/object.ObjectService/ListObjects',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.ListObjectsRequest,
    responseType: object_object_pb.ListObjectsResponse,
    requestSerialize: serialize_object_ListObjectsRequest,
    requestDeserialize: deserialize_object_ListObjectsRequest,
    responseSerialize: serialize_object_ListObjectsResponse,
    responseDeserialize: deserialize_object_ListObjectsResponse,
  },
  // Action/Transfer
executeAction: {
    path: '/object.ObjectService/ExecuteAction',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.ExecuteActionRequest,
    responseType: object_object_pb.ExecuteActionResponse,
    requestSerialize: serialize_object_ExecuteActionRequest,
    requestDeserialize: deserialize_object_ExecuteActionRequest,
    responseSerialize: serialize_object_ExecuteActionResponse,
    responseDeserialize: deserialize_object_ExecuteActionResponse,
  },
  executeActions: {
    path: '/object.ObjectService/ExecuteActions',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.ExecuteActionsRequest,
    responseType: object_object_pb.ExecuteActionResponse,
    requestSerialize: serialize_object_ExecuteActionsRequest,
    requestDeserialize: deserialize_object_ExecuteActionsRequest,
    responseSerialize: serialize_object_ExecuteActionResponse,
    responseDeserialize: deserialize_object_ExecuteActionResponse,
  },
  transferObjects: {
    path: '/object.ObjectService/TransferObjects',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.TransferObjectsRequest,
    responseType: object_object_pb.TransferObjectsResponse,
    requestSerialize: serialize_object_TransferObjectsRequest,
    requestDeserialize: deserialize_object_TransferObjectsRequest,
    responseSerialize: serialize_object_TransferObjectsResponse,
    responseDeserialize: deserialize_object_TransferObjectsResponse,
  },
  receiveObjects: {
    path: '/object.ObjectService/ReceiveObjects',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.TransferObjectsResponse,
    responseType: object_object_pb.ReceiveObjectsResponse,
    requestSerialize: serialize_object_TransferObjectsResponse,
    requestDeserialize: deserialize_object_TransferObjectsResponse,
    responseSerialize: serialize_object_ReceiveObjectsResponse,
    responseDeserialize: deserialize_object_ReceiveObjectsResponse,
  },
  // Streaming/Subscription
subscribeToUsersObjects: {
    path: '/object.ObjectService/SubscribeToUsersObjects',
    requestStream: false,
    responseStream: true,
    requestType: object_object_pb.Empty,
    responseType: object_object_pb.SubscriptionResponse,
    requestSerialize: serialize_object_Empty,
    requestDeserialize: deserialize_object_Empty,
    responseSerialize: serialize_object_SubscriptionResponse,
    responseDeserialize: deserialize_object_SubscriptionResponse,
  },
  subscribeToMyself: {
    path: '/object.ObjectService/SubscribeToMyself',
    requestStream: false,
    responseStream: true,
    requestType: object_object_pb.Empty,
    responseType: object_object_pb.Object,
    requestSerialize: serialize_object_Empty,
    requestDeserialize: deserialize_object_Empty,
    responseSerialize: serialize_object_Object,
    responseDeserialize: deserialize_object_Object,
  },
  syncWithUsers: {
    path: '/object.ObjectService/SyncWithUsers',
    requestStream: false,
    responseStream: true,
    requestType: object_object_pb.DiffByUsers,
    responseType: object_object_pb.ObjectActions,
    requestSerialize: serialize_object_DiffByUsers,
    requestDeserialize: deserialize_object_DiffByUsers,
    responseSerialize: serialize_object_ObjectActions,
    responseDeserialize: deserialize_object_ObjectActions,
  },
  sync: {
    path: '/object.ObjectService/Sync',
    requestStream: true,
    responseStream: true,
    requestType: object_object_pb.ObjectActions,
    responseType: object_object_pb.ObjectActions,
    requestSerialize: serialize_object_ObjectActions,
    requestDeserialize: deserialize_object_ObjectActions,
    responseSerialize: serialize_object_ObjectActions,
    responseDeserialize: deserialize_object_ObjectActions,
  },
  // Get object commands
getObjectCommands: {
    path: '/object.ObjectService/GetObjectCommands',
    requestStream: false,
    responseStream: false,
    requestType: object_object_pb.GetObjectRequest,
    responseType: object_object_pb.ObjectsResponse,
    requestSerialize: serialize_object_GetObjectRequest,
    requestDeserialize: deserialize_object_GetObjectRequest,
    responseSerialize: serialize_object_ObjectsResponse,
    responseDeserialize: deserialize_object_ObjectsResponse,
  },
};

exports.ObjectServiceClient = grpc.makeGenericClientConstructor(ObjectServiceService, 'ObjectService');
