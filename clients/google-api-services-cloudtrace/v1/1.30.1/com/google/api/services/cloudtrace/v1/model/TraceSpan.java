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

package com.google.api.services.cloudtrace.v1.model;

/**
 * A span represents a single timed event within a trace. Spans can be nested and form a trace tree.
 * Often, a trace contains a root span that describes the end-to-end latency of an operation and,
 * optionally, one or more subspans for its suboperations. Spans do not need to be contiguous. There
 * may be gaps between spans in a trace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Trace API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TraceSpan extends com.google.api.client.json.GenericJson {

  /**
   * End time of the span in nanoseconds from the UNIX epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Distinguishes between spans generated in a particular context. For example, two spans with the
   * same name may be distinguished using `RPC_CLIENT` and `RPC_SERVER` to identify queueing latency
   * associated with the span.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Collection of labels associated with the span. Label keys must be less than 128 bytes. Label
   * values must be less than 16 kilobytes (10MB for `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating your own, we
   * recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.   `/db/mongodb/read_size`). *
   * `short_host/path/key` for domain-specific keys (e.g.   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent` *   `/component` *   `/error/message` *   `/error/name` *   `/http/client_city` *
   * `/http/client_country` *   `/http/client_protocol` *   `/http/client_region` *   `/http/host` *
   * `/http/method` *   `/http/path` *   `/http/redirected_url` *   `/http/request/size` *
   * `/http/response/size` *   `/http/route` *   `/http/status_code` *   `/http/url` *
   * `/http/user_agent` *   `/pid` *   `/stacktrace` *   `/tid`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Name of the span. Must be less than 128 bytes. The span name is sanitized and displayed in the
   * Stackdriver Trace tool in the Google Cloud Platform Console. The name may be a method name or
   * some other per-call site name. For the same executable and the same call point, a best practice
   * is to use a consistent name, which makes it easier to correlate cross-trace spans.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. ID of the parent span, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger parentSpanId;

  /**
   * Identifier for the span. Must be a 64-bit integer other than 0 and unique within a trace. For
   * example, `2205310701640571284`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger spanId;

  /**
   * Start time of the span in nanoseconds from the UNIX epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * End time of the span in nanoseconds from the UNIX epoch.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * End time of the span in nanoseconds from the UNIX epoch.
   * @param endTime endTime or {@code null} for none
   */
  public TraceSpan setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Distinguishes between spans generated in a particular context. For example, two spans with the
   * same name may be distinguished using `RPC_CLIENT` and `RPC_SERVER` to identify queueing latency
   * associated with the span.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Distinguishes between spans generated in a particular context. For example, two spans with the
   * same name may be distinguished using `RPC_CLIENT` and `RPC_SERVER` to identify queueing latency
   * associated with the span.
   * @param kind kind or {@code null} for none
   */
  public TraceSpan setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Collection of labels associated with the span. Label keys must be less than 128 bytes. Label
   * values must be less than 16 kilobytes (10MB for `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating your own, we
   * recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.   `/db/mongodb/read_size`). *
   * `short_host/path/key` for domain-specific keys (e.g.   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent` *   `/component` *   `/error/message` *   `/error/name` *   `/http/client_city` *
   * `/http/client_country` *   `/http/client_protocol` *   `/http/client_region` *   `/http/host` *
   * `/http/method` *   `/http/path` *   `/http/redirected_url` *   `/http/request/size` *
   * `/http/response/size` *   `/http/route` *   `/http/status_code` *   `/http/url` *
   * `/http/user_agent` *   `/pid` *   `/stacktrace` *   `/tid`
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Collection of labels associated with the span. Label keys must be less than 128 bytes. Label
   * values must be less than 16 kilobytes (10MB for `/stacktrace` values).
   *
   * Some predefined label keys exist, or you may create your own. When creating your own, we
   * recommend the following formats:
   *
   * * `/category/product/key` for agents of well-known products (e.g.   `/db/mongodb/read_size`). *
   * `short_host/path/key` for domain-specific keys (e.g.   `foo.com/myproduct/bar`)
   *
   * Predefined labels include:
   *
   * *   `/agent` *   `/component` *   `/error/message` *   `/error/name` *   `/http/client_city` *
   * `/http/client_country` *   `/http/client_protocol` *   `/http/client_region` *   `/http/host` *
   * `/http/method` *   `/http/path` *   `/http/redirected_url` *   `/http/request/size` *
   * `/http/response/size` *   `/http/route` *   `/http/status_code` *   `/http/url` *
   * `/http/user_agent` *   `/pid` *   `/stacktrace` *   `/tid`
   * @param labels labels or {@code null} for none
   */
  public TraceSpan setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name of the span. Must be less than 128 bytes. The span name is sanitized and displayed in the
   * Stackdriver Trace tool in the Google Cloud Platform Console. The name may be a method name or
   * some other per-call site name. For the same executable and the same call point, a best practice
   * is to use a consistent name, which makes it easier to correlate cross-trace spans.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the span. Must be less than 128 bytes. The span name is sanitized and displayed in the
   * Stackdriver Trace tool in the Google Cloud Platform Console. The name may be a method name or
   * some other per-call site name. For the same executable and the same call point, a best practice
   * is to use a consistent name, which makes it easier to correlate cross-trace spans.
   * @param name name or {@code null} for none
   */
  public TraceSpan setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. ID of the parent span, if any.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getParentSpanId() {
    return parentSpanId;
  }

  /**
   * Optional. ID of the parent span, if any.
   * @param parentSpanId parentSpanId or {@code null} for none
   */
  public TraceSpan setParentSpanId(java.math.BigInteger parentSpanId) {
    this.parentSpanId = parentSpanId;
    return this;
  }

  /**
   * Identifier for the span. Must be a 64-bit integer other than 0 and unique within a trace. For
   * example, `2205310701640571284`.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getSpanId() {
    return spanId;
  }

  /**
   * Identifier for the span. Must be a 64-bit integer other than 0 and unique within a trace. For
   * example, `2205310701640571284`.
   * @param spanId spanId or {@code null} for none
   */
  public TraceSpan setSpanId(java.math.BigInteger spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Start time of the span in nanoseconds from the UNIX epoch.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Start time of the span in nanoseconds from the UNIX epoch.
   * @param startTime startTime or {@code null} for none
   */
  public TraceSpan setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public TraceSpan set(String fieldName, Object value) {
    return (TraceSpan) super.set(fieldName, value);
  }

  @Override
  public TraceSpan clone() {
    return (TraceSpan) super.clone();
  }

}
