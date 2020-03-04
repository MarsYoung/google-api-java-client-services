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

package com.google.api.services.composer.v1beta1.model;

/**
 * Allowed IP range with user-provided description.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AllowedIpRange extends com.google.api.client.json.GenericJson {

  /**
   * Optional. User-provided description. It must contain at most 300 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * IP address or range, defined using CIDR notation, of requests that this rule applies to. You
   * can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together.
   * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`           or
   * `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
   *
   * IP range prefixes should be properly truncated. For example, `1.2.3.4/24` should be truncated
   * to `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` should be truncated to `2001:db8::/32`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Optional. User-provided description. It must contain at most 300 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User-provided description. It must contain at most 300 characters.
   * @param description description or {@code null} for none
   */
  public AllowedIpRange setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * IP address or range, defined using CIDR notation, of requests that this rule applies to. You
   * can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together.
   * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`           or
   * `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
   *
   * IP range prefixes should be properly truncated. For example, `1.2.3.4/24` should be truncated
   * to `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` should be truncated to `2001:db8::/32`.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * IP address or range, defined using CIDR notation, of requests that this rule applies to. You
   * can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together.
   * Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32`           or
   * `2001:0db8:0000:0042:0000:8a2e:0370:7334`.
   *
   * IP range prefixes should be properly truncated. For example, `1.2.3.4/24` should be truncated
   * to `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` should be truncated to `2001:db8::/32`.
   * @param value value or {@code null} for none
   */
  public AllowedIpRange setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public AllowedIpRange set(String fieldName, Object value) {
    return (AllowedIpRange) super.set(fieldName, value);
  }

  @Override
  public AllowedIpRange clone() {
    return (AllowedIpRange) super.clone();
  }

}
