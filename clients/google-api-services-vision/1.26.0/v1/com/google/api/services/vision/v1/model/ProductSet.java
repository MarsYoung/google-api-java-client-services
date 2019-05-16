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

package com.google.api.services.vision.v1.model;

/**
 * A ProductSet contains Products. A ProductSet can contain a maximum of 1 million reference images.
 * If the limit is exceeded, periodic indexing will fail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductSet extends com.google.api.client.json.GenericJson {

  /**
   * The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters
   * long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. If there was an error with indexing the product set, the field is populated.
   *
   * This field is ignored when creating a ProductSet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status indexError;

  /**
   * Output only. The time at which this ProductSet was last indexed. Query results will reflect all
   * updates before this time. If this ProductSet has never been indexed, this timestamp is the
   * default value "1970-01-01T00:00:00Z".
   *
   * This field is ignored when creating a ProductSet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String indexTime;

  /**
   * The resource name of the ProductSet.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   *
   * This field is ignored when creating a ProductSet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters
   * long.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters
   * long.
   * @param displayName displayName or {@code null} for none
   */
  public ProductSet setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. If there was an error with indexing the product set, the field is populated.
   *
   * This field is ignored when creating a ProductSet.
   * @return value or {@code null} for none
   */
  public Status getIndexError() {
    return indexError;
  }

  /**
   * Output only. If there was an error with indexing the product set, the field is populated.
   *
   * This field is ignored when creating a ProductSet.
   * @param indexError indexError or {@code null} for none
   */
  public ProductSet setIndexError(Status indexError) {
    this.indexError = indexError;
    return this;
  }

  /**
   * Output only. The time at which this ProductSet was last indexed. Query results will reflect all
   * updates before this time. If this ProductSet has never been indexed, this timestamp is the
   * default value "1970-01-01T00:00:00Z".
   *
   * This field is ignored when creating a ProductSet.
   * @return value or {@code null} for none
   */
  public String getIndexTime() {
    return indexTime;
  }

  /**
   * Output only. The time at which this ProductSet was last indexed. Query results will reflect all
   * updates before this time. If this ProductSet has never been indexed, this timestamp is the
   * default value "1970-01-01T00:00:00Z".
   *
   * This field is ignored when creating a ProductSet.
   * @param indexTime indexTime or {@code null} for none
   */
  public ProductSet setIndexTime(String indexTime) {
    this.indexTime = indexTime;
    return this;
  }

  /**
   * The resource name of the ProductSet.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   *
   * This field is ignored when creating a ProductSet.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the ProductSet.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   *
   * This field is ignored when creating a ProductSet.
   * @param name name or {@code null} for none
   */
  public ProductSet setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ProductSet set(String fieldName, Object value) {
    return (ProductSet) super.set(fieldName, value);
  }

  @Override
  public ProductSet clone() {
    return (ProductSet) super.clone();
  }

}