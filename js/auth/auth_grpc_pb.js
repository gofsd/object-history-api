// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var auth_auth_pb = require('../auth/auth_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');

function serialize_auth_AppInfoResponse(arg) {
  if (!(arg instanceof auth_auth_pb.AppInfoResponse)) {
    throw new Error('Expected argument of type auth.AppInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_AppInfoResponse(buffer_arg) {
  return auth_auth_pb.AppInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_LinkDeviceRequest(arg) {
  if (!(arg instanceof auth_auth_pb.LinkDeviceRequest)) {
    throw new Error('Expected argument of type auth.LinkDeviceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_LinkDeviceRequest(buffer_arg) {
  return auth_auth_pb.LinkDeviceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_LoginRequest(arg) {
  if (!(arg instanceof auth_auth_pb.LoginRequest)) {
    throw new Error('Expected argument of type auth.LoginRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_LoginRequest(buffer_arg) {
  return auth_auth_pb.LoginRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_LoginResponse(arg) {
  if (!(arg instanceof auth_auth_pb.LoginResponse)) {
    throw new Error('Expected argument of type auth.LoginResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_LoginResponse(buffer_arg) {
  return auth_auth_pb.LoginResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_RegisterRequest(arg) {
  if (!(arg instanceof auth_auth_pb.RegisterRequest)) {
    throw new Error('Expected argument of type auth.RegisterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_RegisterRequest(buffer_arg) {
  return auth_auth_pb.RegisterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_RegisterResponse(arg) {
  if (!(arg instanceof auth_auth_pb.RegisterResponse)) {
    throw new Error('Expected argument of type auth.RegisterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_RegisterResponse(buffer_arg) {
  return auth_auth_pb.RegisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_SignalRequest(arg) {
  if (!(arg instanceof auth_auth_pb.SignalRequest)) {
    throw new Error('Expected argument of type auth.SignalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_SignalRequest(buffer_arg) {
  return auth_auth_pb.SignalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_SignalResponse(arg) {
  if (!(arg instanceof auth_auth_pb.SignalResponse)) {
    throw new Error('Expected argument of type auth.SignalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_SignalResponse(buffer_arg) {
  return auth_auth_pb.SignalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auth_UserInfoResponse(arg) {
  if (!(arg instanceof auth_auth_pb.UserInfoResponse)) {
    throw new Error('Expected argument of type auth.UserInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auth_UserInfoResponse(buffer_arg) {
  return auth_auth_pb.UserInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}


// ------------------- SERVICE -------------------
var AuthServiceService = exports.AuthServiceService = {
  register: {
    path: '/auth.AuthService/Register',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.RegisterRequest,
    responseType: auth_auth_pb.RegisterResponse,
    requestSerialize: serialize_auth_RegisterRequest,
    requestDeserialize: deserialize_auth_RegisterRequest,
    responseSerialize: serialize_auth_RegisterResponse,
    responseDeserialize: deserialize_auth_RegisterResponse,
  },
  login: {
    path: '/auth.AuthService/Login',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.LoginRequest,
    responseType: auth_auth_pb.LoginResponse,
    requestSerialize: serialize_auth_LoginRequest,
    requestDeserialize: deserialize_auth_LoginRequest,
    responseSerialize: serialize_auth_LoginResponse,
    responseDeserialize: deserialize_auth_LoginResponse,
  },
  linkDevice: {
    path: '/auth.AuthService/LinkDevice',
    requestStream: false,
    responseStream: false,
    requestType: auth_auth_pb.LinkDeviceRequest,
    responseType: auth_auth_pb.LoginResponse,
    requestSerialize: serialize_auth_LinkDeviceRequest,
    requestDeserialize: deserialize_auth_LinkDeviceRequest,
    responseSerialize: serialize_auth_LoginResponse,
    responseDeserialize: deserialize_auth_LoginResponse,
  },
  getAppInfo: {
    path: '/auth.AuthService/GetAppInfo',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: auth_auth_pb.AppInfoResponse,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_auth_AppInfoResponse,
    responseDeserialize: deserialize_auth_AppInfoResponse,
  },
  getUserInfo: {
    path: '/auth.AuthService/GetUserInfo',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: auth_auth_pb.UserInfoResponse,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_auth_UserInfoResponse,
    responseDeserialize: deserialize_auth_UserInfoResponse,
  },
  connect: {
    path: '/auth.AuthService/Connect',
    requestStream: true,
    responseStream: true,
    requestType: auth_auth_pb.SignalRequest,
    responseType: auth_auth_pb.SignalResponse,
    requestSerialize: serialize_auth_SignalRequest,
    requestDeserialize: deserialize_auth_SignalRequest,
    responseSerialize: serialize_auth_SignalResponse,
    responseDeserialize: deserialize_auth_SignalResponse,
  },
};

exports.AuthServiceClient = grpc.makeGenericClientConstructor(AuthServiceService, 'AuthService');
