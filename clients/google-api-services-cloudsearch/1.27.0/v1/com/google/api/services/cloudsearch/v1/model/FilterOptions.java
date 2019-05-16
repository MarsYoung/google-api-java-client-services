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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Filter options to be applied on query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FilterOptions extends com.google.api.client.json.GenericJson {

  /**
   * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Filter filter;

  /**
   * If object_type is set, only objects of that type are returned. This should correspond to the
   * name of the object that was registered within the definition of schema. The maximum length is
   * 256 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectType;

  /**
   * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
   * @return value or {@code null} for none
   */
  public Filter getFilter() {
    return filter;
  }

  /**
   * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
   * @param filter filter or {@code null} for none
   */
  public FilterOptions setFilter(Filter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * If object_type is set, only objects of that type are returned. This should correspond to the
   * name of the object that was registered within the definition of schema. The maximum length is
   * 256 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectType() {
    return objectType;
  }

  /**
   * If object_type is set, only objects of that type are returned. This should correspond to the
   * name of the object that was registered within the definition of schema. The maximum length is
   * 256 characters.
   * @param objectType objectType or {@code null} for none
   */
  public FilterOptions setObjectType(java.lang.String objectType) {
    this.objectType = objectType;
    return this;
  }

  @Override
  public FilterOptions set(String fieldName, Object value) {
    return (FilterOptions) super.set(fieldName, value);
  }

  @Override
  public FilterOptions clone() {
    return (FilterOptions) super.clone();
  }

}