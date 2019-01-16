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
 * Historical information about a Google Partners Offer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HistoricalOffer extends com.google.api.client.json.GenericJson {

  /**
   * Client's AdWords page URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adwordsUrl;

  /**
   * Email address for client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientEmail;

  /**
   * ID of client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long clientId;

  /**
   * Name of the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientName;

  /**
   * Time offer was first created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTime;

  /**
   * Time this offer expires.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expirationTime;

  /**
   * Time last action was taken.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastModifiedTime;

  /**
   * Offer code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerCode;

  /**
   * Country Code for the offer country.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerCountryCode;

  /**
   * Type of offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerType;

  /**
   * Name (First + Last) of the partners user to whom the incentive is allocated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String senderName;

  /**
   * Status of the offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Client's AdWords page URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdwordsUrl() {
    return adwordsUrl;
  }

  /**
   * Client's AdWords page URL.
   * @param adwordsUrl adwordsUrl or {@code null} for none
   */
  public HistoricalOffer setAdwordsUrl(java.lang.String adwordsUrl) {
    this.adwordsUrl = adwordsUrl;
    return this;
  }

  /**
   * Email address for client.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientEmail() {
    return clientEmail;
  }

  /**
   * Email address for client.
   * @param clientEmail clientEmail or {@code null} for none
   */
  public HistoricalOffer setClientEmail(java.lang.String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * ID of client.
   * @return value or {@code null} for none
   */
  public java.lang.Long getClientId() {
    return clientId;
  }

  /**
   * ID of client.
   * @param clientId clientId or {@code null} for none
   */
  public HistoricalOffer setClientId(java.lang.Long clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Name of the client.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientName() {
    return clientName;
  }

  /**
   * Name of the client.
   * @param clientName clientName or {@code null} for none
   */
  public HistoricalOffer setClientName(java.lang.String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Time offer was first created.
   * @return value or {@code null} for none
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Time offer was first created.
   * @param creationTime creationTime or {@code null} for none
   */
  public HistoricalOffer setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Time this offer expires.
   * @return value or {@code null} for none
   */
  public String getExpirationTime() {
    return expirationTime;
  }

  /**
   * Time this offer expires.
   * @param expirationTime expirationTime or {@code null} for none
   */
  public HistoricalOffer setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Time last action was taken.
   * @return value or {@code null} for none
   */
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  /**
   * Time last action was taken.
   * @param lastModifiedTime lastModifiedTime or {@code null} for none
   */
  public HistoricalOffer setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Offer code.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferCode() {
    return offerCode;
  }

  /**
   * Offer code.
   * @param offerCode offerCode or {@code null} for none
   */
  public HistoricalOffer setOfferCode(java.lang.String offerCode) {
    this.offerCode = offerCode;
    return this;
  }

  /**
   * Country Code for the offer country.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferCountryCode() {
    return offerCountryCode;
  }

  /**
   * Country Code for the offer country.
   * @param offerCountryCode offerCountryCode or {@code null} for none
   */
  public HistoricalOffer setOfferCountryCode(java.lang.String offerCountryCode) {
    this.offerCountryCode = offerCountryCode;
    return this;
  }

  /**
   * Type of offer.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferType() {
    return offerType;
  }

  /**
   * Type of offer.
   * @param offerType offerType or {@code null} for none
   */
  public HistoricalOffer setOfferType(java.lang.String offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * Name (First + Last) of the partners user to whom the incentive is allocated.
   * @return value or {@code null} for none
   */
  public java.lang.String getSenderName() {
    return senderName;
  }

  /**
   * Name (First + Last) of the partners user to whom the incentive is allocated.
   * @param senderName senderName or {@code null} for none
   */
  public HistoricalOffer setSenderName(java.lang.String senderName) {
    this.senderName = senderName;
    return this;
  }

  /**
   * Status of the offer.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the offer.
   * @param status status or {@code null} for none
   */
  public HistoricalOffer setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public HistoricalOffer set(String fieldName, Object value) {
    return (HistoricalOffer) super.set(fieldName, value);
  }

  @Override
  public HistoricalOffer clone() {
    return (HistoricalOffer) super.clone();
  }

}
