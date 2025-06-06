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

public interface RestoreDatabaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.admin.v1.RestoreDatabaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project to restore the database in. Format is
   * `projects/{project_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The project to restore the database in. Format is
   * `projects/{project_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the database, which will become the final
   * component of the database's resource name. This database ID must not be
   * associated with an existing database.
   *
   * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
   * with first character a letter and the last a letter or a number. Must not
   * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
   *
   * "(default)" database ID is also valid.
   * </pre>
   *
   * <code>string database_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The databaseId.
   */
  java.lang.String getDatabaseId();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the database, which will become the final
   * component of the database's resource name. This database ID must not be
   * associated with an existing database.
   *
   * This value should be 4-63 characters. Valid characters are /[a-z][0-9]-/
   * with first character a letter and the last a letter or a number. Must not
   * be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
   *
   * "(default)" database ID is also valid.
   * </pre>
   *
   * <code>string database_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for databaseId.
   */
  com.google.protobuf.ByteString getDatabaseIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Backup to restore from. Must be from the same project as the
   * parent.
   *
   * The restored database will be created in the same location as the source
   * backup.
   *
   * Format is: `projects/{project_id}/locations/{location}/backups/{backup}`
   * </pre>
   *
   * <code>
   * string backup = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backup.
   */
  java.lang.String getBackup();

  /**
   *
   *
   * <pre>
   * Required. Backup to restore from. Must be from the same project as the
   * parent.
   *
   * The restored database will be created in the same location as the source
   * backup.
   *
   * Format is: `projects/{project_id}/locations/{location}/backups/{backup}`
   * </pre>
   *
   * <code>
   * string backup = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backup.
   */
  com.google.protobuf.ByteString getBackupBytes();

  /**
   *
   *
   * <pre>
   * Optional. Encryption configuration for the restored database.
   *
   * If this field is not specified, the restored database will use
   * the same encryption configuration as the backup, namely
   * [use_source_encryption][google.firestore.admin.v1.Database.EncryptionConfig.use_source_encryption].
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.Database.EncryptionConfig encryption_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();

  /**
   *
   *
   * <pre>
   * Optional. Encryption configuration for the restored database.
   *
   * If this field is not specified, the restored database will use
   * the same encryption configuration as the backup, namely
   * [use_source_encryption][google.firestore.admin.v1.Database.EncryptionConfig.use_source_encryption].
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.Database.EncryptionConfig encryption_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.firestore.admin.v1.Database.EncryptionConfig getEncryptionConfig();

  /**
   *
   *
   * <pre>
   * Optional. Encryption configuration for the restored database.
   *
   * If this field is not specified, the restored database will use
   * the same encryption configuration as the backup, namely
   * [use_source_encryption][google.firestore.admin.v1.Database.EncryptionConfig.use_source_encryption].
   * </pre>
   *
   * <code>
   * .google.firestore.admin.v1.Database.EncryptionConfig encryption_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.firestore.admin.v1.Database.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();
}
