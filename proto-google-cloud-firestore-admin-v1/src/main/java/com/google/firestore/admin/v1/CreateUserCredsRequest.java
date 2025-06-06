/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/firestore_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.firestore.admin.v1;

/**
 *
 *
 * <pre>
 * The request for
 * [FirestoreAdmin.CreateUserCreds][google.firestore.admin.v1.FirestoreAdmin.CreateUserCreds].
 * </pre>
 *
 * Protobuf type {@code google.firestore.admin.v1.CreateUserCredsRequest}
 */
public final class CreateUserCredsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.admin.v1.CreateUserCredsRequest)
    CreateUserCredsRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateUserCredsRequest.newBuilder() to construct.
  private CreateUserCredsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateUserCredsRequest() {
    parent_ = "";
    userCredsId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateUserCredsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_CreateUserCredsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_CreateUserCredsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.admin.v1.CreateUserCredsRequest.class,
            com.google.firestore.admin.v1.CreateUserCredsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. A parent name of the form
   * `projects/{project_id}/databases/{database_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. A parent name of the form
   * `projects/{project_id}/databases/{database_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_CREDS_FIELD_NUMBER = 2;
  private com.google.firestore.admin.v1.UserCreds userCreds_;

  /**
   *
   *
   * <pre>
   * Required. The user creds to create.
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userCreds field is set.
   */
  @java.lang.Override
  public boolean hasUserCreds() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The user creds to create.
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userCreds.
   */
  @java.lang.Override
  public com.google.firestore.admin.v1.UserCreds getUserCreds() {
    return userCreds_ == null
        ? com.google.firestore.admin.v1.UserCreds.getDefaultInstance()
        : userCreds_;
  }

  /**
   *
   *
   * <pre>
   * Required. The user creds to create.
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.firestore.admin.v1.UserCredsOrBuilder getUserCredsOrBuilder() {
    return userCreds_ == null
        ? com.google.firestore.admin.v1.UserCreds.getDefaultInstance()
        : userCreds_;
  }

  public static final int USER_CREDS_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object userCredsId_ = "";

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the user creds, which will become the final
   * component of the user creds's resource name.
   *
   * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
   * with first character a letter and the last a letter or a number. Must not
   * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
   * </pre>
   *
   * <code>string user_creds_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The userCredsId.
   */
  @java.lang.Override
  public java.lang.String getUserCredsId() {
    java.lang.Object ref = userCredsId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userCredsId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the user creds, which will become the final
   * component of the user creds's resource name.
   *
   * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
   * with first character a letter and the last a letter or a number. Must not
   * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
   * </pre>
   *
   * <code>string user_creds_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for userCredsId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUserCredsIdBytes() {
    java.lang.Object ref = userCredsId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      userCredsId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getUserCreds());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userCredsId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userCredsId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUserCreds());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userCredsId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userCredsId_);
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
    if (!(obj instanceof com.google.firestore.admin.v1.CreateUserCredsRequest)) {
      return super.equals(obj);
    }
    com.google.firestore.admin.v1.CreateUserCredsRequest other =
        (com.google.firestore.admin.v1.CreateUserCredsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasUserCreds() != other.hasUserCreds()) return false;
    if (hasUserCreds()) {
      if (!getUserCreds().equals(other.getUserCreds())) return false;
    }
    if (!getUserCredsId().equals(other.getUserCredsId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasUserCreds()) {
      hash = (37 * hash) + USER_CREDS_FIELD_NUMBER;
      hash = (53 * hash) + getUserCreds().hashCode();
    }
    hash = (37 * hash) + USER_CREDS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserCredsId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.admin.v1.CreateUserCredsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * The request for
   * [FirestoreAdmin.CreateUserCreds][google.firestore.admin.v1.FirestoreAdmin.CreateUserCreds].
   * </pre>
   *
   * Protobuf type {@code google.firestore.admin.v1.CreateUserCredsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.admin.v1.CreateUserCredsRequest)
      com.google.firestore.admin.v1.CreateUserCredsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_CreateUserCredsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_CreateUserCredsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.admin.v1.CreateUserCredsRequest.class,
              com.google.firestore.admin.v1.CreateUserCredsRequest.Builder.class);
    }

    // Construct using com.google.firestore.admin.v1.CreateUserCredsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUserCredsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      userCreds_ = null;
      if (userCredsBuilder_ != null) {
        userCredsBuilder_.dispose();
        userCredsBuilder_ = null;
      }
      userCredsId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_CreateUserCredsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.CreateUserCredsRequest getDefaultInstanceForType() {
      return com.google.firestore.admin.v1.CreateUserCredsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.CreateUserCredsRequest build() {
      com.google.firestore.admin.v1.CreateUserCredsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.CreateUserCredsRequest buildPartial() {
      com.google.firestore.admin.v1.CreateUserCredsRequest result =
          new com.google.firestore.admin.v1.CreateUserCredsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firestore.admin.v1.CreateUserCredsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userCreds_ = userCredsBuilder_ == null ? userCreds_ : userCredsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userCredsId_ = userCredsId_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.admin.v1.CreateUserCredsRequest) {
        return mergeFrom((com.google.firestore.admin.v1.CreateUserCredsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.admin.v1.CreateUserCredsRequest other) {
      if (other == com.google.firestore.admin.v1.CreateUserCredsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUserCreds()) {
        mergeUserCreds(other.getUserCreds());
      }
      if (!other.getUserCredsId().isEmpty()) {
        userCredsId_ = other.userCredsId_;
        bitField0_ |= 0x00000004;
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUserCredsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                userCredsId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. A parent name of the form
     * `projects/{project_id}/databases/{database_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. A parent name of the form
     * `projects/{project_id}/databases/{database_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. A parent name of the form
     * `projects/{project_id}/databases/{database_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A parent name of the form
     * `projects/{project_id}/databases/{database_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A parent name of the form
     * `projects/{project_id}/databases/{database_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.firestore.admin.v1.UserCreds userCreds_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.admin.v1.UserCreds,
            com.google.firestore.admin.v1.UserCreds.Builder,
            com.google.firestore.admin.v1.UserCredsOrBuilder>
        userCredsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the userCreds field is set.
     */
    public boolean hasUserCreds() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The userCreds.
     */
    public com.google.firestore.admin.v1.UserCreds getUserCreds() {
      if (userCredsBuilder_ == null) {
        return userCreds_ == null
            ? com.google.firestore.admin.v1.UserCreds.getDefaultInstance()
            : userCreds_;
      } else {
        return userCredsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserCreds(com.google.firestore.admin.v1.UserCreds value) {
      if (userCredsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userCreds_ = value;
      } else {
        userCredsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserCreds(com.google.firestore.admin.v1.UserCreds.Builder builderForValue) {
      if (userCredsBuilder_ == null) {
        userCreds_ = builderForValue.build();
      } else {
        userCredsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUserCreds(com.google.firestore.admin.v1.UserCreds value) {
      if (userCredsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && userCreds_ != null
            && userCreds_ != com.google.firestore.admin.v1.UserCreds.getDefaultInstance()) {
          getUserCredsBuilder().mergeFrom(value);
        } else {
          userCreds_ = value;
        }
      } else {
        userCredsBuilder_.mergeFrom(value);
      }
      if (userCreds_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUserCreds() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userCreds_ = null;
      if (userCredsBuilder_ != null) {
        userCredsBuilder_.dispose();
        userCredsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.firestore.admin.v1.UserCreds.Builder getUserCredsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUserCredsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.firestore.admin.v1.UserCredsOrBuilder getUserCredsOrBuilder() {
      if (userCredsBuilder_ != null) {
        return userCredsBuilder_.getMessageOrBuilder();
      } else {
        return userCreds_ == null
            ? com.google.firestore.admin.v1.UserCreds.getDefaultInstance()
            : userCreds_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The user creds to create.
     * </pre>
     *
     * <code>
     * .google.firestore.admin.v1.UserCreds user_creds = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.admin.v1.UserCreds,
            com.google.firestore.admin.v1.UserCreds.Builder,
            com.google.firestore.admin.v1.UserCredsOrBuilder>
        getUserCredsFieldBuilder() {
      if (userCredsBuilder_ == null) {
        userCredsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.firestore.admin.v1.UserCreds,
                com.google.firestore.admin.v1.UserCreds.Builder,
                com.google.firestore.admin.v1.UserCredsOrBuilder>(
                getUserCreds(), getParentForChildren(), isClean());
        userCreds_ = null;
      }
      return userCredsBuilder_;
    }

    private java.lang.Object userCredsId_ = "";

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the user creds, which will become the final
     * component of the user creds's resource name.
     *
     * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
     * with first character a letter and the last a letter or a number. Must not
     * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * </pre>
     *
     * <code>string user_creds_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The userCredsId.
     */
    public java.lang.String getUserCredsId() {
      java.lang.Object ref = userCredsId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userCredsId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the user creds, which will become the final
     * component of the user creds's resource name.
     *
     * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
     * with first character a letter and the last a letter or a number. Must not
     * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * </pre>
     *
     * <code>string user_creds_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for userCredsId.
     */
    public com.google.protobuf.ByteString getUserCredsIdBytes() {
      java.lang.Object ref = userCredsId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        userCredsId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the user creds, which will become the final
     * component of the user creds's resource name.
     *
     * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
     * with first character a letter and the last a letter or a number. Must not
     * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * </pre>
     *
     * <code>string user_creds_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The userCredsId to set.
     * @return This builder for chaining.
     */
    public Builder setUserCredsId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      userCredsId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the user creds, which will become the final
     * component of the user creds's resource name.
     *
     * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
     * with first character a letter and the last a letter or a number. Must not
     * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * </pre>
     *
     * <code>string user_creds_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUserCredsId() {
      userCredsId_ = getDefaultInstance().getUserCredsId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the user creds, which will become the final
     * component of the user creds's resource name.
     *
     * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
     * with first character a letter and the last a letter or a number. Must not
     * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * </pre>
     *
     * <code>string user_creds_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for userCredsId to set.
     * @return This builder for chaining.
     */
    public Builder setUserCredsIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      userCredsId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.admin.v1.CreateUserCredsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.admin.v1.CreateUserCredsRequest)
  private static final com.google.firestore.admin.v1.CreateUserCredsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.admin.v1.CreateUserCredsRequest();
  }

  public static com.google.firestore.admin.v1.CreateUserCredsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUserCredsRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateUserCredsRequest>() {
        @java.lang.Override
        public CreateUserCredsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateUserCredsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUserCredsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.admin.v1.CreateUserCredsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
