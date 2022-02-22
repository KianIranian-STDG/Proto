// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangePhoneNumber.proto

package net.iGap.proto;

public final class ProtoChangePhoneNumber {
  private ProtoChangePhoneNumber() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ChangePhoneNumberOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChangePhoneNumber)
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
     * <code>optional string phone_number = 2;</code>
     */
    java.lang.String getPhoneNumber();
    /**
     * <code>optional string phone_number = 2;</code>
     */
    com.google.protobuf.ByteString
        getPhoneNumberBytes();

    /**
     * <code>optional string country_code = 3;</code>
     */
    java.lang.String getCountryCode();
    /**
     * <code>optional string country_code = 3;</code>
     */
    com.google.protobuf.ByteString
        getCountryCodeBytes();
  }
  /**
   * Protobuf type {@code proto.ChangePhoneNumber}
   */
  public  static final class ChangePhoneNumber extends
      com.google.protobuf.GeneratedMessageLite<
          ChangePhoneNumber, ChangePhoneNumber.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ChangePhoneNumber)
      ChangePhoneNumberOrBuilder {
    private ChangePhoneNumber() {
      phoneNumber_ = "";
      countryCode_ = "";
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

    public static final int PHONE_NUMBER_FIELD_NUMBER = 2;
    private java.lang.String phoneNumber_;
    /**
     * <code>optional string phone_number = 2;</code>
     */
    public java.lang.String getPhoneNumber() {
      return phoneNumber_;
    }
    /**
     * <code>optional string phone_number = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneNumberBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(phoneNumber_);
    }
    /**
     * <code>optional string phone_number = 2;</code>
     */
    private void setPhoneNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phoneNumber_ = value;
    }
    /**
     * <code>optional string phone_number = 2;</code>
     */
    private void clearPhoneNumber() {
      
      phoneNumber_ = getDefaultInstance().getPhoneNumber();
    }
    /**
     * <code>optional string phone_number = 2;</code>
     */
    private void setPhoneNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phoneNumber_ = value.toStringUtf8();
    }

    public static final int COUNTRY_CODE_FIELD_NUMBER = 3;
    private java.lang.String countryCode_;
    /**
     * <code>optional string country_code = 3;</code>
     */
    public java.lang.String getCountryCode() {
      return countryCode_;
    }
    /**
     * <code>optional string country_code = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCountryCodeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(countryCode_);
    }
    /**
     * <code>optional string country_code = 3;</code>
     */
    private void setCountryCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      countryCode_ = value;
    }
    /**
     * <code>optional string country_code = 3;</code>
     */
    private void clearCountryCode() {
      
      countryCode_ = getDefaultInstance().getCountryCode();
    }
    /**
     * <code>optional string country_code = 3;</code>
     */
    private void setCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      countryCode_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (!phoneNumber_.isEmpty()) {
        output.writeString(2, getPhoneNumber());
      }
      if (!countryCode_.isEmpty()) {
        output.writeString(3, getCountryCode());
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
      if (!phoneNumber_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getPhoneNumber());
      }
      if (!countryCode_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getCountryCode());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ChangePhoneNumber}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChangePhoneNumber)
        net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberOrBuilder {
      // Construct using net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber.newBuilder()
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
       * <code>optional string phone_number = 2;</code>
       */
      public java.lang.String getPhoneNumber() {
        return instance.getPhoneNumber();
      }
      /**
       * <code>optional string phone_number = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPhoneNumberBytes() {
        return instance.getPhoneNumberBytes();
      }
      /**
       * <code>optional string phone_number = 2;</code>
       */
      public Builder setPhoneNumber(
          java.lang.String value) {
        copyOnWrite();
        instance.setPhoneNumber(value);
        return this;
      }
      /**
       * <code>optional string phone_number = 2;</code>
       */
      public Builder clearPhoneNumber() {
        copyOnWrite();
        instance.clearPhoneNumber();
        return this;
      }
      /**
       * <code>optional string phone_number = 2;</code>
       */
      public Builder setPhoneNumberBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPhoneNumberBytes(value);
        return this;
      }

      /**
       * <code>optional string country_code = 3;</code>
       */
      public java.lang.String getCountryCode() {
        return instance.getCountryCode();
      }
      /**
       * <code>optional string country_code = 3;</code>
       */
      public com.google.protobuf.ByteString
          getCountryCodeBytes() {
        return instance.getCountryCodeBytes();
      }
      /**
       * <code>optional string country_code = 3;</code>
       */
      public Builder setCountryCode(
          java.lang.String value) {
        copyOnWrite();
        instance.setCountryCode(value);
        return this;
      }
      /**
       * <code>optional string country_code = 3;</code>
       */
      public Builder clearCountryCode() {
        copyOnWrite();
        instance.clearCountryCode();
        return this;
      }
      /**
       * <code>optional string country_code = 3;</code>
       */
      public Builder setCountryCodeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCountryCodeBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ChangePhoneNumber)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber();
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
          net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber other = (net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          phoneNumber_ = visitor.visitString(!phoneNumber_.isEmpty(), phoneNumber_,
              !other.phoneNumber_.isEmpty(), other.phoneNumber_);
          countryCode_ = visitor.visitString(!countryCode_.isEmpty(), countryCode_,
              !other.countryCode_.isEmpty(), other.countryCode_);
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
                case 18: {
                  String s = input.readStringRequireUtf8();

                  phoneNumber_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  countryCode_ = s;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ChangePhoneNumber)
    private static final net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChangePhoneNumber();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumber getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ChangePhoneNumber> PARSER;

    public static com.google.protobuf.Parser<ChangePhoneNumber> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ChangePhoneNumberResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChangePhoneNumberResponse)
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
   * Protobuf type {@code proto.ChangePhoneNumberResponse}
   */
  public  static final class ChangePhoneNumberResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ChangePhoneNumberResponse, ChangePhoneNumberResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ChangePhoneNumberResponse)
      ChangePhoneNumberResponseOrBuilder {
    private ChangePhoneNumberResponse() {
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

    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ChangePhoneNumberResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChangePhoneNumberResponse)
        net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:proto.ChangePhoneNumberResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse();
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
          net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse other = (net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse) arg1;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ChangePhoneNumberResponse)
    private static final net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChangePhoneNumberResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoChangePhoneNumber.ChangePhoneNumberResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ChangePhoneNumberResponse> PARSER;

    public static com.google.protobuf.Parser<ChangePhoneNumberResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
