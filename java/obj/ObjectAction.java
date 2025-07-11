// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object.proto

package obj;

/**
 * <pre>
 * ---- Synchronous Subscription ----
 * </pre>
 *
 * Protobuf type {@code object.ObjectAction}
 */
public final class ObjectAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:object.ObjectAction)
    ObjectActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ObjectAction.newBuilder() to construct.
  private ObjectAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectAction() {
    data_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ObjectAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return obj.Obj.internal_static_object_ObjectAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return obj.Obj.internal_static_object_ObjectAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            obj.ObjectAction.class, obj.ObjectAction.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private long action_;
  /**
   * <code>uint64 action = 2;</code>
   * @return The action.
   */
  @java.lang.Override
  public long getAction() {
    return action_;
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 3;
  private long objectId_;
  /**
   * <code>uint64 object_id = 3;</code>
   * @return The objectId.
   */
  @java.lang.Override
  public long getObjectId() {
    return objectId_;
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private volatile java.lang.Object data_;
  /**
   * <code>string data = 4;</code>
   * @return The data.
   */
  @java.lang.Override
  public java.lang.String getData() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      data_ = s;
      return s;
    }
  }
  /**
   * <code>string data = 4;</code>
   * @return The bytes for data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataBytes() {
    java.lang.Object ref = data_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      data_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (action_ != 0L) {
      output.writeUInt64(2, action_);
    }
    if (objectId_ != 0L) {
      output.writeUInt64(3, objectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (action_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, action_);
    }
    if (objectId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, objectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(data_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, data_);
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
    if (!(obj instanceof obj.ObjectAction)) {
      return super.equals(obj);
    }
    obj.ObjectAction other = (obj.ObjectAction) obj;

    if (getId()
        != other.getId()) return false;
    if (getAction()
        != other.getAction()) return false;
    if (getObjectId()
        != other.getObjectId()) return false;
    if (!getData()
        .equals(other.getData())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAction());
    hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getObjectId());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static obj.ObjectAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static obj.ObjectAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static obj.ObjectAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static obj.ObjectAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static obj.ObjectAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static obj.ObjectAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static obj.ObjectAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static obj.ObjectAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static obj.ObjectAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static obj.ObjectAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static obj.ObjectAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static obj.ObjectAction parseFrom(
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
  public static Builder newBuilder(obj.ObjectAction prototype) {
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
   * ---- Synchronous Subscription ----
   * </pre>
   *
   * Protobuf type {@code object.ObjectAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:object.ObjectAction)
      obj.ObjectActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return obj.Obj.internal_static_object_ObjectAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return obj.Obj.internal_static_object_ObjectAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              obj.ObjectAction.class, obj.ObjectAction.Builder.class);
    }

    // Construct using obj.ObjectAction.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      action_ = 0L;

      objectId_ = 0L;

      data_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return obj.Obj.internal_static_object_ObjectAction_descriptor;
    }

    @java.lang.Override
    public obj.ObjectAction getDefaultInstanceForType() {
      return obj.ObjectAction.getDefaultInstance();
    }

    @java.lang.Override
    public obj.ObjectAction build() {
      obj.ObjectAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public obj.ObjectAction buildPartial() {
      obj.ObjectAction result = new obj.ObjectAction(this);
      result.id_ = id_;
      result.action_ = action_;
      result.objectId_ = objectId_;
      result.data_ = data_;
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
      if (other instanceof obj.ObjectAction) {
        return mergeFrom((obj.ObjectAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(obj.ObjectAction other) {
      if (other == obj.ObjectAction.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getAction() != 0L) {
        setAction(other.getAction());
      }
      if (other.getObjectId() != 0L) {
        setObjectId(other.getObjectId());
      }
      if (!other.getData().isEmpty()) {
        data_ = other.data_;
        onChanged();
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
              id_ = input.readUInt64();

              break;
            } // case 8
            case 16: {
              action_ = input.readUInt64();

              break;
            } // case 16
            case 24: {
              objectId_ = input.readUInt64();

              break;
            } // case 24
            case 34: {
              data_ = input.readStringRequireUtf8();

              break;
            } // case 34
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

    private long id_ ;
    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private long action_ ;
    /**
     * <code>uint64 action = 2;</code>
     * @return The action.
     */
    @java.lang.Override
    public long getAction() {
      return action_;
    }
    /**
     * <code>uint64 action = 2;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(long value) {
      
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 action = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      
      action_ = 0L;
      onChanged();
      return this;
    }

    private long objectId_ ;
    /**
     * <code>uint64 object_id = 3;</code>
     * @return The objectId.
     */
    @java.lang.Override
    public long getObjectId() {
      return objectId_;
    }
    /**
     * <code>uint64 object_id = 3;</code>
     * @param value The objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectId(long value) {
      
      objectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 object_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectId() {
      
      objectId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object data_ = "";
    /**
     * <code>string data = 4;</code>
     * @return The data.
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string data = 4;</code>
     * @return The bytes for data.
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string data = 4;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string data = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    /**
     * <code>string data = 4;</code>
     * @param value The bytes for data to set.
     * @return This builder for chaining.
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      data_ = value;
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


    // @@protoc_insertion_point(builder_scope:object.ObjectAction)
  }

  // @@protoc_insertion_point(class_scope:object.ObjectAction)
  private static final obj.ObjectAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new obj.ObjectAction();
  }

  public static obj.ObjectAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectAction>
      PARSER = new com.google.protobuf.AbstractParser<ObjectAction>() {
    @java.lang.Override
    public ObjectAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public obj.ObjectAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

