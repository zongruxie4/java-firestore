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

public interface RunAggregationQueryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.RunAggregationQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A single aggregation result.
   *
   * Not present when reporting partial progress.
   * </pre>
   *
   * <code>.google.firestore.v1.AggregationResult result = 1;</code>
   *
   * @return Whether the result field is set.
   */
  boolean hasResult();

  /**
   *
   *
   * <pre>
   * A single aggregation result.
   *
   * Not present when reporting partial progress.
   * </pre>
   *
   * <code>.google.firestore.v1.AggregationResult result = 1;</code>
   *
   * @return The result.
   */
  com.google.firestore.v1.AggregationResult getResult();

  /**
   *
   *
   * <pre>
   * A single aggregation result.
   *
   * Not present when reporting partial progress.
   * </pre>
   *
   * <code>.google.firestore.v1.AggregationResult result = 1;</code>
   */
  com.google.firestore.v1.AggregationResultOrBuilder getResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The transaction that was started as part of this request.
   *
   * Only present on the first response when the request requested to start
   * a new transaction.
   * </pre>
   *
   * <code>bytes transaction = 2;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * The time at which the aggregate result was computed. This is always
   * monotonically increasing; in this case, the previous AggregationResult in
   * the result stream are guaranteed not to have changed between their
   * `read_time` and this one.
   *
   * If the query returns no results, a response with `read_time` and no
   * `result` will be sent, and this represents the time at which the query
   * was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 3;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();

  /**
   *
   *
   * <pre>
   * The time at which the aggregate result was computed. This is always
   * monotonically increasing; in this case, the previous AggregationResult in
   * the result stream are guaranteed not to have changed between their
   * `read_time` and this one.
   *
   * If the query returns no results, a response with `read_time` and no
   * `result` will be sent, and this represents the time at which the query
   * was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 3;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();

  /**
   *
   *
   * <pre>
   * The time at which the aggregate result was computed. This is always
   * monotonically increasing; in this case, the previous AggregationResult in
   * the result stream are guaranteed not to have changed between their
   * `read_time` and this one.
   *
   * If the query returns no results, a response with `read_time` and no
   * `result` will be sent, and this represents the time at which the query
   * was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Query explain metrics. This is only present when the
   * [RunAggregationQueryRequest.explain_options][google.firestore.v1.RunAggregationQueryRequest.explain_options]
   * is provided, and it is sent only once with the last response in the stream.
   * </pre>
   *
   * <code>.google.firestore.v1.ExplainMetrics explain_metrics = 10;</code>
   *
   * @return Whether the explainMetrics field is set.
   */
  boolean hasExplainMetrics();

  /**
   *
   *
   * <pre>
   * Query explain metrics. This is only present when the
   * [RunAggregationQueryRequest.explain_options][google.firestore.v1.RunAggregationQueryRequest.explain_options]
   * is provided, and it is sent only once with the last response in the stream.
   * </pre>
   *
   * <code>.google.firestore.v1.ExplainMetrics explain_metrics = 10;</code>
   *
   * @return The explainMetrics.
   */
  com.google.firestore.v1.ExplainMetrics getExplainMetrics();

  /**
   *
   *
   * <pre>
   * Query explain metrics. This is only present when the
   * [RunAggregationQueryRequest.explain_options][google.firestore.v1.RunAggregationQueryRequest.explain_options]
   * is provided, and it is sent only once with the last response in the stream.
   * </pre>
   *
   * <code>.google.firestore.v1.ExplainMetrics explain_metrics = 10;</code>
   */
  com.google.firestore.v1.ExplainMetricsOrBuilder getExplainMetricsOrBuilder();
}
