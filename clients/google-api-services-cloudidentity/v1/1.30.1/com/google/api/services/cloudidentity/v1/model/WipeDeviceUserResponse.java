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

package com.google.api.services.cloudidentity.v1.model;

/**
 * Response message for wiping the user's account from the device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WipeDeviceUserResponse extends com.google.api.client.json.GenericJson {

  /**
   * Resultant DeviceUser object for the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceUser deviceUser;

  /**
   * Resultant DeviceUser object for the action.
   * @return value or {@code null} for none
   */
  public DeviceUser getDeviceUser() {
    return deviceUser;
  }

  /**
   * Resultant DeviceUser object for the action.
   * @param deviceUser deviceUser or {@code null} for none
   */
  public WipeDeviceUserResponse setDeviceUser(DeviceUser deviceUser) {
    this.deviceUser = deviceUser;
    return this;
  }

  @Override
  public WipeDeviceUserResponse set(String fieldName, Object value) {
    return (WipeDeviceUserResponse) super.set(fieldName, value);
  }

  @Override
  public WipeDeviceUserResponse clone() {
    return (WipeDeviceUserResponse) super.clone();
  }

}
