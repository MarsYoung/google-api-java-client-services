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

package com.google.api.services.androidenterprise.model;

/**
 * Id to name association of a track.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrackInfo extends com.google.api.client.json.GenericJson {

  /**
   * A changeable, user-friendly name for a track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackAlias;

  /**
   * A unique an unchangeable identifier of a test track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackId;

  /**
   * A changeable, user-friendly name for a track.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackAlias() {
    return trackAlias;
  }

  /**
   * A changeable, user-friendly name for a track.
   * @param trackAlias trackAlias or {@code null} for none
   */
  public TrackInfo setTrackAlias(java.lang.String trackAlias) {
    this.trackAlias = trackAlias;
    return this;
  }

  /**
   * A unique an unchangeable identifier of a test track.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackId() {
    return trackId;
  }

  /**
   * A unique an unchangeable identifier of a test track.
   * @param trackId trackId or {@code null} for none
   */
  public TrackInfo setTrackId(java.lang.String trackId) {
    this.trackId = trackId;
    return this;
  }

  @Override
  public TrackInfo set(String fieldName, Object value) {
    return (TrackInfo) super.set(fieldName, value);
  }

  @Override
  public TrackInfo clone() {
    return (TrackInfo) super.clone();
  }

}
