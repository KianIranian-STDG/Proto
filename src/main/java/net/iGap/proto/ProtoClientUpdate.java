// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientUpdate.proto

package net.iGap.proto;

public final class ProtoClientUpdate {
  private ProtoClientUpdate() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.updatequeue.Update)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 pts = 1;</code>
     */
    long getPts();

    /**
     * <code>optional uint64 seq = 2;</code>
     */
    long getSeq();

    /**
     * <code>optional uint64 action_id = 3;</code>
     */
    long getActionId();

    /**
     * <code>optional bytes wrapped_proto = 4;</code>
     */
    com.google.protobuf.ByteString getWrappedProto();
  }
  /**
   * Protobuf type {@code proto.updatequeue.Update}
   */
  public  static final class Update extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.updatequeue.Update)
      UpdateOrBuilder {
    // Use Update.newBuilder() to construct.
    private Update(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Update() {
      pts_ = 0L;
      seq_ = 0L;
      actionId_ = 0L;
      wrappedProto_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Update(
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

              pts_ = input.readUInt64();
              break;
            }
            case 16: {

              seq_ = input.readUInt64();
              break;
            }
            case 24: {

              actionId_ = input.readUInt64();
              break;
            }
            case 34: {

              wrappedProto_ = input.readBytes();
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
      return net.iGap.proto.ProtoClientUpdate.internal_static_proto_updatequeue_Update_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.iGap.proto.ProtoClientUpdate.internal_static_proto_updatequeue_Update_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.iGap.proto.ProtoClientUpdate.Update.class, net.iGap.proto.ProtoClientUpdate.Update.Builder.class);
    }

    public static final int PTS_FIELD_NUMBER = 1;
    private long pts_;
    /**
     * <code>optional uint64 pts = 1;</code>
     */
    public long getPts() {
      return pts_;
    }

    public static final int SEQ_FIELD_NUMBER = 2;
    private long seq_;
    /**
     * <code>optional uint64 seq = 2;</code>
     */
    public long getSeq() {
      return seq_;
    }

    public static final int ACTION_ID_FIELD_NUMBER = 3;
    private long actionId_;
    /**
     * <code>optional uint64 action_id = 3;</code>
     */
    public long getActionId() {
      return actionId_;
    }

    public static final int WRAPPED_PROTO_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString wrappedProto_;
    /**
     * <code>optional bytes wrapped_proto = 4;</code>
     */
    public com.google.protobuf.ByteString getWrappedProto() {
      return wrappedProto_;
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
      if (pts_ != 0L) {
        output.writeUInt64(1, pts_);
      }
      if (seq_ != 0L) {
        output.writeUInt64(2, seq_);
      }
      if (actionId_ != 0L) {
        output.writeUInt64(3, actionId_);
      }
      if (!wrappedProto_.isEmpty()) {
        output.writeBytes(4, wrappedProto_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pts_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, pts_);
      }
      if (seq_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, seq_);
      }
      if (actionId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, actionId_);
      }
      if (!wrappedProto_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, wrappedProto_);
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
      if (!(obj instanceof net.iGap.proto.ProtoClientUpdate.Update)) {
        return super.equals(obj);
      }
      net.iGap.proto.ProtoClientUpdate.Update other = (net.iGap.proto.ProtoClientUpdate.Update) obj;

      boolean result = true;
      result = result && (getPts()
          == other.getPts());
      result = result && (getSeq()
          == other.getSeq());
      result = result && (getActionId()
          == other.getActionId());
      result = result && getWrappedProto()
          .equals(other.getWrappedProto());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + PTS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPts());
      hash = (37 * hash) + SEQ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSeq());
      hash = (37 * hash) + ACTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getActionId());
      hash = (37 * hash) + WRAPPED_PROTO_FIELD_NUMBER;
      hash = (53 * hash) + getWrappedProto().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoClientUpdate.Update parseFrom(
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
    public static Builder newBuilder(net.iGap.proto.ProtoClientUpdate.Update prototype) {
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
     * Protobuf type {@code proto.updatequeue.Update}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.updatequeue.Update)
        net.iGap.proto.ProtoClientUpdate.UpdateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.iGap.proto.ProtoClientUpdate.internal_static_proto_updatequeue_Update_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.iGap.proto.ProtoClientUpdate.internal_static_proto_updatequeue_Update_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.iGap.proto.ProtoClientUpdate.Update.class, net.iGap.proto.ProtoClientUpdate.Update.Builder.class);
      }

      // Construct using net.iGap.proto.ProtoClientUpdate.Update.newBuilder()
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
        pts_ = 0L;

        seq_ = 0L;

        actionId_ = 0L;

        wrappedProto_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.iGap.proto.ProtoClientUpdate.internal_static_proto_updatequeue_Update_descriptor;
      }

      public net.iGap.proto.ProtoClientUpdate.Update getDefaultInstanceForType() {
        return net.iGap.proto.ProtoClientUpdate.Update.getDefaultInstance();
      }

      public net.iGap.proto.ProtoClientUpdate.Update build() {
        net.iGap.proto.ProtoClientUpdate.Update result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public net.iGap.proto.ProtoClientUpdate.Update buildPartial() {
        net.iGap.proto.ProtoClientUpdate.Update result = new net.iGap.proto.ProtoClientUpdate.Update(this);
        result.pts_ = pts_;
        result.seq_ = seq_;
        result.actionId_ = actionId_;
        result.wrappedProto_ = wrappedProto_;
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
        if (other instanceof net.iGap.proto.ProtoClientUpdate.Update) {
          return mergeFrom((net.iGap.proto.ProtoClientUpdate.Update)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.iGap.proto.ProtoClientUpdate.Update other) {
        if (other == net.iGap.proto.ProtoClientUpdate.Update.getDefaultInstance()) return this;
        if (other.getPts() != 0L) {
          setPts(other.getPts());
        }
        if (other.getSeq() != 0L) {
          setSeq(other.getSeq());
        }
        if (other.getActionId() != 0L) {
          setActionId(other.getActionId());
        }
        if (other.getWrappedProto() != com.google.protobuf.ByteString.EMPTY) {
          setWrappedProto(other.getWrappedProto());
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
        net.iGap.proto.ProtoClientUpdate.Update parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.iGap.proto.ProtoClientUpdate.Update) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long pts_ ;
      /**
       * <code>optional uint64 pts = 1;</code>
       */
      public long getPts() {
        return pts_;
      }
      /**
       * <code>optional uint64 pts = 1;</code>
       */
      public Builder setPts(long value) {
        
        pts_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 pts = 1;</code>
       */
      public Builder clearPts() {
        
        pts_ = 0L;
        onChanged();
        return this;
      }

      private long seq_ ;
      /**
       * <code>optional uint64 seq = 2;</code>
       */
      public long getSeq() {
        return seq_;
      }
      /**
       * <code>optional uint64 seq = 2;</code>
       */
      public Builder setSeq(long value) {
        
        seq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 seq = 2;</code>
       */
      public Builder clearSeq() {
        
        seq_ = 0L;
        onChanged();
        return this;
      }

      private long actionId_ ;
      /**
       * <code>optional uint64 action_id = 3;</code>
       */
      public long getActionId() {
        return actionId_;
      }
      /**
       * <code>optional uint64 action_id = 3;</code>
       */
      public Builder setActionId(long value) {
        
        actionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 action_id = 3;</code>
       */
      public Builder clearActionId() {
        
        actionId_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString wrappedProto_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes wrapped_proto = 4;</code>
       */
      public com.google.protobuf.ByteString getWrappedProto() {
        return wrappedProto_;
      }
      /**
       * <code>optional bytes wrapped_proto = 4;</code>
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
       * <code>optional bytes wrapped_proto = 4;</code>
       */
      public Builder clearWrappedProto() {
        
        wrappedProto_ = getDefaultInstance().getWrappedProto();
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


      // @@protoc_insertion_point(builder_scope:proto.updatequeue.Update)
    }

    // @@protoc_insertion_point(class_scope:proto.updatequeue.Update)
    private static final net.iGap.proto.ProtoClientUpdate.Update DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.iGap.proto.ProtoClientUpdate.Update();
    }

    public static net.iGap.proto.ProtoClientUpdate.Update getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Update>
        PARSER = new com.google.protobuf.AbstractParser<Update>() {
      public Update parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Update(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Update> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Update> getParserForType() {
      return PARSER;
    }

    public net.iGap.proto.ProtoClientUpdate.Update getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_updatequeue_Update_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_updatequeue_Update_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ClientUpdate.proto\022\021proto.updatequeue\"" +
      "L\n\006Update\022\013\n\003pts\030\001 \001(\004\022\013\n\003seq\030\002 \001(\004\022\021\n\ta" +
      "ction_id\030\003 \001(\004\022\025\n\rwrapped_proto\030\004 \001(\014B#\n" +
      "\016net.iGap.protoB\021ProtoClientUpdateb\006prot" +
      "o3"
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
    internal_static_proto_updatequeue_Update_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_updatequeue_Update_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_updatequeue_Update_descriptor,
        new java.lang.String[] { "Pts", "Seq", "ActionId", "WrappedProto", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
