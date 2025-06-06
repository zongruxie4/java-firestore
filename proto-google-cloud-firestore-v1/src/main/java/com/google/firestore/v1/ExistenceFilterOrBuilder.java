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
// source: google/firestore/v1/write.proto

// Protobuf Java Version: 3.25.8
package com.google.firestore.v1;

public interface ExistenceFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.ExistenceFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The target ID to which this filter applies.
   * </pre>
   *
   * <code>int32 target_id = 1;</code>
   *
   * @return The targetId.
   */
  int getTargetId();

  /**
   *
   *
   * <pre>
   * The total count of documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id].
   *
   * If different from the count of documents in the client that match, the
   * client must manually determine which documents no longer match the target.
   *
   * The client can use the `unchanged_names` bloom filter to assist with
   * this determination by testing ALL the document names against the filter;
   * if the document name is NOT in the filter, it means the document no
   * longer matches the target.
   * </pre>
   *
   * <code>int32 count = 2;</code>
   *
   * @return The count.
   */
  int getCount();

  /**
   *
   *
   * <pre>
   * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
   * the resource names of ALL the documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   *
   * This bloom filter may be omitted at the server's discretion, such as if it
   * is deemed that the client will not make use of it or if it is too
   * computationally expensive to calculate or transmit. Clients must gracefully
   * handle this field being absent by falling back to the logic used before
   * this field existed; that is, re-add the target without a resume token to
   * figure out which documents in the client's cache are out of sync.
   * </pre>
   *
   * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
   *
   * @return Whether the unchangedNames field is set.
   */
  boolean hasUnchangedNames();

  /**
   *
   *
   * <pre>
   * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
   * the resource names of ALL the documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   *
   * This bloom filter may be omitted at the server's discretion, such as if it
   * is deemed that the client will not make use of it or if it is too
   * computationally expensive to calculate or transmit. Clients must gracefully
   * handle this field being absent by falling back to the logic used before
   * this field existed; that is, re-add the target without a resume token to
   * figure out which documents in the client's cache are out of sync.
   * </pre>
   *
   * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
   *
   * @return The unchangedNames.
   */
  com.google.firestore.v1.BloomFilter getUnchangedNames();

  /**
   *
   *
   * <pre>
   * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
   * the resource names of ALL the documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   *
   * This bloom filter may be omitted at the server's discretion, such as if it
   * is deemed that the client will not make use of it or if it is too
   * computationally expensive to calculate or transmit. Clients must gracefully
   * handle this field being absent by falling back to the logic used before
   * this field existed; that is, re-add the target without a resume token to
   * figure out which documents in the client's cache are out of sync.
   * </pre>
   *
   * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
   */
  com.google.firestore.v1.BloomFilterOrBuilder getUnchangedNamesOrBuilder();
}
