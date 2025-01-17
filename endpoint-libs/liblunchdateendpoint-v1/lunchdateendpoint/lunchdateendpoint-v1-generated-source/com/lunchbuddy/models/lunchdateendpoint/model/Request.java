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
 * on 2014-04-04 at 05:09:10 UTC 
 * Modify at your own risk.
 */

package com.lunchbuddy.models.lunchdateendpoint.model;

/**
 * Model definition for Request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the lunchdateendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Request extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeInterval interval;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key key;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double lat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double lon;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> restaurantPreferences;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LunchUser user;

  /**
   * @return value or {@code null} for none
   */
  public TimeInterval getInterval() {
    return interval;
  }

  /**
   * @param interval interval or {@code null} for none
   */
  public Request setInterval(TimeInterval interval) {
    this.interval = interval;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getKey() {
    return key;
  }

  /**
   * @param key key or {@code null} for none
   */
  public Request setKey(Key key) {
    this.key = key;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLat() {
    return lat;
  }

  /**
   * @param lat lat or {@code null} for none
   */
  public Request setLat(java.lang.Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLon() {
    return lon;
  }

  /**
   * @param lon lon or {@code null} for none
   */
  public Request setLon(java.lang.Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRestaurantPreferences() {
    return restaurantPreferences;
  }

  /**
   * @param restaurantPreferences restaurantPreferences or {@code null} for none
   */
  public Request setRestaurantPreferences(java.util.List<java.lang.String> restaurantPreferences) {
    this.restaurantPreferences = restaurantPreferences;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public LunchUser getUser() {
    return user;
  }

  /**
   * @param user user or {@code null} for none
   */
  public Request setUser(LunchUser user) {
    this.user = user;
    return this;
  }

  @Override
  public Request set(String fieldName, Object value) {
    return (Request) super.set(fieldName, value);
  }

  @Override
  public Request clone() {
    return (Request) super.clone();
  }

}
