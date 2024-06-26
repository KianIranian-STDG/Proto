// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MentionMessageIds.proto

// Protobuf Java Version: 3.25.1
package net.iGap.proto;

public final class ProtoMentionMessageIds {
  private ProtoMentionMessageIds() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MentionMessageIdsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.MentionMessageIds)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 messageIds = 1;</code>
     * @return A list containing the messageIds.
     */
    java.util.List<java.lang.Long> getMessageIdsList();
    /**
     * <code>repeated uint64 messageIds = 1;</code>
     * @return The count of messageIds.
     */
    int getMessageIdsCount();
    /**
     * <code>repeated uint64 messageIds = 1;</code>
     * @param index The index of the element to return.
     * @return The messageIds at the given index.
     */
    long getMessageIds(int index);
  }
  /**
   * Protobuf type {@code proto.MentionMessageIds}
   */
  public static final class MentionMessageIds extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.MentionMessageIds)
      MentionMessageIdsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MentionMessageIds.newBuilder() to construct.
    private MentionMessageIds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MentionMessageIds() {
      messageIds_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MentionMessageIds();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.iGap.proto.ProtoMentionMessageIds.internal_static_proto_MentionMessageIds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.iGap.proto.ProtoMentionMessageIds.internal_static_proto_MentionMessageIds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds.class, net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds.Builder.class);
    }

    public static final int MESSAGEIDS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList messageIds_ =
        emptyLongList();
    /**
     * <code>repeated uint64 messageIds = 1;</code>
     * @return A list containing the messageIds.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getMessageIdsList() {
      return messageIds_;
    }
    /**
     * <code>repeated uint64 messageIds = 1;</code>
     * @return The count of messageIds.
     */
    public int getMessageIdsCount() {
      return messageIds_.size();
    }
    /**
     * <code>repeated uint64 messageIds = 1;</code>
     * @param index The index of the element to return.
     * @return The messageIds at the given index.
     */
    public long getMessageIds(int index) {
      return messageIds_.getLong(index);
    }
    private int messageIdsMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getMessageIdsList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(messageIdsMemoizedSerializedSize);
      }
      for (int i = 0; i < messageIds_.size(); i++) {
        output.writeUInt64NoTag(messageIds_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < messageIds_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(messageIds_.getLong(i));
        }
        size += dataSize;
        if (!getMessageIdsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        messageIdsMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds)) {
        return super.equals(obj);
      }
      net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds other = (net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds) obj;

      if (!getMessageIdsList()
          .equals(other.getMessageIdsList())) return false;
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
      if (getMessageIdsCount() > 0) {
        hash = (37 * hash) + MESSAGEIDS_FIELD_NUMBER;
        hash = (53 * hash) + getMessageIdsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds parseFrom(
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
    public static Builder newBuilder(net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds prototype) {
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
     * Protobuf type {@code proto.MentionMessageIds}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.MentionMessageIds)
        net.iGap.proto.ProtoMentionMessageIds.MentionMessageIdsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.iGap.proto.ProtoMentionMessageIds.internal_static_proto_MentionMessageIds_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.iGap.proto.ProtoMentionMessageIds.internal_static_proto_MentionMessageIds_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds.class, net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds.Builder.class);
      }

      // Construct using net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        messageIds_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.iGap.proto.ProtoMentionMessageIds.internal_static_proto_MentionMessageIds_descriptor;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds getDefaultInstanceForType() {
        return net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds.getDefaultInstance();
      }

      @java.lang.Override
      public net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds build() {
        net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds buildPartial() {
        net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds result = new net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          messageIds_.makeImmutable();
          result.messageIds_ = messageIds_;
        }
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
        if (other instanceof net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds) {
          return mergeFrom((net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds other) {
        if (other == net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds.getDefaultInstance()) return this;
        if (!other.messageIds_.isEmpty()) {
          if (messageIds_.isEmpty()) {
            messageIds_ = other.messageIds_;
            messageIds_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureMessageIdsIsMutable();
            messageIds_.addAll(other.messageIds_);
          }
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
                long v = input.readUInt64();
                ensureMessageIdsIsMutable();
                messageIds_.addLong(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureMessageIdsIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  messageIds_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 10
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
      private int bitField0_;

      private com.google.protobuf.Internal.LongList messageIds_ = emptyLongList();
      private void ensureMessageIdsIsMutable() {
        if (!messageIds_.isModifiable()) {
          messageIds_ = makeMutableCopy(messageIds_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint64 messageIds = 1;</code>
       * @return A list containing the messageIds.
       */
      public java.util.List<java.lang.Long>
          getMessageIdsList() {
        messageIds_.makeImmutable();
        return messageIds_;
      }
      /**
       * <code>repeated uint64 messageIds = 1;</code>
       * @return The count of messageIds.
       */
      public int getMessageIdsCount() {
        return messageIds_.size();
      }
      /**
       * <code>repeated uint64 messageIds = 1;</code>
       * @param index The index of the element to return.
       * @return The messageIds at the given index.
       */
      public long getMessageIds(int index) {
        return messageIds_.getLong(index);
      }
      /**
       * <code>repeated uint64 messageIds = 1;</code>
       * @param index The index to set the value at.
       * @param value The messageIds to set.
       * @return This builder for chaining.
       */
      public Builder setMessageIds(
          int index, long value) {

        ensureMessageIdsIsMutable();
        messageIds_.setLong(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 messageIds = 1;</code>
       * @param value The messageIds to add.
       * @return This builder for chaining.
       */
      public Builder addMessageIds(long value) {

        ensureMessageIdsIsMutable();
        messageIds_.addLong(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 messageIds = 1;</code>
       * @param values The messageIds to add.
       * @return This builder for chaining.
       */
      public Builder addAllMessageIds(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureMessageIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messageIds_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 messageIds = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessageIds() {
        messageIds_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:proto.MentionMessageIds)
    }

    // @@protoc_insertion_point(class_scope:proto.MentionMessageIds)
    private static final net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds();
    }

    public static net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MentionMessageIds>
        PARSER = new com.google.protobuf.AbstractParser<MentionMessageIds>() {
      @java.lang.Override
      public MentionMessageIds parsePartialFrom(
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

    public static com.google.protobuf.Parser<MentionMessageIds> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MentionMessageIds> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.iGap.proto.ProtoMentionMessageIds.MentionMessageIds getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_MentionMessageIds_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_MentionMessageIds_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MentionMessageIds.proto\022\005proto\"\'\n\021Ment" +
      "ionMessageIds\022\022\n\nmessageIds\030\001 \003(\004B(\n\016net" +
      ".iGap.protoB\026ProtoMentionMessageIdsb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_MentionMessageIds_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_MentionMessageIds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_MentionMessageIds_descriptor,
        new java.lang.String[] { "MessageIds", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
