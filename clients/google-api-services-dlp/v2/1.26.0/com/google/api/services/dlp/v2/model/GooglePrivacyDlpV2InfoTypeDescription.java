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

package com.google.api.services.dlp.v2.model;

/**
 * InfoType description.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2InfoTypeDescription extends com.google.api.client.json.GenericJson {

  /**
   * Description of the infotype. Translated when language is provided in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Human readable form of the infoType name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Internal name of the infoType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Which parts of the API supports this InfoType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supportedBy;

  /**
   * Description of the infotype. Translated when language is provided in the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the infotype. Translated when language is provided in the request.
   * @param description description or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeDescription setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Human readable form of the infoType name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Human readable form of the infoType name.
   * @param displayName displayName or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeDescription setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Internal name of the infoType.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Internal name of the infoType.
   * @param name name or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeDescription setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Which parts of the API supports this InfoType.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupportedBy() {
    return supportedBy;
  }

  /**
   * Which parts of the API supports this InfoType.
   * @param supportedBy supportedBy or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeDescription setSupportedBy(java.util.List<java.lang.String> supportedBy) {
    this.supportedBy = supportedBy;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InfoTypeDescription set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InfoTypeDescription) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InfoTypeDescription clone() {
    return (GooglePrivacyDlpV2InfoTypeDescription) super.clone();
  }

}