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
// source: google/firestore/v1/query.proto

// Protobuf Java Version: 3.25.8
package com.google.firestore.v1;

public interface StructuredQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.StructuredQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional sub-set of the fields to return.
   *
   * This acts as a [DocumentMask][google.firestore.v1.DocumentMask] over the
   * documents returned from a query. When not set, assumes that the caller
   * wants all fields returned.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery.Projection select = 1;</code>
   *
   * @return Whether the select field is set.
   */
  boolean hasSelect();

  /**
   *
   *
   * <pre>
   * Optional sub-set of the fields to return.
   *
   * This acts as a [DocumentMask][google.firestore.v1.DocumentMask] over the
   * documents returned from a query. When not set, assumes that the caller
   * wants all fields returned.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery.Projection select = 1;</code>
   *
   * @return The select.
   */
  com.google.firestore.v1.StructuredQuery.Projection getSelect();

  /**
   *
   *
   * <pre>
   * Optional sub-set of the fields to return.
   *
   * This acts as a [DocumentMask][google.firestore.v1.DocumentMask] over the
   * documents returned from a query. When not set, assumes that the caller
   * wants all fields returned.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery.Projection select = 1;</code>
   */
  com.google.firestore.v1.StructuredQuery.ProjectionOrBuilder getSelectOrBuilder();

  /**
   *
   *
   * <pre>
   * The collections to query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.CollectionSelector from = 2;</code>
   */
  java.util.List<com.google.firestore.v1.StructuredQuery.CollectionSelector> getFromList();

  /**
   *
   *
   * <pre>
   * The collections to query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.CollectionSelector from = 2;</code>
   */
  com.google.firestore.v1.StructuredQuery.CollectionSelector getFrom(int index);

  /**
   *
   *
   * <pre>
   * The collections to query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.CollectionSelector from = 2;</code>
   */
  int getFromCount();

  /**
   *
   *
   * <pre>
   * The collections to query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.CollectionSelector from = 2;</code>
   */
  java.util.List<? extends com.google.firestore.v1.StructuredQuery.CollectionSelectorOrBuilder>
      getFromOrBuilderList();

  /**
   *
   *
   * <pre>
   * The collections to query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.CollectionSelector from = 2;</code>
   */
  com.google.firestore.v1.StructuredQuery.CollectionSelectorOrBuilder getFromOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The filter to apply.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery.Filter where = 3;</code>
   *
   * @return Whether the where field is set.
   */
  boolean hasWhere();

  /**
   *
   *
   * <pre>
   * The filter to apply.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery.Filter where = 3;</code>
   *
   * @return The where.
   */
  com.google.firestore.v1.StructuredQuery.Filter getWhere();

  /**
   *
   *
   * <pre>
   * The filter to apply.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery.Filter where = 3;</code>
   */
  com.google.firestore.v1.StructuredQuery.FilterOrBuilder getWhereOrBuilder();

  /**
   *
   *
   * <pre>
   * The order to apply to the query results.
   *
   * Firestore allows callers to provide a full ordering, a partial ordering, or
   * no ordering at all. In all cases, Firestore guarantees a stable ordering
   * through the following rules:
   *
   *  * The `order_by` is required to reference all fields used with an
   *    inequality filter.
   *  * All fields that are required to be in the `order_by` but are not already
   *    present are appended in lexicographical ordering of the field name.
   *  * If an order on `__name__` is not specified, it is appended by default.
   *
   * Fields are appended with the same sort direction as the last order
   * specified, or 'ASCENDING' if no order was specified. For example:
   *
   *  * `ORDER BY a` becomes `ORDER BY a ASC, __name__ ASC`
   *  * `ORDER BY a DESC` becomes `ORDER BY a DESC, __name__ DESC`
   *  * `WHERE a &gt; 1` becomes `WHERE a &gt; 1 ORDER BY a ASC, __name__ ASC`
   *  * `WHERE __name__ &gt; ... AND a &gt; 1` becomes
   *     `WHERE __name__ &gt; ... AND a &gt; 1 ORDER BY a ASC, __name__ ASC`
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.Order order_by = 4;</code>
   */
  java.util.List<com.google.firestore.v1.StructuredQuery.Order> getOrderByList();

  /**
   *
   *
   * <pre>
   * The order to apply to the query results.
   *
   * Firestore allows callers to provide a full ordering, a partial ordering, or
   * no ordering at all. In all cases, Firestore guarantees a stable ordering
   * through the following rules:
   *
   *  * The `order_by` is required to reference all fields used with an
   *    inequality filter.
   *  * All fields that are required to be in the `order_by` but are not already
   *    present are appended in lexicographical ordering of the field name.
   *  * If an order on `__name__` is not specified, it is appended by default.
   *
   * Fields are appended with the same sort direction as the last order
   * specified, or 'ASCENDING' if no order was specified. For example:
   *
   *  * `ORDER BY a` becomes `ORDER BY a ASC, __name__ ASC`
   *  * `ORDER BY a DESC` becomes `ORDER BY a DESC, __name__ DESC`
   *  * `WHERE a &gt; 1` becomes `WHERE a &gt; 1 ORDER BY a ASC, __name__ ASC`
   *  * `WHERE __name__ &gt; ... AND a &gt; 1` becomes
   *     `WHERE __name__ &gt; ... AND a &gt; 1 ORDER BY a ASC, __name__ ASC`
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.Order order_by = 4;</code>
   */
  com.google.firestore.v1.StructuredQuery.Order getOrderBy(int index);

  /**
   *
   *
   * <pre>
   * The order to apply to the query results.
   *
   * Firestore allows callers to provide a full ordering, a partial ordering, or
   * no ordering at all. In all cases, Firestore guarantees a stable ordering
   * through the following rules:
   *
   *  * The `order_by` is required to reference all fields used with an
   *    inequality filter.
   *  * All fields that are required to be in the `order_by` but are not already
   *    present are appended in lexicographical ordering of the field name.
   *  * If an order on `__name__` is not specified, it is appended by default.
   *
   * Fields are appended with the same sort direction as the last order
   * specified, or 'ASCENDING' if no order was specified. For example:
   *
   *  * `ORDER BY a` becomes `ORDER BY a ASC, __name__ ASC`
   *  * `ORDER BY a DESC` becomes `ORDER BY a DESC, __name__ DESC`
   *  * `WHERE a &gt; 1` becomes `WHERE a &gt; 1 ORDER BY a ASC, __name__ ASC`
   *  * `WHERE __name__ &gt; ... AND a &gt; 1` becomes
   *     `WHERE __name__ &gt; ... AND a &gt; 1 ORDER BY a ASC, __name__ ASC`
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.Order order_by = 4;</code>
   */
  int getOrderByCount();

  /**
   *
   *
   * <pre>
   * The order to apply to the query results.
   *
   * Firestore allows callers to provide a full ordering, a partial ordering, or
   * no ordering at all. In all cases, Firestore guarantees a stable ordering
   * through the following rules:
   *
   *  * The `order_by` is required to reference all fields used with an
   *    inequality filter.
   *  * All fields that are required to be in the `order_by` but are not already
   *    present are appended in lexicographical ordering of the field name.
   *  * If an order on `__name__` is not specified, it is appended by default.
   *
   * Fields are appended with the same sort direction as the last order
   * specified, or 'ASCENDING' if no order was specified. For example:
   *
   *  * `ORDER BY a` becomes `ORDER BY a ASC, __name__ ASC`
   *  * `ORDER BY a DESC` becomes `ORDER BY a DESC, __name__ DESC`
   *  * `WHERE a &gt; 1` becomes `WHERE a &gt; 1 ORDER BY a ASC, __name__ ASC`
   *  * `WHERE __name__ &gt; ... AND a &gt; 1` becomes
   *     `WHERE __name__ &gt; ... AND a &gt; 1 ORDER BY a ASC, __name__ ASC`
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.Order order_by = 4;</code>
   */
  java.util.List<? extends com.google.firestore.v1.StructuredQuery.OrderOrBuilder>
      getOrderByOrBuilderList();

  /**
   *
   *
   * <pre>
   * The order to apply to the query results.
   *
   * Firestore allows callers to provide a full ordering, a partial ordering, or
   * no ordering at all. In all cases, Firestore guarantees a stable ordering
   * through the following rules:
   *
   *  * The `order_by` is required to reference all fields used with an
   *    inequality filter.
   *  * All fields that are required to be in the `order_by` but are not already
   *    present are appended in lexicographical ordering of the field name.
   *  * If an order on `__name__` is not specified, it is appended by default.
   *
   * Fields are appended with the same sort direction as the last order
   * specified, or 'ASCENDING' if no order was specified. For example:
   *
   *  * `ORDER BY a` becomes `ORDER BY a ASC, __name__ ASC`
   *  * `ORDER BY a DESC` becomes `ORDER BY a DESC, __name__ DESC`
   *  * `WHERE a &gt; 1` becomes `WHERE a &gt; 1 ORDER BY a ASC, __name__ ASC`
   *  * `WHERE __name__ &gt; ... AND a &gt; 1` becomes
   *     `WHERE __name__ &gt; ... AND a &gt; 1 ORDER BY a ASC, __name__ ASC`
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredQuery.Order order_by = 4;</code>
   */
  com.google.firestore.v1.StructuredQuery.OrderOrBuilder getOrderByOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A potential prefix of a position in the result set to start the query at.
   *
   * The ordering of the result set is based on the `ORDER BY` clause of the
   * original query.
   *
   * ```
   * SELECT * FROM k WHERE a = 1 AND b &gt; 2 ORDER BY b ASC, __name__ ASC;
   * ```
   *
   * This query's results are ordered by `(b ASC, __name__ ASC)`.
   *
   * Cursors can reference either the full ordering or a prefix of the location,
   * though it cannot reference more fields than what are in the provided
   * `ORDER BY`.
   *
   * Continuing off the example above, attaching the following start cursors
   * will have varying impact:
   *
   * - `START BEFORE (2, /k/123)`: start the query right before `a = 1 AND
   *    b &gt; 2 AND __name__ &gt; /k/123`.
   * - `START AFTER (10)`: start the query right after `a = 1 AND b &gt; 10`.
   *
   * Unlike `OFFSET` which requires scanning over the first N results to skip,
   * a start cursor allows the query to begin at a logical position. This
   * position is not required to match an actual result, it will scan forward
   * from this position to find the next document.
   *
   * Requires:
   *
   * * The number of values cannot be greater than the number of fields
   *   specified in the `ORDER BY` clause.
   * </pre>
   *
   * <code>.google.firestore.v1.Cursor start_at = 7;</code>
   *
   * @return Whether the startAt field is set.
   */
  boolean hasStartAt();

  /**
   *
   *
   * <pre>
   * A potential prefix of a position in the result set to start the query at.
   *
   * The ordering of the result set is based on the `ORDER BY` clause of the
   * original query.
   *
   * ```
   * SELECT * FROM k WHERE a = 1 AND b &gt; 2 ORDER BY b ASC, __name__ ASC;
   * ```
   *
   * This query's results are ordered by `(b ASC, __name__ ASC)`.
   *
   * Cursors can reference either the full ordering or a prefix of the location,
   * though it cannot reference more fields than what are in the provided
   * `ORDER BY`.
   *
   * Continuing off the example above, attaching the following start cursors
   * will have varying impact:
   *
   * - `START BEFORE (2, /k/123)`: start the query right before `a = 1 AND
   *    b &gt; 2 AND __name__ &gt; /k/123`.
   * - `START AFTER (10)`: start the query right after `a = 1 AND b &gt; 10`.
   *
   * Unlike `OFFSET` which requires scanning over the first N results to skip,
   * a start cursor allows the query to begin at a logical position. This
   * position is not required to match an actual result, it will scan forward
   * from this position to find the next document.
   *
   * Requires:
   *
   * * The number of values cannot be greater than the number of fields
   *   specified in the `ORDER BY` clause.
   * </pre>
   *
   * <code>.google.firestore.v1.Cursor start_at = 7;</code>
   *
   * @return The startAt.
   */
  com.google.firestore.v1.Cursor getStartAt();

  /**
   *
   *
   * <pre>
   * A potential prefix of a position in the result set to start the query at.
   *
   * The ordering of the result set is based on the `ORDER BY` clause of the
   * original query.
   *
   * ```
   * SELECT * FROM k WHERE a = 1 AND b &gt; 2 ORDER BY b ASC, __name__ ASC;
   * ```
   *
   * This query's results are ordered by `(b ASC, __name__ ASC)`.
   *
   * Cursors can reference either the full ordering or a prefix of the location,
   * though it cannot reference more fields than what are in the provided
   * `ORDER BY`.
   *
   * Continuing off the example above, attaching the following start cursors
   * will have varying impact:
   *
   * - `START BEFORE (2, /k/123)`: start the query right before `a = 1 AND
   *    b &gt; 2 AND __name__ &gt; /k/123`.
   * - `START AFTER (10)`: start the query right after `a = 1 AND b &gt; 10`.
   *
   * Unlike `OFFSET` which requires scanning over the first N results to skip,
   * a start cursor allows the query to begin at a logical position. This
   * position is not required to match an actual result, it will scan forward
   * from this position to find the next document.
   *
   * Requires:
   *
   * * The number of values cannot be greater than the number of fields
   *   specified in the `ORDER BY` clause.
   * </pre>
   *
   * <code>.google.firestore.v1.Cursor start_at = 7;</code>
   */
  com.google.firestore.v1.CursorOrBuilder getStartAtOrBuilder();

  /**
   *
   *
   * <pre>
   * A potential prefix of a position in the result set to end the query at.
   *
   * This is similar to `START_AT` but with it controlling the end position
   * rather than the start position.
   *
   * Requires:
   *
   * * The number of values cannot be greater than the number of fields
   *   specified in the `ORDER BY` clause.
   * </pre>
   *
   * <code>.google.firestore.v1.Cursor end_at = 8;</code>
   *
   * @return Whether the endAt field is set.
   */
  boolean hasEndAt();

  /**
   *
   *
   * <pre>
   * A potential prefix of a position in the result set to end the query at.
   *
   * This is similar to `START_AT` but with it controlling the end position
   * rather than the start position.
   *
   * Requires:
   *
   * * The number of values cannot be greater than the number of fields
   *   specified in the `ORDER BY` clause.
   * </pre>
   *
   * <code>.google.firestore.v1.Cursor end_at = 8;</code>
   *
   * @return The endAt.
   */
  com.google.firestore.v1.Cursor getEndAt();

  /**
   *
   *
   * <pre>
   * A potential prefix of a position in the result set to end the query at.
   *
   * This is similar to `START_AT` but with it controlling the end position
   * rather than the start position.
   *
   * Requires:
   *
   * * The number of values cannot be greater than the number of fields
   *   specified in the `ORDER BY` clause.
   * </pre>
   *
   * <code>.google.firestore.v1.Cursor end_at = 8;</code>
   */
  com.google.firestore.v1.CursorOrBuilder getEndAtOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of documents to skip before returning the first result.
   *
   * This applies after the constraints specified by the `WHERE`, `START AT`, &amp;
   * `END AT` but before the `LIMIT` clause.
   *
   * Requires:
   *
   * * The value must be greater than or equal to zero if specified.
   * </pre>
   *
   * <code>int32 offset = 6;</code>
   *
   * @return The offset.
   */
  int getOffset();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return.
   *
   * Applies after all other constraints.
   *
   * Requires:
   *
   * * The value must be greater than or equal to zero if specified.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 5;</code>
   *
   * @return Whether the limit field is set.
   */
  boolean hasLimit();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return.
   *
   * Applies after all other constraints.
   *
   * Requires:
   *
   * * The value must be greater than or equal to zero if specified.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 5;</code>
   *
   * @return The limit.
   */
  com.google.protobuf.Int32Value getLimit();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return.
   *
   * Applies after all other constraints.
   *
   * Requires:
   *
   * * The value must be greater than or equal to zero if specified.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A potential nearest neighbors search.
   *
   * Applies after all other filters and ordering.
   *
   * Finds the closest vector embeddings to the given query vector.
   * </pre>
   *
   * <code>
   * .google.firestore.v1.StructuredQuery.FindNearest find_nearest = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the findNearest field is set.
   */
  boolean hasFindNearest();

  /**
   *
   *
   * <pre>
   * Optional. A potential nearest neighbors search.
   *
   * Applies after all other filters and ordering.
   *
   * Finds the closest vector embeddings to the given query vector.
   * </pre>
   *
   * <code>
   * .google.firestore.v1.StructuredQuery.FindNearest find_nearest = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The findNearest.
   */
  com.google.firestore.v1.StructuredQuery.FindNearest getFindNearest();

  /**
   *
   *
   * <pre>
   * Optional. A potential nearest neighbors search.
   *
   * Applies after all other filters and ordering.
   *
   * Finds the closest vector embeddings to the given query vector.
   * </pre>
   *
   * <code>
   * .google.firestore.v1.StructuredQuery.FindNearest find_nearest = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.firestore.v1.StructuredQuery.FindNearestOrBuilder getFindNearestOrBuilder();
}
