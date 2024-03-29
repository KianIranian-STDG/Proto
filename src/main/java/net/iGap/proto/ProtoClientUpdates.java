// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientUpdates.proto

package net.iGap.proto;

public final class ProtoClientUpdates {
  private ProtoClientUpdates() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientUpdatesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.updatequeue.ClientUpdates)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 user_id = 1;</code>
     * @return The userId.
     */
    long getUserId();

    /**
     * <code>uint64 room_id = 2;</code>
     * @return The roomId.
     */
    long getRoomId();

    /**
     * <code>uint64 last_pts = 3;</code>
     * @return The lastPts.
     */
    long getLastPts();

    /**
     * <code>uint32 pts_count = 4;</code>
     * @return The ptsCount.
     */
    int getPtsCount();

    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    java.util.List<net.iGap.proto.ProtoClientUpdate.Update> 
        getUpdatesList();
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    net.iGap.proto.ProtoClientUpdate.Update getUpdates(int index);
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    int getUpdatesCount();
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    java.util.List<? extends net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder> 
        getUpdatesOrBuilderList();
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder getUpdatesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code proto.updatequeue.ClientUpdates}
   */
  public static final class ClientUpdates extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.updatequeue.ClientUpdates)
      ClientUpdatesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientUpdates.newBuilder() to construct.
    private ClientUpdates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientUpdates() {
      updates_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientUpdates();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientUpdates(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              userId_ = input.readUInt64();
              break;
            }
            case 16: {

              roomId_ = input.readUInt64();
              break;
            }
            case 24: {

              lastPts_ = input.readUInt64();
              break;
            }
            case 32: {

              ptsCount_ = input.readUInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                updates_ = new java.util.ArrayList<net.iGap.proto.ProtoClientUpdate.Update>();
                mutable_bitField0_ |= 0x00000001;
              }
              updates_.add(
                  input.readMessage(net.iGap.proto.ProtoClientUpdate.Update.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          updates_ = java.util.Collections.unmodifiableList(updates_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.iGap.proto.ProtoClientUpdates.internal_static_proto_updatequeue_ClientUpdates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.iGap.proto.ProtoClientUpdates.internal_static_proto_updatequeue_ClientUpdates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.iGap.proto.ProtoClientUpdates.ClientUpdates.class, net.iGap.proto.ProtoClientUpdates.ClientUpdates.Builder.class);
    }

    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;
    /**
     * <code>uint64 user_id = 1;</code>
     * @return The userId.
     */
    @java.lang.Override
    public long getUserId() {
      return userId_;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private long roomId_;
    /**
     * <code>uint64 room_id = 2;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public long getRoomId() {
      return roomId_;
    }

    public static final int LAST_PTS_FIELD_NUMBER = 3;
    private long lastPts_;
    /**
     * <code>uint64 last_pts = 3;</code>
     * @return The lastPts.
     */
    @java.lang.Override
    public long getLastPts() {
      return lastPts_;
    }

    public static final int PTS_COUNT_FIELD_NUMBER = 4;
    private int ptsCount_;
    /**
     * <code>uint32 pts_count = 4;</code>
     * @return The ptsCount.
     */
    @java.lang.Override
    public int getPtsCount() {
      return ptsCount_;
    }

    public static final int UPDATES_FIELD_NUMBER = 5;
    private java.util.List<net.iGap.proto.ProtoClientUpdate.Update> updates_;
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    @java.lang.Override
    public java.util.List<net.iGap.proto.ProtoClientUpdate.Update> getUpdatesList() {
      return updates_;
    }
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder> 
        getUpdatesOrBuilderList() {
      return updates_;
    }
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    @java.lang.Override
    public int getUpdatesCount() {
      return updates_.size();
    }
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    @java.lang.Override
    public net.iGap.proto.ProtoClientUpdate.Update getUpdates(int index) {
      return updates_.get(index);
    }
    /**
     * <code>repeated .proto.updatequeue.Update updates = 5;</code>
     */
    @java.lang.Override
    public net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder getUpdatesOrBuilder(
        int index) {
      return updates_.get(index);
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
      if (userId_ != 0L) {
        output.writeUInt64(1, userId_);
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
      }
      if (lastPts_ != 0L) {
        output.writeUInt64(3, lastPts_);
      }
      if (ptsCount_ != 0) {
        output.writeUInt32(4, ptsCount_);
      }
      for (int i = 0; i < updates_.size(); i++) {
        output.writeMessage(5, updates_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, userId_);
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      if (lastPts_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, lastPts_);
      }
      if (ptsCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, ptsCount_);
      }
      for (int i = 0; i < updates_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, updates_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof net.iGap.proto.ProtoClientUpdates.ClientUpdates)) {
        return super.equals(obj);
      }
      net.iGap.proto.ProtoClientUpdates.ClientUpdates other = (net.iGap.proto.ProtoClientUpdates.ClientUpdates) obj;

      if (getUserId()
          != other.getUserId()) return false;
      if (getRoomId()
          != other.getRoomId()) return false;
      if (getLastPts()
          != other.getLastPts()) return false;
      if (getPtsCount()
          != other.getPtsCount()) return false;
      if (!getUpdatesList()
          .equals(other.getUpdatesList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRoomId());
      hash = (37 * hash) + LAST_PTS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastPts());
      hash = (37 * hash) + PTS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getPtsCount();
      if (getUpdatesCount() > 0) {
        hash = (37 * hash) + UPDATES_FIELD_NUMBER;
        hash = (53 * hash) + getUpdatesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates parseFrom(
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
    public static Builder newBuilder(net.iGap.proto.ProtoClientUpdates.ClientUpdates prototype) {
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
     * Protobuf type {@code proto.updatequeue.ClientUpdates}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.updatequeue.ClientUpdates)
        net.iGap.proto.ProtoClientUpdates.ClientUpdatesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.iGap.proto.ProtoClientUpdates.internal_static_proto_updatequeue_ClientUpdates_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.iGap.proto.ProtoClientUpdates.internal_static_proto_updatequeue_ClientUpdates_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.iGap.proto.ProtoClientUpdates.ClientUpdates.class, net.iGap.proto.ProtoClientUpdates.ClientUpdates.Builder.class);
      }

      // Construct using net.iGap.proto.ProtoClientUpdates.ClientUpdates.newBuilder()
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
          getUpdatesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        userId_ = 0L;

        roomId_ = 0L;

        lastPts_ = 0L;

        ptsCount_ = 0;

        if (updatesBuilder_ == null) {
          updates_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          updatesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.iGap.proto.ProtoClientUpdates.internal_static_proto_updatequeue_ClientUpdates_descriptor;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoClientUpdates.ClientUpdates getDefaultInstanceForType() {
        return net.iGap.proto.ProtoClientUpdates.ClientUpdates.getDefaultInstance();
      }

      @java.lang.Override
      public net.iGap.proto.ProtoClientUpdates.ClientUpdates build() {
        net.iGap.proto.ProtoClientUpdates.ClientUpdates result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoClientUpdates.ClientUpdates buildPartial() {
        net.iGap.proto.ProtoClientUpdates.ClientUpdates result = new net.iGap.proto.ProtoClientUpdates.ClientUpdates(this);
        int from_bitField0_ = bitField0_;
        result.userId_ = userId_;
        result.roomId_ = roomId_;
        result.lastPts_ = lastPts_;
        result.ptsCount_ = ptsCount_;
        if (updatesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            updates_ = java.util.Collections.unmodifiableList(updates_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.updates_ = updates_;
        } else {
          result.updates_ = updatesBuilder_.build();
        }
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
        if (other instanceof net.iGap.proto.ProtoClientUpdates.ClientUpdates) {
          return mergeFrom((net.iGap.proto.ProtoClientUpdates.ClientUpdates)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.iGap.proto.ProtoClientUpdates.ClientUpdates other) {
        if (other == net.iGap.proto.ProtoClientUpdates.ClientUpdates.getDefaultInstance()) return this;
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (other.getRoomId() != 0L) {
          setRoomId(other.getRoomId());
        }
        if (other.getLastPts() != 0L) {
          setLastPts(other.getLastPts());
        }
        if (other.getPtsCount() != 0) {
          setPtsCount(other.getPtsCount());
        }
        if (updatesBuilder_ == null) {
          if (!other.updates_.isEmpty()) {
            if (updates_.isEmpty()) {
              updates_ = other.updates_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUpdatesIsMutable();
              updates_.addAll(other.updates_);
            }
            onChanged();
          }
        } else {
          if (!other.updates_.isEmpty()) {
            if (updatesBuilder_.isEmpty()) {
              updatesBuilder_.dispose();
              updatesBuilder_ = null;
              updates_ = other.updates_;
              bitField0_ = (bitField0_ & ~0x00000001);
              updatesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUpdatesFieldBuilder() : null;
            } else {
              updatesBuilder_.addAllMessages(other.updates_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
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
        net.iGap.proto.ProtoClientUpdates.ClientUpdates parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.iGap.proto.ProtoClientUpdates.ClientUpdates) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long userId_ ;
      /**
       * <code>uint64 user_id = 1;</code>
       * @return The userId.
       */
      @java.lang.Override
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>uint64 user_id = 1;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 user_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private long roomId_ ;
      /**
       * <code>uint64 room_id = 2;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public long getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint64 room_id = 2;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(long value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 room_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = 0L;
        onChanged();
        return this;
      }

      private long lastPts_ ;
      /**
       * <code>uint64 last_pts = 3;</code>
       * @return The lastPts.
       */
      @java.lang.Override
      public long getLastPts() {
        return lastPts_;
      }
      /**
       * <code>uint64 last_pts = 3;</code>
       * @param value The lastPts to set.
       * @return This builder for chaining.
       */
      public Builder setLastPts(long value) {
        
        lastPts_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 last_pts = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastPts() {
        
        lastPts_ = 0L;
        onChanged();
        return this;
      }

      private int ptsCount_ ;
      /**
       * <code>uint32 pts_count = 4;</code>
       * @return The ptsCount.
       */
      @java.lang.Override
      public int getPtsCount() {
        return ptsCount_;
      }
      /**
       * <code>uint32 pts_count = 4;</code>
       * @param value The ptsCount to set.
       * @return This builder for chaining.
       */
      public Builder setPtsCount(int value) {
        
        ptsCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pts_count = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPtsCount() {
        
        ptsCount_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<net.iGap.proto.ProtoClientUpdate.Update> updates_ =
        java.util.Collections.emptyList();
      private void ensureUpdatesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          updates_ = new java.util.ArrayList<net.iGap.proto.ProtoClientUpdate.Update>(updates_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          net.iGap.proto.ProtoClientUpdate.Update, net.iGap.proto.ProtoClientUpdate.Update.Builder, net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder> updatesBuilder_;

      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public java.util.List<net.iGap.proto.ProtoClientUpdate.Update> getUpdatesList() {
        if (updatesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(updates_);
        } else {
          return updatesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public int getUpdatesCount() {
        if (updatesBuilder_ == null) {
          return updates_.size();
        } else {
          return updatesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public net.iGap.proto.ProtoClientUpdate.Update getUpdates(int index) {
        if (updatesBuilder_ == null) {
          return updates_.get(index);
        } else {
          return updatesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder setUpdates(
          int index, net.iGap.proto.ProtoClientUpdate.Update value) {
        if (updatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUpdatesIsMutable();
          updates_.set(index, value);
          onChanged();
        } else {
          updatesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder setUpdates(
          int index, net.iGap.proto.ProtoClientUpdate.Update.Builder builderForValue) {
        if (updatesBuilder_ == null) {
          ensureUpdatesIsMutable();
          updates_.set(index, builderForValue.build());
          onChanged();
        } else {
          updatesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder addUpdates(net.iGap.proto.ProtoClientUpdate.Update value) {
        if (updatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUpdatesIsMutable();
          updates_.add(value);
          onChanged();
        } else {
          updatesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder addUpdates(
          int index, net.iGap.proto.ProtoClientUpdate.Update value) {
        if (updatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUpdatesIsMutable();
          updates_.add(index, value);
          onChanged();
        } else {
          updatesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder addUpdates(
          net.iGap.proto.ProtoClientUpdate.Update.Builder builderForValue) {
        if (updatesBuilder_ == null) {
          ensureUpdatesIsMutable();
          updates_.add(builderForValue.build());
          onChanged();
        } else {
          updatesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder addUpdates(
          int index, net.iGap.proto.ProtoClientUpdate.Update.Builder builderForValue) {
        if (updatesBuilder_ == null) {
          ensureUpdatesIsMutable();
          updates_.add(index, builderForValue.build());
          onChanged();
        } else {
          updatesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder addAllUpdates(
          java.lang.Iterable<? extends net.iGap.proto.ProtoClientUpdate.Update> values) {
        if (updatesBuilder_ == null) {
          ensureUpdatesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, updates_);
          onChanged();
        } else {
          updatesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder clearUpdates() {
        if (updatesBuilder_ == null) {
          updates_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          updatesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public Builder removeUpdates(int index) {
        if (updatesBuilder_ == null) {
          ensureUpdatesIsMutable();
          updates_.remove(index);
          onChanged();
        } else {
          updatesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public net.iGap.proto.ProtoClientUpdate.Update.Builder getUpdatesBuilder(
          int index) {
        return getUpdatesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder getUpdatesOrBuilder(
          int index) {
        if (updatesBuilder_ == null) {
          return updates_.get(index);  } else {
          return updatesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public java.util.List<? extends net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder> 
           getUpdatesOrBuilderList() {
        if (updatesBuilder_ != null) {
          return updatesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(updates_);
        }
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public net.iGap.proto.ProtoClientUpdate.Update.Builder addUpdatesBuilder() {
        return getUpdatesFieldBuilder().addBuilder(
            net.iGap.proto.ProtoClientUpdate.Update.getDefaultInstance());
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public net.iGap.proto.ProtoClientUpdate.Update.Builder addUpdatesBuilder(
          int index) {
        return getUpdatesFieldBuilder().addBuilder(
            index, net.iGap.proto.ProtoClientUpdate.Update.getDefaultInstance());
      }
      /**
       * <code>repeated .proto.updatequeue.Update updates = 5;</code>
       */
      public java.util.List<net.iGap.proto.ProtoClientUpdate.Update.Builder> 
           getUpdatesBuilderList() {
        return getUpdatesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          net.iGap.proto.ProtoClientUpdate.Update, net.iGap.proto.ProtoClientUpdate.Update.Builder, net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder> 
          getUpdatesFieldBuilder() {
        if (updatesBuilder_ == null) {
          updatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              net.iGap.proto.ProtoClientUpdate.Update, net.iGap.proto.ProtoClientUpdate.Update.Builder, net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder>(
                  updates_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          updates_ = null;
        }
        return updatesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:proto.updatequeue.ClientUpdates)
    }

    // @@protoc_insertion_point(class_scope:proto.updatequeue.ClientUpdates)
    private static final net.iGap.proto.ProtoClientUpdates.ClientUpdates DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.iGap.proto.ProtoClientUpdates.ClientUpdates();
    }

    public static net.iGap.proto.ProtoClientUpdates.ClientUpdates getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientUpdates>
        PARSER = new com.google.protobuf.AbstractParser<ClientUpdates>() {
      @java.lang.Override
      public ClientUpdates parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientUpdates(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientUpdates> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientUpdates> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.iGap.proto.ProtoClientUpdates.ClientUpdates getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_updatequeue_ClientUpdates_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_updatequeue_ClientUpdates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ClientUpdates.proto\022\021proto.updatequeue" +
      "\032\022ClientUpdate.proto\"\202\001\n\rClientUpdates\022\017" +
      "\n\007user_id\030\001 \001(\004\022\017\n\007room_id\030\002 \001(\004\022\020\n\010last" +
      "_pts\030\003 \001(\004\022\021\n\tpts_count\030\004 \001(\r\022*\n\007updates" +
      "\030\005 \003(\0132\031.proto.updatequeue.UpdateB$\n\016net" +
      ".iGap.protoB\022ProtoClientUpdatesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          net.iGap.proto.ProtoClientUpdate.getDescriptor(),
        });
    internal_static_proto_updatequeue_ClientUpdates_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_updatequeue_ClientUpdates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_updatequeue_ClientUpdates_descriptor,
        new java.lang.String[] { "UserId", "RoomId", "LastPts", "PtsCount", "Updates", });
    net.iGap.proto.ProtoClientUpdate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
