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
// source: google/firestore/bundle/bundle.proto

// Protobuf Java Version: 3.25.8
package com.google.firestore.bundle;

public interface BundledDocumentMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.bundle.BundledDocumentMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The document key of a bundled document.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The document key of a bundled document.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The snapshot version of the document data bundled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();

  /**
   *
   *
   * <pre>
   * The snapshot version of the document data bundled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();

  /**
   *
   *
   * <pre>
   * The snapshot version of the document data bundled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether the document exists.
   * </pre>
   *
   * <code>bool exists = 3;</code>
   *
   * @return The exists.
   */
  boolean getExists();

  /**
   *
   *
   * <pre>
   * The names of the queries in this bundle that this document matches to.
   * </pre>
   *
   * <code>repeated string queries = 4;</code>
   *
   * @return A list containing the queries.
   */
  java.util.List<java.lang.String> getQueriesList();

  /**
   *
   *
   * <pre>
   * The names of the queries in this bundle that this document matches to.
   * </pre>
   *
   * <code>repeated string queries = 4;</code>
   *
   * @return The count of queries.
   */
  int getQueriesCount();

  /**
   *
   *
   * <pre>
   * The names of the queries in this bundle that this document matches to.
   * </pre>
   *
   * <code>repeated string queries = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The queries at the given index.
   */
  java.lang.String getQueries(int index);

  /**
   *
   *
   * <pre>
   * The names of the queries in this bundle that this document matches to.
   * </pre>
   *
   * <code>repeated string queries = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the queries at the given index.
   */
  com.google.protobuf.ByteString getQueriesBytes(int index);
}
