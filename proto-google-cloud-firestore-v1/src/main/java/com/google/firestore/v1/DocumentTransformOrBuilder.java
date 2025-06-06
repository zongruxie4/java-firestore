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

public interface DocumentTransformOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.DocumentTransform)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the document to transform.
   * </pre>
   *
   * <code>string document = 1;</code>
   *
   * @return The document.
   */
  java.lang.String getDocument();

  /**
   *
   *
   * <pre>
   * The name of the document to transform.
   * </pre>
   *
   * <code>string document = 1;</code>
   *
   * @return The bytes for document.
   */
  com.google.protobuf.ByteString getDocumentBytes();

  /**
   *
   *
   * <pre>
   * The list of transformations to apply to the fields of the document, in
   * order.
   * This must not be empty.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.DocumentTransform.FieldTransform field_transforms = 2;
   * </code>
   */
  java.util.List<com.google.firestore.v1.DocumentTransform.FieldTransform> getFieldTransformsList();

  /**
   *
   *
   * <pre>
   * The list of transformations to apply to the fields of the document, in
   * order.
   * This must not be empty.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.DocumentTransform.FieldTransform field_transforms = 2;
   * </code>
   */
  com.google.firestore.v1.DocumentTransform.FieldTransform getFieldTransforms(int index);

  /**
   *
   *
   * <pre>
   * The list of transformations to apply to the fields of the document, in
   * order.
   * This must not be empty.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.DocumentTransform.FieldTransform field_transforms = 2;
   * </code>
   */
  int getFieldTransformsCount();

  /**
   *
   *
   * <pre>
   * The list of transformations to apply to the fields of the document, in
   * order.
   * This must not be empty.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.DocumentTransform.FieldTransform field_transforms = 2;
   * </code>
   */
  java.util.List<? extends com.google.firestore.v1.DocumentTransform.FieldTransformOrBuilder>
      getFieldTransformsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of transformations to apply to the fields of the document, in
   * order.
   * This must not be empty.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.DocumentTransform.FieldTransform field_transforms = 2;
   * </code>
   */
  com.google.firestore.v1.DocumentTransform.FieldTransformOrBuilder getFieldTransformsOrBuilder(
      int index);
}
