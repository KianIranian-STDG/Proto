// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientUpdatesTooLong.proto

package net.iGap.proto;

public final class ProtoClientUpdatesTooLong {
  private ProtoClientUpdatesTooLong() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientUpdatesTooLongOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.updatequeue.ClientUpdatesTooLong)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 user_id = 1;</code>
     * @return The userId.
     */
    long getUserId();
  }
  /**
   * Protobuf type {@code proto.updatequeue.ClientUpdatesTooLong}
   */
  public static final class ClientUpdatesTooLong extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.updatequeue.ClientUpdatesTooLong)
      ClientUpdatesTooLongOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientUpdatesTooLong.newBuilder() to construct.
    private ClientUpdatesTooLong(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientUpdatesTooLong() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientUpdatesTooLong();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientUpdatesTooLong(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.iGap.proto.ProtoClientUpdatesTooLong.internal_static_proto_updatequeue_ClientUpdatesTooLong_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.iGap.proto.ProtoClientUpdatesTooLong.internal_static_proto_updatequeue_ClientUpdatesTooLong_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.class, net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.Builder.class);
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong)) {
        return super.equals(obj);
      }
      net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong other = (net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong) obj;

      if (getUserId()
          != other.getUserId()) return false;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
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
    public static Builder newBuilder(net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong prototype) {
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
     * Protobuf type {@code proto.updatequeue.ClientUpdatesTooLong}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.updatequeue.ClientUpdatesTooLong)
        net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLongOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.iGap.proto.ProtoClientUpdatesTooLong.internal_static_proto_updatequeue_ClientUpdatesTooLong_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.iGap.proto.ProtoClientUpdatesTooLong.internal_static_proto_updatequeue_ClientUpdatesTooLong_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.class, net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.Builder.class);
      }

      // Construct using net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        userId_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.iGap.proto.ProtoClientUpdatesTooLong.internal_static_proto_updatequeue_ClientUpdatesTooLong_descriptor;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong getDefaultInstanceForType() {
        return net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.getDefaultInstance();
      }

      @java.lang.Override
      public net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong build() {
        net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong buildPartial() {
        net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong result = new net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong(this);
        result.userId_ = userId_;
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
        if (other instanceof net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong) {
          return mergeFrom((net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong other) {
        if (other == net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.getDefaultInstance()) return this;
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
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
        net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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


      // @@protoc_insertion_point(builder_scope:proto.updatequeue.ClientUpdatesTooLong)
    }

    // @@protoc_insertion_point(class_scope:proto.updatequeue.ClientUpdatesTooLong)
    private static final net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong();
    }

    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientUpdatesTooLong>
        PARSER = new com.google.protobuf.AbstractParser<ClientUpdatesTooLong>() {
      @java.lang.Override
      public ClientUpdatesTooLong parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientUpdatesTooLong(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientUpdatesTooLong> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientUpdatesTooLong> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_updatequeue_ClientUpdatesTooLong_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_updatequeue_ClientUpdatesTooLong_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ClientUpdatesTooLong.proto\022\021proto.upda" +
      "tequeue\"\'\n\024ClientUpdatesTooLong\022\017\n\007user_" +
      "id\030\001 \001(\004B+\n\016net.iGap.protoB\031ProtoClientU" +
      "pdatesTooLongb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_updatequeue_ClientUpdatesTooLong_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_updatequeue_ClientUpdatesTooLong_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_updatequeue_ClientUpdatesTooLong_descriptor,
        new java.lang.String[] { "UserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
