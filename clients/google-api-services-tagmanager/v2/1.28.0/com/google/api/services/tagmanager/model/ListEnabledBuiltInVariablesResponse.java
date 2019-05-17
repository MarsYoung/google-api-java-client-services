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

package com.google.api.services.tagmanager.model;

/**
 * A list of enabled built-in variables.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListEnabledBuiltInVariablesResponse extends com.google.api.client.json.GenericJson {

  /**
   * All GTM BuiltInVariables of a GTM container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuiltInVariable> builtInVariable;

  static {
    // hack to force ProGuard to consider BuiltInVariable used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BuiltInVariable.class);
  }

  /**
   * Continuation token for fetching the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * All GTM BuiltInVariables of a GTM container.
   * @return value or {@code null} for none
   */
  public java.util.List<BuiltInVariable> getBuiltInVariable() {
    return builtInVariable;
  }

  /**
   * All GTM BuiltInVariables of a GTM container.
   * @param builtInVariable builtInVariable or {@code null} for none
   */
  public ListEnabledBuiltInVariablesResponse setBuiltInVariable(java.util.List<BuiltInVariable> builtInVariable) {
    this.builtInVariable = builtInVariable;
    return this;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListEnabledBuiltInVariablesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListEnabledBuiltInVariablesResponse set(String fieldName, Object value) {
    return (ListEnabledBuiltInVariablesResponse) super.set(fieldName, value);
  }

  @Override
  public ListEnabledBuiltInVariablesResponse clone() {
    return (ListEnabledBuiltInVariablesResponse) super.clone();
  }

}