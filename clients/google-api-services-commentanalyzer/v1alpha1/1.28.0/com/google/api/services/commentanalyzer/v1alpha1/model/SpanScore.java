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

package com.google.api.services.commentanalyzer.v1alpha1.model;

/**
 * This is a single score for a given span of text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Perspective Comment Analyzer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpanScore extends com.google.api.client.json.GenericJson {

  /**
   * "begin" and "end" describe the span of the original text that the attribute score applies to.
   * The values are the UTF-16 codepoint range. "end" is exclusive. For example, with the text "Hi
   * there", the begin/end pair (0,2) describes the text "Hi".
   *
   * If "begin" and "end" are unset, the score applies to the full text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer begin;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer end;

  /**
   * The score value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Score score;

  /**
   * "begin" and "end" describe the span of the original text that the attribute score applies to.
   * The values are the UTF-16 codepoint range. "end" is exclusive. For example, with the text "Hi
   * there", the begin/end pair (0,2) describes the text "Hi".
   *
   * If "begin" and "end" are unset, the score applies to the full text.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBegin() {
    return begin;
  }

  /**
   * "begin" and "end" describe the span of the original text that the attribute score applies to.
   * The values are the UTF-16 codepoint range. "end" is exclusive. For example, with the text "Hi
   * there", the begin/end pair (0,2) describes the text "Hi".
   *
   * If "begin" and "end" are unset, the score applies to the full text.
   * @param begin begin or {@code null} for none
   */
  public SpanScore setBegin(java.lang.Integer begin) {
    this.begin = begin;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEnd() {
    return end;
  }

  /**
   * @param end end or {@code null} for none
   */
  public SpanScore setEnd(java.lang.Integer end) {
    this.end = end;
    return this;
  }

  /**
   * The score value.
   * @return value or {@code null} for none
   */
  public Score getScore() {
    return score;
  }

  /**
   * The score value.
   * @param score score or {@code null} for none
   */
  public SpanScore setScore(Score score) {
    this.score = score;
    return this;
  }

  @Override
  public SpanScore set(String fieldName, Object value) {
    return (SpanScore) super.set(fieldName, value);
  }

  @Override
  public SpanScore clone() {
    return (SpanScore) super.clone();
  }

}