// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cmd.proto

package cmd;

public interface CommandEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cmd.CommandEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 execution_id = 1;</code>
   * @return The executionId.
   */
  long getExecutionId();

  /**
   * <code>map&lt;string, string&gt; effective_parameters = 2;</code>
   */
  int getEffectiveParametersCount();
  /**
   * <code>map&lt;string, string&gt; effective_parameters = 2;</code>
   */
  boolean containsEffectiveParameters(
      java.lang.String key);
  /**
   * Use {@link #getEffectiveParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEffectiveParameters();
  /**
   * <code>map&lt;string, string&gt; effective_parameters = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEffectiveParametersMap();
  /**
   * <code>map&lt;string, string&gt; effective_parameters = 2;</code>
   */

  java.lang.String getEffectiveParametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; effective_parameters = 2;</code>
   */

  java.lang.String getEffectiveParametersOrThrow(
      java.lang.String key);

  /**
   * <code>uint64 timestamp = 3;</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
