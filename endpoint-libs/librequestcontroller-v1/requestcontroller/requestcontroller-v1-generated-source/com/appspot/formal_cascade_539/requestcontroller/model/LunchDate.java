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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-04-01 18:14:47 UTC)
 * on 2014-04-04 at 03:37:25 UTC 
 * Modify at your own risk.
 */

package com.appspot.formal_cascade_539.requestcontroller.model;

/**
 * Model definition for LunchDate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the requestcontroller. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LunchDate extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean confirmed;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime expiryTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeInterval matchedInterval;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Request requestA;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Request requestB;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restaurantId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConfirmed() {
    return confirmed;
  }

  /**
   * @param confirmed confirmed or {@code null} for none
   */
  public LunchDate setConfirmed(java.lang.Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getExpiryTime() {
    return expiryTime;
  }

  /**
   * @param expiryTime expiryTime or {@code null} for none
   */
  public LunchDate setExpiryTime(com.google.api.client.util.DateTime expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public LunchDate setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public TimeInterval getMatchedInterval() {
    return matchedInterval;
  }

  /**
   * @param matchedInterval matchedInterval or {@code null} for none
   */
  public LunchDate setMatchedInterval(TimeInterval matchedInterval) {
    this.matchedInterval = matchedInterval;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Request getRequestA() {
    return requestA;
  }

  /**
   * @param requestA requestA or {@code null} for none
   */
  public LunchDate setRequestA(Request requestA) {
    this.requestA = requestA;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Request getRequestB() {
    return requestB;
  }

  /**
   * @param requestB requestB or {@code null} for none
   */
  public LunchDate setRequestB(Request requestB) {
    this.requestB = requestB;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRestaurantId() {
    return restaurantId;
  }

  /**
   * @param restaurantId restaurantId or {@code null} for none
   */
  public LunchDate setRestaurantId(java.lang.String restaurantId) {
    this.restaurantId = restaurantId;
    return this;
  }

  @Override
  public LunchDate set(String fieldName, Object value) {
    return (LunchDate) super.set(fieldName, value);
  }

  @Override
  public LunchDate clone() {
    return (LunchDate) super.clone();
  }

}