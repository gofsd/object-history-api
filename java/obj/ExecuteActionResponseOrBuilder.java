// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object.proto

package obj;

public interface ExecuteActionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:object.ExecuteActionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint64 object_id = 1;</code>
   * @return A list containing the objectId.
   */
  java.util.List<java.lang.Long> getObjectIdList();
  /**
   * <code>repeated uint64 object_id = 1;</code>
   * @return The count of objectId.
   */
  int getObjectIdCount();
  /**
   * <code>repeated uint64 object_id = 1;</code>
   * @param index The index of the element to return.
   * @return The objectId at the given index.
   */
  long getObjectId(int index);

  /**
   * <code>uint32 total_count = 2;</code>
   * @return The totalCount.
   */
  int getTotalCount();
}
