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
 * Resource representing the Android specific attributes of a Device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidAttributes extends com.google.api.client.json.GenericJson {

  /**
   * Baseband version of Android device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String basebandVersion;

  /**
   * Device bootloader version. Example: 0.6.7.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootloaderVersion;

  /**
   * Build number of Android device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buildNumber;

  /**
   * Whether developer options is enabled on device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabledDeveloperOptions;

  /**
   * Whether applications from unknown sources can be installed on device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabledUnknownSources;

  /**
   * Whether adb (USB debugging) is enabled on device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabledUsbDebugging;

  /**
   * Device encryption state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionState;

  /**
   * Device hardware. Example: Sprout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hardware;

  /**
   * Kernel version of Android device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kernelVersion;

  /**
   * Domain name for Google accounts on device. Type for other accounts on device. Will only be
   * populated if |ownership_privilege| is |PROFILE_OWNER| or |DEVICE_OWNER|. Does not include the
   * account signed in to the device policy app if that account's domain has only one account.
   * Examples: "com.example", "xyz.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> otherAccounts;

  /**
   * Whether this account is on an owner/primary profile. For phones, only true for owner profiles.
   * Android 4+ devices can have secondary or restricted user profiles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ownerProfileAccount;

  /**
   * Ownership privileges on device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ownershipPrivilege;

  /**
   * OS security patch update time on device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String securityPatchTime;

  /**
   * Whether device supports Android work profiles. If false, this service will not block access to
   * corp data even if an administrator turns on the "Enforce Work Profile" policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsWorkProfile;

  /**
   * Baseband version of Android device.
   * @return value or {@code null} for none
   */
  public java.lang.String getBasebandVersion() {
    return basebandVersion;
  }

  /**
   * Baseband version of Android device.
   * @param basebandVersion basebandVersion or {@code null} for none
   */
  public AndroidAttributes setBasebandVersion(java.lang.String basebandVersion) {
    this.basebandVersion = basebandVersion;
    return this;
  }

  /**
   * Device bootloader version. Example: 0.6.7.
   * @return value or {@code null} for none
   */
  public java.lang.String getBootloaderVersion() {
    return bootloaderVersion;
  }

  /**
   * Device bootloader version. Example: 0.6.7.
   * @param bootloaderVersion bootloaderVersion or {@code null} for none
   */
  public AndroidAttributes setBootloaderVersion(java.lang.String bootloaderVersion) {
    this.bootloaderVersion = bootloaderVersion;
    return this;
  }

  /**
   * Build number of Android device.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuildNumber() {
    return buildNumber;
  }

  /**
   * Build number of Android device.
   * @param buildNumber buildNumber or {@code null} for none
   */
  public AndroidAttributes setBuildNumber(java.lang.String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  /**
   * Whether developer options is enabled on device.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabledDeveloperOptions() {
    return enabledDeveloperOptions;
  }

  /**
   * Whether developer options is enabled on device.
   * @param enabledDeveloperOptions enabledDeveloperOptions or {@code null} for none
   */
  public AndroidAttributes setEnabledDeveloperOptions(java.lang.Boolean enabledDeveloperOptions) {
    this.enabledDeveloperOptions = enabledDeveloperOptions;
    return this;
  }

  /**
   * Whether applications from unknown sources can be installed on device.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabledUnknownSources() {
    return enabledUnknownSources;
  }

  /**
   * Whether applications from unknown sources can be installed on device.
   * @param enabledUnknownSources enabledUnknownSources or {@code null} for none
   */
  public AndroidAttributes setEnabledUnknownSources(java.lang.Boolean enabledUnknownSources) {
    this.enabledUnknownSources = enabledUnknownSources;
    return this;
  }

  /**
   * Whether adb (USB debugging) is enabled on device.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabledUsbDebugging() {
    return enabledUsbDebugging;
  }

  /**
   * Whether adb (USB debugging) is enabled on device.
   * @param enabledUsbDebugging enabledUsbDebugging or {@code null} for none
   */
  public AndroidAttributes setEnabledUsbDebugging(java.lang.Boolean enabledUsbDebugging) {
    this.enabledUsbDebugging = enabledUsbDebugging;
    return this;
  }

  /**
   * Device encryption state.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionState() {
    return encryptionState;
  }

  /**
   * Device encryption state.
   * @param encryptionState encryptionState or {@code null} for none
   */
  public AndroidAttributes setEncryptionState(java.lang.String encryptionState) {
    this.encryptionState = encryptionState;
    return this;
  }

  /**
   * Device hardware. Example: Sprout.
   * @return value or {@code null} for none
   */
  public java.lang.String getHardware() {
    return hardware;
  }

  /**
   * Device hardware. Example: Sprout.
   * @param hardware hardware or {@code null} for none
   */
  public AndroidAttributes setHardware(java.lang.String hardware) {
    this.hardware = hardware;
    return this;
  }

  /**
   * Kernel version of Android device.
   * @return value or {@code null} for none
   */
  public java.lang.String getKernelVersion() {
    return kernelVersion;
  }

  /**
   * Kernel version of Android device.
   * @param kernelVersion kernelVersion or {@code null} for none
   */
  public AndroidAttributes setKernelVersion(java.lang.String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * Domain name for Google accounts on device. Type for other accounts on device. Will only be
   * populated if |ownership_privilege| is |PROFILE_OWNER| or |DEVICE_OWNER|. Does not include the
   * account signed in to the device policy app if that account's domain has only one account.
   * Examples: "com.example", "xyz.com".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOtherAccounts() {
    return otherAccounts;
  }

  /**
   * Domain name for Google accounts on device. Type for other accounts on device. Will only be
   * populated if |ownership_privilege| is |PROFILE_OWNER| or |DEVICE_OWNER|. Does not include the
   * account signed in to the device policy app if that account's domain has only one account.
   * Examples: "com.example", "xyz.com".
   * @param otherAccounts otherAccounts or {@code null} for none
   */
  public AndroidAttributes setOtherAccounts(java.util.List<java.lang.String> otherAccounts) {
    this.otherAccounts = otherAccounts;
    return this;
  }

  /**
   * Whether this account is on an owner/primary profile. For phones, only true for owner profiles.
   * Android 4+ devices can have secondary or restricted user profiles.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOwnerProfileAccount() {
    return ownerProfileAccount;
  }

  /**
   * Whether this account is on an owner/primary profile. For phones, only true for owner profiles.
   * Android 4+ devices can have secondary or restricted user profiles.
   * @param ownerProfileAccount ownerProfileAccount or {@code null} for none
   */
  public AndroidAttributes setOwnerProfileAccount(java.lang.Boolean ownerProfileAccount) {
    this.ownerProfileAccount = ownerProfileAccount;
    return this;
  }

  /**
   * Ownership privileges on device.
   * @return value or {@code null} for none
   */
  public java.lang.String getOwnershipPrivilege() {
    return ownershipPrivilege;
  }

  /**
   * Ownership privileges on device.
   * @param ownershipPrivilege ownershipPrivilege or {@code null} for none
   */
  public AndroidAttributes setOwnershipPrivilege(java.lang.String ownershipPrivilege) {
    this.ownershipPrivilege = ownershipPrivilege;
    return this;
  }

  /**
   * OS security patch update time on device.
   * @return value or {@code null} for none
   */
  public String getSecurityPatchTime() {
    return securityPatchTime;
  }

  /**
   * OS security patch update time on device.
   * @param securityPatchTime securityPatchTime or {@code null} for none
   */
  public AndroidAttributes setSecurityPatchTime(String securityPatchTime) {
    this.securityPatchTime = securityPatchTime;
    return this;
  }

  /**
   * Whether device supports Android work profiles. If false, this service will not block access to
   * corp data even if an administrator turns on the "Enforce Work Profile" policy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsWorkProfile() {
    return supportsWorkProfile;
  }

  /**
   * Whether device supports Android work profiles. If false, this service will not block access to
   * corp data even if an administrator turns on the "Enforce Work Profile" policy.
   * @param supportsWorkProfile supportsWorkProfile or {@code null} for none
   */
  public AndroidAttributes setSupportsWorkProfile(java.lang.Boolean supportsWorkProfile) {
    this.supportsWorkProfile = supportsWorkProfile;
    return this;
  }

  @Override
  public AndroidAttributes set(String fieldName, Object value) {
    return (AndroidAttributes) super.set(fieldName, value);
  }

  @Override
  public AndroidAttributes clone() {
    return (AndroidAttributes) super.clone();
  }

}
