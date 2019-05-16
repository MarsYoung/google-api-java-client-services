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

package com.google.api.services.fusiontables.model;

/**
 * Represents a list of tables.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableList extends com.google.api.client.json.GenericJson {

  /**
   * List of all requested tables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Table> items;

  static {
    // hack to force ProGuard to consider Table used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Table.class);
  }

  /**
   * Type name: a list of all tables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Token used to access the next page of this result. No token is displayed if there are no more
   * pages left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of all requested tables.
   * @return value or {@code null} for none
   */
  public java.util.List<Table> getItems() {
    return items;
  }

  /**
   * List of all requested tables.
   * @param items items or {@code null} for none
   */
  public TableList setItems(java.util.List<Table> items) {
    this.items = items;
    return this;
  }

  /**
   * Type name: a list of all tables.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type name: a list of all tables.
   * @param kind kind or {@code null} for none
   */
  public TableList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Token used to access the next page of this result. No token is displayed if there are no more
   * pages left.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token used to access the next page of this result. No token is displayed if there are no more
   * pages left.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public TableList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public TableList set(String fieldName, Object value) {
    return (TableList) super.set(fieldName, value);
  }

  @Override
  public TableList clone() {
    return (TableList) super.clone();
  }

}