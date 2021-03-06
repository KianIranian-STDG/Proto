// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientRoomReport.proto

package net.iGap.proto;

public final class ProtoClientRoomReport {
  private ProtoClientRoomReport() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientRoomReportOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientRoomReport)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    boolean hasRequest();
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    net.iGap.proto.ProtoRequest.Request getRequest();

    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    long getRoomId();

    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    long getMessageId();

    /**
     * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
     */
    int getReasonValue();
    /**
     * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
     */
    net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason getReason();

    /**
     * <code>optional string description = 5;</code>
     */
    java.lang.String getDescription();
    /**
     * <code>optional string description = 5;</code>
     */
    com.google.protobuf.ByteString
        getDescriptionBytes();
  }
  /**
   * Protobuf type {@code proto.ClientRoomReport}
   */
  public  static final class ClientRoomReport extends
      com.google.protobuf.GeneratedMessageLite<
          ClientRoomReport, ClientRoomReport.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientRoomReport)
      ClientRoomReportOrBuilder {
    private ClientRoomReport() {
      description_ = "";
    }
    /**
     * Protobuf enum {@code proto.ClientRoomReport.Reason}
     */
    public enum Reason
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>OTHER = 0;</code>
       */
      OTHER(0),
      /**
       * <code>SPAM = 1;</code>
       */
      SPAM(1),
      /**
       * <code>PORNOGRAPHY = 2;</code>
       */
      PORNOGRAPHY(2),
      /**
       * <code>VIOLENCE = 3;</code>
       */
      VIOLENCE(3),
      /**
       * <code>ABUSE = 4;</code>
       */
      ABUSE(4),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>OTHER = 0;</code>
       */
      public static final int OTHER_VALUE = 0;
      /**
       * <code>SPAM = 1;</code>
       */
      public static final int SPAM_VALUE = 1;
      /**
       * <code>PORNOGRAPHY = 2;</code>
       */
      public static final int PORNOGRAPHY_VALUE = 2;
      /**
       * <code>VIOLENCE = 3;</code>
       */
      public static final int VIOLENCE_VALUE = 3;
      /**
       * <code>ABUSE = 4;</code>
       */
      public static final int ABUSE_VALUE = 4;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Reason valueOf(int value) {
        return forNumber(value);
      }

      public static Reason forNumber(int value) {
        switch (value) {
          case 0: return OTHER;
          case 1: return SPAM;
          case 2: return PORNOGRAPHY;
          case 3: return VIOLENCE;
          case 4: return ABUSE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Reason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Reason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
              public Reason findValueByNumber(int number) {
                return Reason.forNumber(number);
              }
            };

      private final int value;

      private Reason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:proto.ClientRoomReport.Reason)
    }

    public static final int REQUEST_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoRequest.Request request_;
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public boolean hasRequest() {
      return request_ != null;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public net.iGap.proto.ProtoRequest.Request getRequest() {
      return request_ == null ? net.iGap.proto.ProtoRequest.Request.getDefaultInstance() : request_;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (value == null) {
        throw new NullPointerException();
      }
      request_ = value;
      
      }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(
        net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
      request_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (request_ != null &&
          request_ != net.iGap.proto.ProtoRequest.Request.getDefaultInstance()) {
        request_ =
          net.iGap.proto.ProtoRequest.Request.newBuilder(request_).mergeFrom(value).buildPartial();
      } else {
        request_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void clearRequest() {  request_ = null;
      
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void setRoomId(long value) {
      
      roomId_ = value;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void clearRoomId() {
      
      roomId_ = 0L;
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    private long messageId_;
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    public long getMessageId() {
      return messageId_;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void setMessageId(long value) {
      
      messageId_ = value;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void clearMessageId() {
      
      messageId_ = 0L;
    }

    public static final int REASON_FIELD_NUMBER = 4;
    private int reason_;
    /**
     * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
     */
    public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
     */
    public net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason getReason() {
      net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason result = net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason.forNumber(reason_);
      return result == null ? net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
     */
    private void setReasonValue(int value) {
        reason_ = value;
    }
    /**
     * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
     */
    private void setReason(net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      reason_ = value.getNumber();
    }
    /**
     * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
     */
    private void clearReason() {
      
      reason_ = 0;
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    private java.lang.String description_;
    /**
     * <code>optional string description = 5;</code>
     */
    public java.lang.String getDescription() {
      return description_;
    }
    /**
     * <code>optional string description = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(description_);
    }
    /**
     * <code>optional string description = 5;</code>
     */
    private void setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
    }
    /**
     * <code>optional string description = 5;</code>
     */
    private void clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
    }
    /**
     * <code>optional string description = 5;</code>
     */
    private void setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
      }
      if (messageId_ != 0L) {
        output.writeUInt64(3, messageId_);
      }
      if (reason_ != net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason.OTHER.getNumber()) {
        output.writeEnum(4, reason_);
      }
      if (!description_.isEmpty()) {
        output.writeString(5, getDescription());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (request_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRequest());
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      if (messageId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, messageId_);
      }
      if (reason_ != net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason.OTHER.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, reason_);
      }
      if (!description_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getDescription());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientRoomReport.ClientRoomReport prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientRoomReport}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientRoomReport.ClientRoomReport, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientRoomReport)
        net.iGap.proto.ProtoClientRoomReport.ClientRoomReportOrBuilder {
      // Construct using net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public boolean hasRequest() {
        return instance.hasRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public net.iGap.proto.ProtoRequest.Request getRequest() {
        return instance.getRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.setRequest(value);
        return this;
        }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(
          net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
        copyOnWrite();
        instance.setRequest(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.mergeRequest(value);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder clearRequest() {  copyOnWrite();
        instance.clearRequest();
        return this;
      }

      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public long getRoomId() {
        return instance.getRoomId();
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder setRoomId(long value) {
        copyOnWrite();
        instance.setRoomId(value);
        return this;
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder clearRoomId() {
        copyOnWrite();
        instance.clearRoomId();
        return this;
      }

      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public long getMessageId() {
        return instance.getMessageId();
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder setMessageId(long value) {
        copyOnWrite();
        instance.setMessageId(value);
        return this;
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder clearMessageId() {
        copyOnWrite();
        instance.clearMessageId();
        return this;
      }

      /**
       * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
       */
      public int getReasonValue() {
        return instance.getReasonValue();
      }
      /**
       * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
       */
      public Builder setReasonValue(int value) {
        copyOnWrite();
        instance.setReasonValue(value);
        return this;
      }
      /**
       * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
       */
      public net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason getReason() {
        return instance.getReason();
      }
      /**
       * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
       */
      public Builder setReason(net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.Reason value) {
        copyOnWrite();
        instance.setReason(value);
        return this;
      }
      /**
       * <code>optional .proto.ClientRoomReport.Reason reason = 4;</code>
       */
      public Builder clearReason() {
        copyOnWrite();
        instance.clearReason();
        return this;
      }

      /**
       * <code>optional string description = 5;</code>
       */
      public java.lang.String getDescription() {
        return instance.getDescription();
      }
      /**
       * <code>optional string description = 5;</code>
       */
      public com.google.protobuf.ByteString
          getDescriptionBytes() {
        return instance.getDescriptionBytes();
      }
      /**
       * <code>optional string description = 5;</code>
       */
      public Builder setDescription(
          java.lang.String value) {
        copyOnWrite();
        instance.setDescription(value);
        return this;
      }
      /**
       * <code>optional string description = 5;</code>
       */
      public Builder clearDescription() {
        copyOnWrite();
        instance.clearDescription();
        return this;
      }
      /**
       * <code>optional string description = 5;</code>
       */
      public Builder setDescriptionBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setDescriptionBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientRoomReport)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientRoomReport.ClientRoomReport();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.ProtoClientRoomReport.ClientRoomReport other = (net.iGap.proto.ProtoClientRoomReport.ClientRoomReport) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
          messageId_ = visitor.visitLong(messageId_ != 0L, messageId_,
              other.messageId_ != 0L, other.messageId_);
          reason_ = visitor.visitInt(reason_ != 0, reason_,    other.reason_ != 0, other.reason_);
          description_ = visitor.visitString(!description_.isEmpty(), description_,
              !other.description_.isEmpty(), other.description_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 10: {
                  net.iGap.proto.ProtoRequest.Request.Builder subBuilder = null;
                  if (request_ != null) {
                    subBuilder = request_.toBuilder();
                  }
                  request_ = input.readMessage(net.iGap.proto.ProtoRequest.Request.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(request_);
                    request_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 16: {

                  roomId_ = input.readUInt64();
                  break;
                }
                case 24: {

                  messageId_ = input.readUInt64();
                  break;
                }
                case 32: {
                  int rawValue = input.readEnum();

                  reason_ = rawValue;
                  break;
                }
                case 42: {
                  String s = input.readStringRequireUtf8();

                  description_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientRoomReport.ClientRoomReport.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.ClientRoomReport)
    private static final net.iGap.proto.ProtoClientRoomReport.ClientRoomReport DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientRoomReport();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReport getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientRoomReport> PARSER;

    public static com.google.protobuf.Parser<ClientRoomReport> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ClientRoomReportResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientRoomReportResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    boolean hasResponse();
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    net.iGap.proto.ProtoResponse.Response getResponse();
  }
  /**
   * Protobuf type {@code proto.ClientRoomReportResponse}
   */
  public  static final class ClientRoomReportResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ClientRoomReportResponse, ClientRoomReportResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientRoomReportResponse)
      ClientRoomReportResponseOrBuilder {
    private ClientRoomReportResponse() {
    }
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoResponse.Response response_;
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public boolean hasResponse() {
      return response_ != null;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public net.iGap.proto.ProtoResponse.Response getResponse() {
      return response_ == null ? net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (value == null) {
        throw new NullPointerException();
      }
      response_ = value;
      
      }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(
        net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
      response_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (response_ != null &&
          response_ != net.iGap.proto.ProtoResponse.Response.getDefaultInstance()) {
        response_ =
          net.iGap.proto.ProtoResponse.Response.newBuilder(response_).mergeFrom(value).buildPartial();
      } else {
        response_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void clearResponse() {  response_ = null;
      
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (response_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResponse());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientRoomReportResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientRoomReportResponse)
        net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public boolean hasResponse() {
        return instance.hasResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public net.iGap.proto.ProtoResponse.Response getResponse() {
        return instance.getResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.setResponse(value);
        return this;
        }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(
          net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
        copyOnWrite();
        instance.setResponse(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.mergeResponse(value);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder clearResponse() {  copyOnWrite();
        instance.clearResponse();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientRoomReportResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse other = (net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 10: {
                  net.iGap.proto.ProtoResponse.Response.Builder subBuilder = null;
                  if (response_ != null) {
                    subBuilder = response_.toBuilder();
                  }
                  response_ = input.readMessage(net.iGap.proto.ProtoResponse.Response.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(response_);
                    response_ = subBuilder.buildPartial();
                  }

                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.ClientRoomReportResponse)
    private static final net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientRoomReportResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientRoomReport.ClientRoomReportResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientRoomReportResponse> PARSER;

    public static com.google.protobuf.Parser<ClientRoomReportResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
