// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object.proto

package obj;

public interface ExecuteActionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:object.ExecuteActionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 action_id = 1;</code>
   * @return The actionId.
   */
  long getActionId();

  /**
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  int getFieldsCount();
  /**
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFields();
  /**
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFieldsMap();
  /**
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  /* nullable */
java.lang.String getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  java.lang.String getFieldsOrThrow(
      java.lang.String key);
}
