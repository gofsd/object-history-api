// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cmd.proto

package cmd;

/**
 * <pre>
 * CommandLog represents a log entry for a command execution.
 * </pre>
 *
 * Protobuf type {@code cmd.CommandLog}
 */
public final class CommandLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cmd.CommandLog)
    CommandLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommandLog.newBuilder() to construct.
  private CommandLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommandLog() {
    output_ = "";
    resultCode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommandLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cmd.Cmd.internal_static_cmd_CommandLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cmd.Cmd.internal_static_cmd_CommandLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cmd.CommandLog.class, cmd.CommandLog.Builder.class);
  }

  public static final int EXECUTION_ID_FIELD_NUMBER = 1;
  private long executionId_;
  /**
   * <code>uint64 execution_id = 1;</code>
   * @return The executionId.
   */
  @java.lang.Override
  public long getExecutionId() {
    return executionId_;
  }

  public static final int OUTPUT_FIELD_NUMBER = 2;
  private volatile java.lang.Object output_;
  /**
   * <code>string output = 2;</code>
   * @return The output.
   */
  @java.lang.Override
  public java.lang.String getOutput() {
    java.lang.Object ref = output_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      output_ = s;
      return s;
    }
  }
  /**
   * <code>string output = 2;</code>
   * @return The bytes for output.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputBytes() {
    java.lang.Object ref = output_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      output_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_;
  /**
   * <code>uint64 timestamp = 3;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int RESULT_CODE_FIELD_NUMBER = 4;
  private int resultCode_;
  /**
   * <code>.cmd.ExecutionStatus result_code = 4;</code>
   * @return The enum numeric value on the wire for resultCode.
   */
  @java.lang.Override public int getResultCodeValue() {
    return resultCode_;
  }
  /**
   * <code>.cmd.ExecutionStatus result_code = 4;</code>
   * @return The resultCode.
   */
  @java.lang.Override public cmd.ExecutionStatus getResultCode() {
    @SuppressWarnings("deprecation")
    cmd.ExecutionStatus result = cmd.ExecutionStatus.valueOf(resultCode_);
    return result == null ? cmd.ExecutionStatus.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (executionId_ != 0L) {
      output.writeUInt64(1, executionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(output_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, output_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(3, timestamp_);
    }
    if (resultCode_ != cmd.ExecutionStatus.EXECUTION_STATUS_UNKNOWN.getNumber()) {
      output.writeEnum(4, resultCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (executionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, executionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(output_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, output_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, timestamp_);
    }
    if (resultCode_ != cmd.ExecutionStatus.EXECUTION_STATUS_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, resultCode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cmd.CommandLog)) {
      return super.equals(obj);
    }
    cmd.CommandLog other = (cmd.CommandLog) obj;

    if (getExecutionId()
        != other.getExecutionId()) return false;
    if (!getOutput()
        .equals(other.getOutput())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (resultCode_ != other.resultCode_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EXECUTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExecutionId());
    hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
    hash = (53 * hash) + getOutput().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + RESULT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + resultCode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cmd.CommandLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cmd.CommandLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cmd.CommandLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cmd.CommandLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cmd.CommandLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cmd.CommandLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cmd.CommandLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cmd.CommandLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cmd.CommandLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cmd.CommandLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cmd.CommandLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cmd.CommandLog parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cmd.CommandLog prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * CommandLog represents a log entry for a command execution.
   * </pre>
   *
   * Protobuf type {@code cmd.CommandLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cmd.CommandLog)
      cmd.CommandLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cmd.Cmd.internal_static_cmd_CommandLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cmd.Cmd.internal_static_cmd_CommandLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cmd.CommandLog.class, cmd.CommandLog.Builder.class);
    }

    // Construct using cmd.CommandLog.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      executionId_ = 0L;

      output_ = "";

      timestamp_ = 0L;

      resultCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cmd.Cmd.internal_static_cmd_CommandLog_descriptor;
    }

    @java.lang.Override
    public cmd.CommandLog getDefaultInstanceForType() {
      return cmd.CommandLog.getDefaultInstance();
    }

    @java.lang.Override
    public cmd.CommandLog build() {
      cmd.CommandLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cmd.CommandLog buildPartial() {
      cmd.CommandLog result = new cmd.CommandLog(this);
      result.executionId_ = executionId_;
      result.output_ = output_;
      result.timestamp_ = timestamp_;
      result.resultCode_ = resultCode_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cmd.CommandLog) {
        return mergeFrom((cmd.CommandLog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cmd.CommandLog other) {
      if (other == cmd.CommandLog.getDefaultInstance()) return this;
      if (other.getExecutionId() != 0L) {
        setExecutionId(other.getExecutionId());
      }
      if (!other.getOutput().isEmpty()) {
        output_ = other.output_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.resultCode_ != 0) {
        setResultCodeValue(other.getResultCodeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              executionId_ = input.readUInt64();

              break;
            } // case 8
            case 18: {
              output_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              timestamp_ = input.readUInt64();

              break;
            } // case 24
            case 32: {
              resultCode_ = input.readEnum();

              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private long executionId_ ;
    /**
     * <code>uint64 execution_id = 1;</code>
     * @return The executionId.
     */
    @java.lang.Override
    public long getExecutionId() {
      return executionId_;
    }
    /**
     * <code>uint64 execution_id = 1;</code>
     * @param value The executionId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionId(long value) {
      
      executionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 execution_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutionId() {
      
      executionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object output_ = "";
    /**
     * <code>string output = 2;</code>
     * @return The output.
     */
    public java.lang.String getOutput() {
      java.lang.Object ref = output_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        output_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string output = 2;</code>
     * @return The bytes for output.
     */
    public com.google.protobuf.ByteString
        getOutputBytes() {
      java.lang.Object ref = output_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        output_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string output = 2;</code>
     * @param value The output to set.
     * @return This builder for chaining.
     */
    public Builder setOutput(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      output_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string output = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutput() {
      
      output_ = getDefaultInstance().getOutput();
      onChanged();
      return this;
    }
    /**
     * <code>string output = 2;</code>
     * @param value The bytes for output to set.
     * @return This builder for chaining.
     */
    public Builder setOutputBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      output_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 3;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 3;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private int resultCode_ = 0;
    /**
     * <code>.cmd.ExecutionStatus result_code = 4;</code>
     * @return The enum numeric value on the wire for resultCode.
     */
    @java.lang.Override public int getResultCodeValue() {
      return resultCode_;
    }
    /**
     * <code>.cmd.ExecutionStatus result_code = 4;</code>
     * @param value The enum numeric value on the wire for resultCode to set.
     * @return This builder for chaining.
     */
    public Builder setResultCodeValue(int value) {
      
      resultCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.cmd.ExecutionStatus result_code = 4;</code>
     * @return The resultCode.
     */
    @java.lang.Override
    public cmd.ExecutionStatus getResultCode() {
      @SuppressWarnings("deprecation")
      cmd.ExecutionStatus result = cmd.ExecutionStatus.valueOf(resultCode_);
      return result == null ? cmd.ExecutionStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.cmd.ExecutionStatus result_code = 4;</code>
     * @param value The resultCode to set.
     * @return This builder for chaining.
     */
    public Builder setResultCode(cmd.ExecutionStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      resultCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.cmd.ExecutionStatus result_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultCode() {
      
      resultCode_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cmd.CommandLog)
  }

  // @@protoc_insertion_point(class_scope:cmd.CommandLog)
  private static final cmd.CommandLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cmd.CommandLog();
  }

  public static cmd.CommandLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommandLog>
      PARSER = new com.google.protobuf.AbstractParser<CommandLog>() {
    @java.lang.Override
    public CommandLog parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CommandLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommandLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cmd.CommandLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

