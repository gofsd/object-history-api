// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object.proto

package obj;

public final class Obj {
  private Obj() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_Object_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_Object_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_Object_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_Object_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_CreateObjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_CreateObjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_CreateObjectRequest_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_CreateObjectRequest_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_GetObjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_GetObjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_UpdateObjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_UpdateObjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_UpdateObjectRequest_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_UpdateObjectRequest_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_DeleteObjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_DeleteObjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_ObjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_ObjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_ListObjectsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_ListObjectsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_ListObjectsRequest_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_ListObjectsRequest_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_object_ListObjectsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_object_ListObjectsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014object.proto\022\006object\"\222\001\n\006Object\022\n\n\002id\030" +
      "\001 \001(\004\022\020\n\010owner_id\030\002 \001(\004\022\017\n\007version\030\003 \001(\004" +
      "\022*\n\006fields\030\004 \003(\0132\032.object.Object.FieldsE" +
      "ntry\032-\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\217\001\n\023CreateObjectRequest\022\020\n\010o" +
      "wner_id\030\001 \001(\004\0227\n\006fields\030\002 \003(\0132\'.object.C" +
      "reateObjectRequest.FieldsEntry\032-\n\013Fields" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"%\n" +
      "\020GetObjectRequest\022\021\n\tobject_id\030\001 \001(\004\"\242\001\n" +
      "\023UpdateObjectRequest\022\021\n\tobject_id\030\001 \001(\004\022" +
      "\020\n\010owner_id\030\002 \001(\004\0227\n\006fields\030\003 \003(\0132\'.obje" +
      "ct.UpdateObjectRequest.FieldsEntry\032-\n\013Fi" +
      "eldsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"(\n\023DeleteObjectRequest\022\021\n\tobject_id\030\001 " +
      "\001(\004\"0\n\016ObjectResponse\022\036\n\006object\030\001 \001(\0132\016." +
      "object.Object\"\252\001\n\022ListObjectsRequest\022\020\n\010" +
      "owner_id\030\001 \001(\004\022\014\n\004page\030\002 \001(\r\022\r\n\005limit\030\003 " +
      "\001(\r\0226\n\006fields\030\004 \003(\0132&.object.ListObjects" +
      "Request.FieldsEntry\032-\n\013FieldsEntry\022\013\n\003ke" +
      "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"K\n\023ListObject" +
      "sResponse\022\037\n\007objects\030\001 \003(\0132\016.object.Obje" +
      "ct\022\023\n\013total_count\030\002 \001(\r2\345\002\n\rObjectServic" +
      "e\022C\n\014CreateObject\022\033.object.CreateObjectR" +
      "equest\032\026.object.ObjectResponse\022=\n\tGetObj" +
      "ect\022\030.object.GetObjectRequest\032\026.object.O" +
      "bjectResponse\022C\n\014UpdateObject\022\033.object.U" +
      "pdateObjectRequest\032\026.object.ObjectRespon" +
      "se\022C\n\014DeleteObject\022\033.object.DeleteObject" +
      "Request\032\026.object.ObjectResponse\022F\n\013ListO" +
      "bjects\022\032.object.ListObjectsRequest\032\033.obj" +
      "ect.ListObjectsResponseB \n\003objB\003ObjP\001Z\014o" +
      "bject/proto\242\002\003OBJb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_object_Object_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_object_Object_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_Object_descriptor,
        new java.lang.String[] { "Id", "OwnerId", "Version", "Fields", });
    internal_static_object_Object_FieldsEntry_descriptor =
      internal_static_object_Object_descriptor.getNestedTypes().get(0);
    internal_static_object_Object_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_Object_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_object_CreateObjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_object_CreateObjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_CreateObjectRequest_descriptor,
        new java.lang.String[] { "OwnerId", "Fields", });
    internal_static_object_CreateObjectRequest_FieldsEntry_descriptor =
      internal_static_object_CreateObjectRequest_descriptor.getNestedTypes().get(0);
    internal_static_object_CreateObjectRequest_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_CreateObjectRequest_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_object_GetObjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_object_GetObjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_GetObjectRequest_descriptor,
        new java.lang.String[] { "ObjectId", });
    internal_static_object_UpdateObjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_object_UpdateObjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_UpdateObjectRequest_descriptor,
        new java.lang.String[] { "ObjectId", "OwnerId", "Fields", });
    internal_static_object_UpdateObjectRequest_FieldsEntry_descriptor =
      internal_static_object_UpdateObjectRequest_descriptor.getNestedTypes().get(0);
    internal_static_object_UpdateObjectRequest_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_UpdateObjectRequest_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_object_DeleteObjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_object_DeleteObjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_DeleteObjectRequest_descriptor,
        new java.lang.String[] { "ObjectId", });
    internal_static_object_ObjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_object_ObjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_ObjectResponse_descriptor,
        new java.lang.String[] { "Object", });
    internal_static_object_ListObjectsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_object_ListObjectsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_ListObjectsRequest_descriptor,
        new java.lang.String[] { "OwnerId", "Page", "Limit", "Fields", });
    internal_static_object_ListObjectsRequest_FieldsEntry_descriptor =
      internal_static_object_ListObjectsRequest_descriptor.getNestedTypes().get(0);
    internal_static_object_ListObjectsRequest_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_ListObjectsRequest_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_object_ListObjectsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_object_ListObjectsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_object_ListObjectsResponse_descriptor,
        new java.lang.String[] { "Objects", "TotalCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
