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
// source: google/firestore/v1/firestore.proto

// Protobuf Java Version: 3.25.8
package com.google.firestore.v1;

public interface ListCollectionIdsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.ListCollectionIdsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   *
   * @return A list containing the collectionIds.
   */
  java.util.List<java.lang.String> getCollectionIdsList();

  /**
   *
   *
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   *
   * @return The count of collectionIds.
   */
  int getCollectionIdsCount();

  /**
   *
   *
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The collectionIds at the given index.
   */
  java.lang.String getCollectionIds(int index);

  /**
   *
   *
   * <pre>
   * The collection ids.
   * </pre>
   *
   * <code>repeated string collection_ids = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the collectionIds at the given index.
   */
  com.google.protobuf.ByteString getCollectionIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * A page token that may be used to continue the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * A page token that may be used to continue the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
