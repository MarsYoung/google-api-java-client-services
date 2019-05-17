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

package com.google.api.services.sheets.v4.model;

/**
 * Inserts data into the spreadsheet starting at the specified coordinate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PasteDataRequest extends com.google.api.client.json.GenericJson {

  /**
   * The coordinate at which the data should start being inserted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridCoordinate coordinate;

  /**
   * The data to insert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * The delimiter in the data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String delimiter;

  /**
   * True if the data is HTML.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean html;

  /**
   * How the data should be pasted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The coordinate at which the data should start being inserted.
   * @return value or {@code null} for none
   */
  public GridCoordinate getCoordinate() {
    return coordinate;
  }

  /**
   * The coordinate at which the data should start being inserted.
   * @param coordinate coordinate or {@code null} for none
   */
  public PasteDataRequest setCoordinate(GridCoordinate coordinate) {
    this.coordinate = coordinate;
    return this;
  }

  /**
   * The data to insert.
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * The data to insert.
   * @param data data or {@code null} for none
   */
  public PasteDataRequest setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * The delimiter in the data.
   * @return value or {@code null} for none
   */
  public java.lang.String getDelimiter() {
    return delimiter;
  }

  /**
   * The delimiter in the data.
   * @param delimiter delimiter or {@code null} for none
   */
  public PasteDataRequest setDelimiter(java.lang.String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

  /**
   * True if the data is HTML.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHtml() {
    return html;
  }

  /**
   * True if the data is HTML.
   * @param html html or {@code null} for none
   */
  public PasteDataRequest setHtml(java.lang.Boolean html) {
    this.html = html;
    return this;
  }

  /**
   * How the data should be pasted.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * How the data should be pasted.
   * @param type type or {@code null} for none
   */
  public PasteDataRequest setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public PasteDataRequest set(String fieldName, Object value) {
    return (PasteDataRequest) super.set(fieldName, value);
  }

  @Override
  public PasteDataRequest clone() {
    return (PasteDataRequest) super.clone();
  }

}