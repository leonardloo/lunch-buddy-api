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
 * on 2014-04-04 at 04:07:25 UTC 
 * Modify at your own risk.
 */

package com.lunchbuddy.models.lunchuserendpoint;

/**
 * Service definition for Lunchuserendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link LunchuserendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Lunchuserendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the lunchuserendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://formal-cascade-539.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "lunchuserendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Lunchuserendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Lunchuserendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getLunchUser".
   *
   * This request holds the parameters needed by the the lunchuserendpoint server.  After setting any
   * optional parameters, call the {@link GetLunchUser#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetLunchUser getLunchUser(java.lang.String id) throws java.io.IOException {
    GetLunchUser result = new GetLunchUser(id);
    initialize(result);
    return result;
  }

  public class GetLunchUser extends LunchuserendpointRequest<com.lunchbuddy.models.lunchuserendpoint.model.LunchUser> {

    private static final String REST_PATH = "lunchuser/{id}";

    /**
     * Create a request for the method "getLunchUser".
     *
     * This request holds the parameters needed by the the lunchuserendpoint server.  After setting
     * any optional parameters, call the {@link GetLunchUser#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetLunchUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetLunchUser(java.lang.String id) {
      super(Lunchuserendpoint.this, "GET", REST_PATH, null, com.lunchbuddy.models.lunchuserendpoint.model.LunchUser.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetLunchUser setAlt(java.lang.String alt) {
      return (GetLunchUser) super.setAlt(alt);
    }

    @Override
    public GetLunchUser setFields(java.lang.String fields) {
      return (GetLunchUser) super.setFields(fields);
    }

    @Override
    public GetLunchUser setKey(java.lang.String key) {
      return (GetLunchUser) super.setKey(key);
    }

    @Override
    public GetLunchUser setOauthToken(java.lang.String oauthToken) {
      return (GetLunchUser) super.setOauthToken(oauthToken);
    }

    @Override
    public GetLunchUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetLunchUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetLunchUser setQuotaUser(java.lang.String quotaUser) {
      return (GetLunchUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetLunchUser setUserIp(java.lang.String userIp) {
      return (GetLunchUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetLunchUser setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetLunchUser set(String parameterName, Object value) {
      return (GetLunchUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertLunchUser".
   *
   * This request holds the parameters needed by the the lunchuserendpoint server.  After setting any
   * optional parameters, call the {@link InsertLunchUser#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.lunchbuddy.models.lunchuserendpoint.model.LunchUser}
   * @return the request
   */
  public InsertLunchUser insertLunchUser(com.lunchbuddy.models.lunchuserendpoint.model.LunchUser content) throws java.io.IOException {
    InsertLunchUser result = new InsertLunchUser(content);
    initialize(result);
    return result;
  }

  public class InsertLunchUser extends LunchuserendpointRequest<com.lunchbuddy.models.lunchuserendpoint.model.LunchUser> {

    private static final String REST_PATH = "lunchuser";

    /**
     * Create a request for the method "insertLunchUser".
     *
     * This request holds the parameters needed by the the lunchuserendpoint server.  After setting
     * any optional parameters, call the {@link InsertLunchUser#execute()} method to invoke the remote
     * operation. <p> {@link InsertLunchUser#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.lunchbuddy.models.lunchuserendpoint.model.LunchUser}
     * @since 1.13
     */
    protected InsertLunchUser(com.lunchbuddy.models.lunchuserendpoint.model.LunchUser content) {
      super(Lunchuserendpoint.this, "POST", REST_PATH, content, com.lunchbuddy.models.lunchuserendpoint.model.LunchUser.class);
    }

    @Override
    public InsertLunchUser setAlt(java.lang.String alt) {
      return (InsertLunchUser) super.setAlt(alt);
    }

    @Override
    public InsertLunchUser setFields(java.lang.String fields) {
      return (InsertLunchUser) super.setFields(fields);
    }

    @Override
    public InsertLunchUser setKey(java.lang.String key) {
      return (InsertLunchUser) super.setKey(key);
    }

    @Override
    public InsertLunchUser setOauthToken(java.lang.String oauthToken) {
      return (InsertLunchUser) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertLunchUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertLunchUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertLunchUser setQuotaUser(java.lang.String quotaUser) {
      return (InsertLunchUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertLunchUser setUserIp(java.lang.String userIp) {
      return (InsertLunchUser) super.setUserIp(userIp);
    }

    @Override
    public InsertLunchUser set(String parameterName, Object value) {
      return (InsertLunchUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listLunchUser".
   *
   * This request holds the parameters needed by the the lunchuserendpoint server.  After setting any
   * optional parameters, call the {@link ListLunchUser#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListLunchUser listLunchUser() throws java.io.IOException {
    ListLunchUser result = new ListLunchUser();
    initialize(result);
    return result;
  }

  public class ListLunchUser extends LunchuserendpointRequest<com.lunchbuddy.models.lunchuserendpoint.model.CollectionResponseLunchUser> {

    private static final String REST_PATH = "lunchuser";

    /**
     * Create a request for the method "listLunchUser".
     *
     * This request holds the parameters needed by the the lunchuserendpoint server.  After setting
     * any optional parameters, call the {@link ListLunchUser#execute()} method to invoke the remote
     * operation. <p> {@link ListLunchUser#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListLunchUser() {
      super(Lunchuserendpoint.this, "GET", REST_PATH, null, com.lunchbuddy.models.lunchuserendpoint.model.CollectionResponseLunchUser.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListLunchUser setAlt(java.lang.String alt) {
      return (ListLunchUser) super.setAlt(alt);
    }

    @Override
    public ListLunchUser setFields(java.lang.String fields) {
      return (ListLunchUser) super.setFields(fields);
    }

    @Override
    public ListLunchUser setKey(java.lang.String key) {
      return (ListLunchUser) super.setKey(key);
    }

    @Override
    public ListLunchUser setOauthToken(java.lang.String oauthToken) {
      return (ListLunchUser) super.setOauthToken(oauthToken);
    }

    @Override
    public ListLunchUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListLunchUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListLunchUser setQuotaUser(java.lang.String quotaUser) {
      return (ListLunchUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListLunchUser setUserIp(java.lang.String userIp) {
      return (ListLunchUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListLunchUser setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListLunchUser setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListLunchUser set(String parameterName, Object value) {
      return (ListLunchUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeLunchUser".
   *
   * This request holds the parameters needed by the the lunchuserendpoint server.  After setting any
   * optional parameters, call the {@link RemoveLunchUser#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveLunchUser removeLunchUser(java.lang.String id) throws java.io.IOException {
    RemoveLunchUser result = new RemoveLunchUser(id);
    initialize(result);
    return result;
  }

  public class RemoveLunchUser extends LunchuserendpointRequest<Void> {

    private static final String REST_PATH = "lunchuser/{id}";

    /**
     * Create a request for the method "removeLunchUser".
     *
     * This request holds the parameters needed by the the lunchuserendpoint server.  After setting
     * any optional parameters, call the {@link RemoveLunchUser#execute()} method to invoke the remote
     * operation. <p> {@link RemoveLunchUser#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveLunchUser(java.lang.String id) {
      super(Lunchuserendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveLunchUser setAlt(java.lang.String alt) {
      return (RemoveLunchUser) super.setAlt(alt);
    }

    @Override
    public RemoveLunchUser setFields(java.lang.String fields) {
      return (RemoveLunchUser) super.setFields(fields);
    }

    @Override
    public RemoveLunchUser setKey(java.lang.String key) {
      return (RemoveLunchUser) super.setKey(key);
    }

    @Override
    public RemoveLunchUser setOauthToken(java.lang.String oauthToken) {
      return (RemoveLunchUser) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveLunchUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveLunchUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveLunchUser setQuotaUser(java.lang.String quotaUser) {
      return (RemoveLunchUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveLunchUser setUserIp(java.lang.String userIp) {
      return (RemoveLunchUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveLunchUser setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveLunchUser set(String parameterName, Object value) {
      return (RemoveLunchUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateLunchUser".
   *
   * This request holds the parameters needed by the the lunchuserendpoint server.  After setting any
   * optional parameters, call the {@link UpdateLunchUser#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.lunchbuddy.models.lunchuserendpoint.model.LunchUser}
   * @return the request
   */
  public UpdateLunchUser updateLunchUser(com.lunchbuddy.models.lunchuserendpoint.model.LunchUser content) throws java.io.IOException {
    UpdateLunchUser result = new UpdateLunchUser(content);
    initialize(result);
    return result;
  }

  public class UpdateLunchUser extends LunchuserendpointRequest<com.lunchbuddy.models.lunchuserendpoint.model.LunchUser> {

    private static final String REST_PATH = "lunchuser";

    /**
     * Create a request for the method "updateLunchUser".
     *
     * This request holds the parameters needed by the the lunchuserendpoint server.  After setting
     * any optional parameters, call the {@link UpdateLunchUser#execute()} method to invoke the remote
     * operation. <p> {@link UpdateLunchUser#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.lunchbuddy.models.lunchuserendpoint.model.LunchUser}
     * @since 1.13
     */
    protected UpdateLunchUser(com.lunchbuddy.models.lunchuserendpoint.model.LunchUser content) {
      super(Lunchuserendpoint.this, "PUT", REST_PATH, content, com.lunchbuddy.models.lunchuserendpoint.model.LunchUser.class);
    }

    @Override
    public UpdateLunchUser setAlt(java.lang.String alt) {
      return (UpdateLunchUser) super.setAlt(alt);
    }

    @Override
    public UpdateLunchUser setFields(java.lang.String fields) {
      return (UpdateLunchUser) super.setFields(fields);
    }

    @Override
    public UpdateLunchUser setKey(java.lang.String key) {
      return (UpdateLunchUser) super.setKey(key);
    }

    @Override
    public UpdateLunchUser setOauthToken(java.lang.String oauthToken) {
      return (UpdateLunchUser) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateLunchUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateLunchUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateLunchUser setQuotaUser(java.lang.String quotaUser) {
      return (UpdateLunchUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateLunchUser setUserIp(java.lang.String userIp) {
      return (UpdateLunchUser) super.setUserIp(userIp);
    }

    @Override
    public UpdateLunchUser set(String parameterName, Object value) {
      return (UpdateLunchUser) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Lunchuserendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Lunchuserendpoint}. */
    @Override
    public Lunchuserendpoint build() {
      return new Lunchuserendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link LunchuserendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLunchuserendpointRequestInitializer(
        LunchuserendpointRequestInitializer lunchuserendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(lunchuserendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
