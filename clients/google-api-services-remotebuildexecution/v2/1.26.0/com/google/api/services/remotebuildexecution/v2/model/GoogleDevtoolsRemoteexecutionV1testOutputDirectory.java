/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * An `OutputDirectory` is the output in an `ActionResult` corresponding to a directory's full
 * contents rather than a single file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemoteexecutionV1testOutputDirectory extends com.google.api.client.json.GenericJson {

  /**
   * DEPRECATED: This field is deprecated and should no longer be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemoteexecutionV1testDigest digest;

  /**
   * The full path of the directory relative to the working directory. The path separator is a
   * forward slash `/`. Since this is a relative path, it MUST NOT begin with a leading forward
   * slash. The empty string value is allowed, and it denotes the entire working directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The digest of the encoded Tree proto containing the directory's contents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemoteexecutionV1testDigest treeDigest;

  /**
   * DEPRECATED: This field is deprecated and should no longer be used.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testDigest getDigest() {
    return digest;
  }

  /**
   * DEPRECATED: This field is deprecated and should no longer be used.
   * @param digest digest or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputDirectory setDigest(GoogleDevtoolsRemoteexecutionV1testDigest digest) {
    this.digest = digest;
    return this;
  }

  /**
   * The full path of the directory relative to the working directory. The path separator is a
   * forward slash `/`. Since this is a relative path, it MUST NOT begin with a leading forward
   * slash. The empty string value is allowed, and it denotes the entire working directory.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The full path of the directory relative to the working directory. The path separator is a
   * forward slash `/`. Since this is a relative path, it MUST NOT begin with a leading forward
   * slash. The empty string value is allowed, and it denotes the entire working directory.
   * @param path path or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputDirectory setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * The digest of the encoded Tree proto containing the directory's contents.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testDigest getTreeDigest() {
    return treeDigest;
  }

  /**
   * The digest of the encoded Tree proto containing the directory's contents.
   * @param treeDigest treeDigest or {@code null} for none
   */
  public GoogleDevtoolsRemoteexecutionV1testOutputDirectory setTreeDigest(GoogleDevtoolsRemoteexecutionV1testDigest treeDigest) {
    this.treeDigest = treeDigest;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteexecutionV1testOutputDirectory set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteexecutionV1testOutputDirectory) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteexecutionV1testOutputDirectory clone() {
    return (GoogleDevtoolsRemoteexecutionV1testOutputDirectory) super.clone();
  }

}