// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InternalUpdateRoom.proto

package net.iGap.proto.updateQueue.core;

public final class ProtoInternalUpdateRoom {
  private ProtoInternalUpdateRoom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InternalUpdateRoomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.updatequeue.InternalUpdateRoom)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 sender_user_id = 1;</code>
     */
    long getSenderUserId();

    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    long getRoomId();

    /**
     * <code>optional string class_name = 3;</code>
     */
    java.lang.String getClassName();
    /**
     * <code>optional string class_name = 3;</code>
     */
    com.google.protobuf.ByteString
        getClassNameBytes();

    /**
     * <code>optional uint64 action_id = 4;</code>
     */
    long getActionId();

    /**
     * <code>optional string request_id = 5;</code>
     */
    java.lang.String getRequestId();
    /**
     * <code>optional string request_id = 5;</code>
     */
    com.google.protobuf.ByteString
        getRequestIdBytes();

    /**
     * <code>optional bytes wrapped_proto = 6;</code>
     */
    com.google.protobuf.ByteString getWrappedProto();

    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    java.lang.String getSenderSessionId();
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    com.google.protobuf.ByteString
        getSenderSessionIdBytes();

    /**
     * <code>optional uint64 expiration_time = 8;</code>
     */
    long getExpirationTime();
  }
  /**
   * Protobuf type {@code proto.updatequeue.InternalUpdateRoom}
   */
  public  static final class InternalUpdateRoom extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.updatequeue.InternalUpdateRoom)
      InternalUpdateRoomOrBuilder {
    // Use InternalUpdateRoom.newBuilder() to construct.
    private InternalUpdateRoom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InternalUpdateRoom() {
      senderUserId_ = 0L;
      roomId_ = 0L;
      className_ = "";
      actionId_ = 0L;
      requestId_ = "";
      wrappedProto_ = com.google.protobuf.ByteString.EMPTY;
      senderSessionId_ = "";
      expirationTime_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private InternalUpdateRoom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              senderUserId_ = input.readUInt64();
              break;
            }
            case 16: {

              roomId_ = input.readUInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              className_ = s;
              break;
            }
            case 32: {

              actionId_ = input.readUInt64();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              requestId_ = s;
              break;
            }
            case 50: {

              wrappedProto_ = input.readBytes();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              senderSessionId_ = s;
              break;
            }
            case 64: {

              expirationTime_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.internal_static_proto_updatequeue_InternalUpdateRoom_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.internal_static_proto_updatequeue_InternalUpdateRoom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.class, net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.Builder.class);
    }

    public static final int SENDER_USER_ID_FIELD_NUMBER = 1;
    private long senderUserId_;
    /**
     * <code>optional uint64 sender_user_id = 1;</code>
     */
    public long getSenderUserId() {
      return senderUserId_;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    public long getRoomId() {
      return roomId_;
    }

    public static final int CLASS_NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object className_;
    /**
     * <code>optional string class_name = 3;</code>
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        className_ = s;
        return s;
      }
    }
    /**
     * <code>optional string class_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACTION_ID_FIELD_NUMBER = 4;
    private long actionId_;
    /**
     * <code>optional uint64 action_id = 4;</code>
     */
    public long getActionId() {
      return actionId_;
    }

    public static final int REQUEST_ID_FIELD_NUMBER = 5;
    private volatile java.lang.Object requestId_;
    /**
     * <code>optional string request_id = 5;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string request_id = 5;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WRAPPED_PROTO_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString wrappedProto_;
    /**
     * <code>optional bytes wrapped_proto = 6;</code>
     */
    public com.google.protobuf.ByteString getWrappedProto() {
      return wrappedProto_;
    }

    public static final int SENDER_SESSION_ID_FIELD_NUMBER = 7;
    private volatile java.lang.Object senderSessionId_;
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    public java.lang.String getSenderSessionId() {
      java.lang.Object ref = senderSessionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderSessionId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    public com.google.protobuf.ByteString
        getSenderSessionIdBytes() {
      java.lang.Object ref = senderSessionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderSessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXPIRATION_TIME_FIELD_NUMBER = 8;
    private long expirationTime_;
    /**
     * <code>optional uint64 expiration_time = 8;</code>
     */
    public long getExpirationTime() {
      return expirationTime_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (senderUserId_ != 0L) {
        output.writeUInt64(1, senderUserId_);
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
      }
      if (!getClassNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, className_);
      }
      if (actionId_ != 0L) {
        output.writeUInt64(4, actionId_);
      }
      if (!getRequestIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, requestId_);
      }
      if (!wrappedProto_.isEmpty()) {
        output.writeBytes(6, wrappedProto_);
      }
      if (!getSenderSessionIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, senderSessionId_);
      }
      if (expirationTime_ != 0L) {
        output.writeUInt64(8, expirationTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (senderUserId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, senderUserId_);
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      if (!getClassNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, className_);
      }
      if (actionId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, actionId_);
      }
      if (!getRequestIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, requestId_);
      }
      if (!wrappedProto_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, wrappedProto_);
      }
      if (!getSenderSessionIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, senderSessionId_);
      }
      if (expirationTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, expirationTime_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom)) {
        return super.equals(obj);
      }
      net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom other = (net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom) obj;

      boolean result = true;
      result = result && (getSenderUserId()
          == other.getSenderUserId());
      result = result && (getRoomId()
          == other.getRoomId());
      result = result && getClassName()
          .equals(other.getClassName());
      result = result && (getActionId()
          == other.getActionId());
      result = result && getRequestId()
          .equals(other.getRequestId());
      result = result && getWrappedProto()
          .equals(other.getWrappedProto());
      result = result && getSenderSessionId()
          .equals(other.getSenderSessionId());
      result = result && (getExpirationTime()
          == other.getExpirationTime());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + SENDER_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSenderUserId());
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRoomId());
      hash = (37 * hash) + CLASS_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getClassName().hashCode();
      hash = (37 * hash) + ACTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getActionId());
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId().hashCode();
      hash = (37 * hash) + WRAPPED_PROTO_FIELD_NUMBER;
      hash = (53 * hash) + getWrappedProto().hashCode();
      hash = (37 * hash) + SENDER_SESSION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderSessionId().hashCode();
      hash = (37 * hash) + EXPIRATION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getExpirationTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code proto.updatequeue.InternalUpdateRoom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.updatequeue.InternalUpdateRoom)
        net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.internal_static_proto_updatequeue_InternalUpdateRoom_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.internal_static_proto_updatequeue_InternalUpdateRoom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.class, net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.Builder.class);
      }

      // Construct using net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        senderUserId_ = 0L;

        roomId_ = 0L;

        className_ = "";

        actionId_ = 0L;

        requestId_ = "";

        wrappedProto_ = com.google.protobuf.ByteString.EMPTY;

        senderSessionId_ = "";

        expirationTime_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.internal_static_proto_updatequeue_InternalUpdateRoom_descriptor;
      }

      public net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom getDefaultInstanceForType() {
        return net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.getDefaultInstance();
      }

      public net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom build() {
        net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom buildPartial() {
        net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom result = new net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom(this);
        result.senderUserId_ = senderUserId_;
        result.roomId_ = roomId_;
        result.className_ = className_;
        result.actionId_ = actionId_;
        result.requestId_ = requestId_;
        result.wrappedProto_ = wrappedProto_;
        result.senderSessionId_ = senderSessionId_;
        result.expirationTime_ = expirationTime_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom) {
          return mergeFrom((net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom other) {
        if (other == net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.getDefaultInstance()) return this;
        if (other.getSenderUserId() != 0L) {
          setSenderUserId(other.getSenderUserId());
        }
        if (other.getRoomId() != 0L) {
          setRoomId(other.getRoomId());
        }
        if (!other.getClassName().isEmpty()) {
          className_ = other.className_;
          onChanged();
        }
        if (other.getActionId() != 0L) {
          setActionId(other.getActionId());
        }
        if (!other.getRequestId().isEmpty()) {
          requestId_ = other.requestId_;
          onChanged();
        }
        if (other.getWrappedProto() != com.google.protobuf.ByteString.EMPTY) {
          setWrappedProto(other.getWrappedProto());
        }
        if (!other.getSenderSessionId().isEmpty()) {
          senderSessionId_ = other.senderSessionId_;
          onChanged();
        }
        if (other.getExpirationTime() != 0L) {
          setExpirationTime(other.getExpirationTime());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long senderUserId_ ;
      /**
       * <code>optional uint64 sender_user_id = 1;</code>
       */
      public long getSenderUserId() {
        return senderUserId_;
      }
      /**
       * <code>optional uint64 sender_user_id = 1;</code>
       */
      public Builder setSenderUserId(long value) {
        
        senderUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 sender_user_id = 1;</code>
       */
      public Builder clearSenderUserId() {
        
        senderUserId_ = 0L;
        onChanged();
        return this;
      }

      private long roomId_ ;
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public long getRoomId() {
        return roomId_;
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder setRoomId(long value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder clearRoomId() {
        
        roomId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object className_ = "";
      /**
       * <code>optional string class_name = 3;</code>
       */
      public java.lang.String getClassName() {
        java.lang.Object ref = className_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          className_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getClassNameBytes() {
        java.lang.Object ref = className_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          className_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public Builder setClassName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        className_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public Builder clearClassName() {
        
        className_ = getDefaultInstance().getClassName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public Builder setClassNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        className_ = value;
        onChanged();
        return this;
      }

      private long actionId_ ;
      /**
       * <code>optional uint64 action_id = 4;</code>
       */
      public long getActionId() {
        return actionId_;
      }
      /**
       * <code>optional uint64 action_id = 4;</code>
       */
      public Builder setActionId(long value) {
        
        actionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 action_id = 4;</code>
       */
      public Builder clearActionId() {
        
        actionId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object requestId_ = "";
      /**
       * <code>optional string request_id = 5;</code>
       */
      public java.lang.String getRequestId() {
        java.lang.Object ref = requestId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          requestId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public com.google.protobuf.ByteString
          getRequestIdBytes() {
        java.lang.Object ref = requestId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          requestId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public Builder setRequestId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public Builder clearRequestId() {
        
        requestId_ = getDefaultInstance().getRequestId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public Builder setRequestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        requestId_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString wrappedProto_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes wrapped_proto = 6;</code>
       */
      public com.google.protobuf.ByteString getWrappedProto() {
        return wrappedProto_;
      }
      /**
       * <code>optional bytes wrapped_proto = 6;</code>
       */
      public Builder setWrappedProto(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        wrappedProto_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes wrapped_proto = 6;</code>
       */
      public Builder clearWrappedProto() {
        
        wrappedProto_ = getDefaultInstance().getWrappedProto();
        onChanged();
        return this;
      }

      private java.lang.Object senderSessionId_ = "";
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public java.lang.String getSenderSessionId() {
        java.lang.Object ref = senderSessionId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          senderSessionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public com.google.protobuf.ByteString
          getSenderSessionIdBytes() {
        java.lang.Object ref = senderSessionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senderSessionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public Builder setSenderSessionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderSessionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public Builder clearSenderSessionId() {
        
        senderSessionId_ = getDefaultInstance().getSenderSessionId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public Builder setSenderSessionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderSessionId_ = value;
        onChanged();
        return this;
      }

      private long expirationTime_ ;
      /**
       * <code>optional uint64 expiration_time = 8;</code>
       */
      public long getExpirationTime() {
        return expirationTime_;
      }
      /**
       * <code>optional uint64 expiration_time = 8;</code>
       */
      public Builder setExpirationTime(long value) {
        
        expirationTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 expiration_time = 8;</code>
       */
      public Builder clearExpirationTime() {
        
        expirationTime_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:proto.updatequeue.InternalUpdateRoom)
    }

    // @@protoc_insertion_point(class_scope:proto.updatequeue.InternalUpdateRoom)
    private static final net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom();
    }

    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InternalUpdateRoom>
        PARSER = new com.google.protobuf.AbstractParser<InternalUpdateRoom>() {
      public InternalUpdateRoom parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new InternalUpdateRoom(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InternalUpdateRoom> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InternalUpdateRoom> getParserForType() {
      return PARSER;
    }

    public net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_updatequeue_InternalUpdateRoom_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_updatequeue_InternalUpdateRoom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030InternalUpdateRoom.proto\022\021proto.update" +
      "queue\"\303\001\n\022InternalUpdateRoom\022\026\n\016sender_u" +
      "ser_id\030\001 \001(\004\022\017\n\007room_id\030\002 \001(\004\022\022\n\nclass_n" +
      "ame\030\003 \001(\t\022\021\n\taction_id\030\004 \001(\004\022\022\n\nrequest_" +
      "id\030\005 \001(\t\022\025\n\rwrapped_proto\030\006 \001(\014\022\031\n\021sende" +
      "r_session_id\030\007 \001(\t\022\027\n\017expiration_time\030\010 " +
      "\001(\004B:\n\037net.iGap.proto.updateQueue.coreB\027" +
      "ProtoInternalUpdateRoomb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_updatequeue_InternalUpdateRoom_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_updatequeue_InternalUpdateRoom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_updatequeue_InternalUpdateRoom_descriptor,
        new java.lang.String[] { "SenderUserId", "RoomId", "ClassName", "ActionId", "RequestId", "WrappedProto", "SenderSessionId", "ExpirationTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
