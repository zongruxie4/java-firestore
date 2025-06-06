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
// source: google/firestore/v1/bloom_filter.proto

// Protobuf Java Version: 3.25.8
package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * A sequence of bits, encoded in a byte array.
 *
 * Each byte in the `bitmap` byte array stores 8 bits of the sequence. The only
 * exception is the last byte, which may store 8 _or fewer_ bits. The `padding`
 * defines the number of bits of the last byte to be ignored as "padding". The
 * values of these "padding" bits are unspecified and must be ignored.
 *
 * To retrieve the first bit, bit 0, calculate: `(bitmap[0] &amp; 0x01) != 0`.
 * To retrieve the second bit, bit 1, calculate: `(bitmap[0] &amp; 0x02) != 0`.
 * To retrieve the third bit, bit 2, calculate: `(bitmap[0] &amp; 0x04) != 0`.
 * To retrieve the fourth bit, bit 3, calculate: `(bitmap[0] &amp; 0x08) != 0`.
 * To retrieve bit n, calculate: `(bitmap[n / 8] &amp; (0x01 &lt;&lt; (n % 8))) != 0`.
 *
 * The "size" of a `BitSequence` (the number of bits it contains) is calculated
 * by this formula: `(bitmap.length * 8) - padding`.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.BitSequence}
 */
public final class BitSequence extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.BitSequence)
    BitSequenceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BitSequence.newBuilder() to construct.
  private BitSequence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BitSequence() {
    bitmap_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BitSequence();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.v1.BloomFilterProto
        .internal_static_google_firestore_v1_BitSequence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.BloomFilterProto
        .internal_static_google_firestore_v1_BitSequence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.BitSequence.class,
            com.google.firestore.v1.BitSequence.Builder.class);
  }

  public static final int BITMAP_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString bitmap_ = com.google.protobuf.ByteString.EMPTY;

  /**
   *
   *
   * <pre>
   * The bytes that encode the bit sequence.
   * May have a length of zero.
   * </pre>
   *
   * <code>bytes bitmap = 1;</code>
   *
   * @return The bitmap.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBitmap() {
    return bitmap_;
  }

  public static final int PADDING_FIELD_NUMBER = 2;
  private int padding_ = 0;

  /**
   *
   *
   * <pre>
   * The number of bits of the last byte in `bitmap` to ignore as "padding".
   * If the length of `bitmap` is zero, then this value must be `0`.
   * Otherwise, this value must be between 0 and 7, inclusive.
   * </pre>
   *
   * <code>int32 padding = 2;</code>
   *
   * @return The padding.
   */
  @java.lang.Override
  public int getPadding() {
    return padding_;
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
    if (!bitmap_.isEmpty()) {
      output.writeBytes(1, bitmap_);
    }
    if (padding_ != 0) {
      output.writeInt32(2, padding_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!bitmap_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, bitmap_);
    }
    if (padding_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, padding_);
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
    if (!(obj instanceof com.google.firestore.v1.BitSequence)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.BitSequence other = (com.google.firestore.v1.BitSequence) obj;

    if (!getBitmap().equals(other.getBitmap())) return false;
    if (getPadding() != other.getPadding()) return false;
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
    hash = (37 * hash) + BITMAP_FIELD_NUMBER;
    hash = (53 * hash) + getBitmap().hashCode();
    hash = (37 * hash) + PADDING_FIELD_NUMBER;
    hash = (53 * hash) + getPadding();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.BitSequence parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.BitSequence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.BitSequence parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.BitSequence parseFrom(
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

  public static Builder newBuilder(com.google.firestore.v1.BitSequence prototype) {
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
   * A sequence of bits, encoded in a byte array.
   *
   * Each byte in the `bitmap` byte array stores 8 bits of the sequence. The only
   * exception is the last byte, which may store 8 _or fewer_ bits. The `padding`
   * defines the number of bits of the last byte to be ignored as "padding". The
   * values of these "padding" bits are unspecified and must be ignored.
   *
   * To retrieve the first bit, bit 0, calculate: `(bitmap[0] &amp; 0x01) != 0`.
   * To retrieve the second bit, bit 1, calculate: `(bitmap[0] &amp; 0x02) != 0`.
   * To retrieve the third bit, bit 2, calculate: `(bitmap[0] &amp; 0x04) != 0`.
   * To retrieve the fourth bit, bit 3, calculate: `(bitmap[0] &amp; 0x08) != 0`.
   * To retrieve bit n, calculate: `(bitmap[n / 8] &amp; (0x01 &lt;&lt; (n % 8))) != 0`.
   *
   * The "size" of a `BitSequence` (the number of bits it contains) is calculated
   * by this formula: `(bitmap.length * 8) - padding`.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.BitSequence}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.BitSequence)
      com.google.firestore.v1.BitSequenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.BloomFilterProto
          .internal_static_google_firestore_v1_BitSequence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.BloomFilterProto
          .internal_static_google_firestore_v1_BitSequence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.BitSequence.class,
              com.google.firestore.v1.BitSequence.Builder.class);
    }

    // Construct using com.google.firestore.v1.BitSequence.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      bitmap_ = com.google.protobuf.ByteString.EMPTY;
      padding_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.BloomFilterProto
          .internal_static_google_firestore_v1_BitSequence_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.BitSequence getDefaultInstanceForType() {
      return com.google.firestore.v1.BitSequence.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.BitSequence build() {
      com.google.firestore.v1.BitSequence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.BitSequence buildPartial() {
      com.google.firestore.v1.BitSequence result = new com.google.firestore.v1.BitSequence(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firestore.v1.BitSequence result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bitmap_ = bitmap_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.padding_ = padding_;
      }
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
      if (other instanceof com.google.firestore.v1.BitSequence) {
        return mergeFrom((com.google.firestore.v1.BitSequence) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.BitSequence other) {
      if (other == com.google.firestore.v1.BitSequence.getDefaultInstance()) return this;
      if (other.getBitmap() != com.google.protobuf.ByteString.EMPTY) {
        setBitmap(other.getBitmap());
      }
      if (other.getPadding() != 0) {
        setPadding(other.getPadding());
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
                bitmap_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                padding_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.protobuf.ByteString bitmap_ = com.google.protobuf.ByteString.EMPTY;

    /**
     *
     *
     * <pre>
     * The bytes that encode the bit sequence.
     * May have a length of zero.
     * </pre>
     *
     * <code>bytes bitmap = 1;</code>
     *
     * @return The bitmap.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBitmap() {
      return bitmap_;
    }

    /**
     *
     *
     * <pre>
     * The bytes that encode the bit sequence.
     * May have a length of zero.
     * </pre>
     *
     * <code>bytes bitmap = 1;</code>
     *
     * @param value The bitmap to set.
     * @return This builder for chaining.
     */
    public Builder setBitmap(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitmap_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The bytes that encode the bit sequence.
     * May have a length of zero.
     * </pre>
     *
     * <code>bytes bitmap = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBitmap() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bitmap_ = getDefaultInstance().getBitmap();
      onChanged();
      return this;
    }

    private int padding_;

    /**
     *
     *
     * <pre>
     * The number of bits of the last byte in `bitmap` to ignore as "padding".
     * If the length of `bitmap` is zero, then this value must be `0`.
     * Otherwise, this value must be between 0 and 7, inclusive.
     * </pre>
     *
     * <code>int32 padding = 2;</code>
     *
     * @return The padding.
     */
    @java.lang.Override
    public int getPadding() {
      return padding_;
    }

    /**
     *
     *
     * <pre>
     * The number of bits of the last byte in `bitmap` to ignore as "padding".
     * If the length of `bitmap` is zero, then this value must be `0`.
     * Otherwise, this value must be between 0 and 7, inclusive.
     * </pre>
     *
     * <code>int32 padding = 2;</code>
     *
     * @param value The padding to set.
     * @return This builder for chaining.
     */
    public Builder setPadding(int value) {

      padding_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The number of bits of the last byte in `bitmap` to ignore as "padding".
     * If the length of `bitmap` is zero, then this value must be `0`.
     * Otherwise, this value must be between 0 and 7, inclusive.
     * </pre>
     *
     * <code>int32 padding = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPadding() {
      bitField0_ = (bitField0_ & ~0x00000002);
      padding_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.BitSequence)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.BitSequence)
  private static final com.google.firestore.v1.BitSequence DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.BitSequence();
  }

  public static com.google.firestore.v1.BitSequence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BitSequence> PARSER =
      new com.google.protobuf.AbstractParser<BitSequence>() {
        @java.lang.Override
        public BitSequence parsePartialFrom(
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

  public static com.google.protobuf.Parser<BitSequence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BitSequence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.BitSequence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
