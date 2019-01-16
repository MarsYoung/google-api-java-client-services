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

package com.google.api.services.partners.v2.model;

/**
 * Values to use instead of the user's respective defaults. These are only honored by whitelisted
 * products.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserOverrides extends com.google.api.client.json.GenericJson {

  /**
   * IP address to use instead of the user's geo-located IP address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * Logged-in user ID to impersonate instead of the user's ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * IP address to use instead of the user's geo-located IP address.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * IP address to use instead of the user's geo-located IP address.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public UserOverrides setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Logged-in user ID to impersonate instead of the user's ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Logged-in user ID to impersonate instead of the user's ID.
   * @param userId userId or {@code null} for none
   */
  public UserOverrides setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public UserOverrides set(String fieldName, Object value) {
    return (UserOverrides) super.set(fieldName, value);
  }

  @Override
  public UserOverrides clone() {
    return (UserOverrides) super.clone();
  }

}
