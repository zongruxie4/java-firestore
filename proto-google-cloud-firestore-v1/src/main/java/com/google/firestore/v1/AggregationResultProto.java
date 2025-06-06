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
// source: google/firestore/v1/aggregation_result.proto

// Protobuf Java Version: 3.25.8
package com.google.firestore.v1;

public final class AggregationResultProto {
  private AggregationResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_AggregationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_AggregationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_AggregationResult_AggregateFieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_AggregationResult_AggregateFieldsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/firestore/v1/aggregation_result"
          + ".proto\022\023google.firestore.v1\032\"google/fire"
          + "store/v1/document.proto\"\276\001\n\021AggregationR"
          + "esult\022U\n\020aggregate_fields\030\002 \003(\0132;.google"
          + ".firestore.v1.AggregationResult.Aggregat"
          + "eFieldsEntry\032R\n\024AggregateFieldsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022)\n\005value\030\002 \001(\0132\032.google.firest"
          + "ore.v1.Value:\0028\001B\316\001\n\027com.google.firestor"
          + "e.v1B\026AggregationResultProtoP\001Z;cloud.go"
          + "ogle.com/go/firestore/apiv1/firestorepb;"
          + "firestorepb\242\002\004GCFS\252\002\031Google.Cloud.Firest"
          + "ore.V1\312\002\031Google\\Cloud\\Firestore\\V1\352\002\034Goo"
          + "gle::Cloud::Firestore::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.firestore.v1.DocumentProto.getDescriptor(),
            });
    internal_static_google_firestore_v1_AggregationResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1_AggregationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_AggregationResult_descriptor,
            new java.lang.String[] {
              "AggregateFields",
            });
    internal_static_google_firestore_v1_AggregationResult_AggregateFieldsEntry_descriptor =
        internal_static_google_firestore_v1_AggregationResult_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1_AggregationResult_AggregateFieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_AggregationResult_AggregateFieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.firestore.v1.DocumentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
