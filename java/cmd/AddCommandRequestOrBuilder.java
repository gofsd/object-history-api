// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cmd.proto

package cmd;

public interface AddCommandRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cmd.AddCommandRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cmd.ParameterField fields = 1;</code>
   */
  java.util.List<cmd.ParameterField> 
      getFieldsList();
  /**
   * <code>repeated .cmd.ParameterField fields = 1;</code>
   */
  cmd.ParameterField getFields(int index);
  /**
   * <code>repeated .cmd.ParameterField fields = 1;</code>
   */
  int getFieldsCount();
  /**
   * <code>repeated .cmd.ParameterField fields = 1;</code>
   */
  java.util.List<? extends cmd.ParameterFieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <code>repeated .cmd.ParameterField fields = 1;</code>
   */
  cmd.ParameterFieldOrBuilder getFieldsOrBuilder(
      int index);
}
