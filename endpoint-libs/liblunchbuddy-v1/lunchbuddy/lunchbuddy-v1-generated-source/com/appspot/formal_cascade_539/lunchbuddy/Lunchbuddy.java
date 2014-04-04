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
 * on 2014-04-04 at 01:00:11 UTC 
 * Modify at your own risk.
 */

package com.appspot.formal_cascade_539.lunchbuddy;

/**
 * Service definition for Lunchbuddy (v1).
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
 * This service uses {@link LunchbuddyRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Lunchbuddy extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the lunchbuddy library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "lunchbuddy/v1/";

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
  public Lunchbuddy(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Lunchbuddy(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Requests collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Lunchbuddy lunchbuddy = new Lunchbuddy(...);}
   *   {@code Lunchbuddy.Requests.List request = lunchbuddy.requests().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Requests requests() {
    return new Requests();
  }

  /**
   * The "requests" collection of methods.
   */
  public class Requests {

    /**
     * Create a request for the method "requests.create".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.Request}
     * @return the request
     */
    public Create create(com.appspot.formal_cascade_539.lunchbuddy.model.Request content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends LunchbuddyRequest<com.appspot.formal_cascade_539.lunchbuddy.model.Request> {

      private static final String REST_PATH = "requests/create";

      /**
       * Create a request for the method "requests.create".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
       * <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.Request}
       * @since 1.13
       */
      protected Create(com.appspot.formal_cascade_539.lunchbuddy.model.Request content) {
        super(Lunchbuddy.this, "POST", REST_PATH, content, com.appspot.formal_cascade_539.lunchbuddy.model.Request.class);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUserIp(java.lang.String userIp) {
        return (Create) super.setUserIp(userIp);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "requests.get".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param id
     * @return the request
     */
    public Get get(java.lang.String id) throws java.io.IOException {
      Get result = new Get(id);
      initialize(result);
      return result;
    }

    public class Get extends LunchbuddyRequest<Void> {

      private static final String REST_PATH = "requests/get/{id}";

      /**
       * Create a request for the method "requests.get".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected Get(java.lang.String id) {
        super(Lunchbuddy.this, "GET", REST_PATH, null, Void.class);
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
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public Get setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "requests.removeUser".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link RemoveUser#execute()} method to invoke the remote operation.
     *
     * @param id
     * @return the request
     */
    public RemoveUser removeUser(java.lang.String id) throws java.io.IOException {
      RemoveUser result = new RemoveUser(id);
      initialize(result);
      return result;
    }

    public class RemoveUser extends LunchbuddyRequest<Void> {

      private static final String REST_PATH = "requests/delete/{id}";

      /**
       * Create a request for the method "requests.removeUser".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link RemoveUser#execute()} method to invoke the remote
       * operation. <p> {@link
       * RemoveUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected RemoveUser(java.lang.String id) {
        super(Lunchbuddy.this, "DELETE", REST_PATH, null, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public RemoveUser setAlt(java.lang.String alt) {
        return (RemoveUser) super.setAlt(alt);
      }

      @Override
      public RemoveUser setFields(java.lang.String fields) {
        return (RemoveUser) super.setFields(fields);
      }

      @Override
      public RemoveUser setKey(java.lang.String key) {
        return (RemoveUser) super.setKey(key);
      }

      @Override
      public RemoveUser setOauthToken(java.lang.String oauthToken) {
        return (RemoveUser) super.setOauthToken(oauthToken);
      }

      @Override
      public RemoveUser setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RemoveUser) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RemoveUser setQuotaUser(java.lang.String quotaUser) {
        return (RemoveUser) super.setQuotaUser(quotaUser);
      }

      @Override
      public RemoveUser setUserIp(java.lang.String userIp) {
        return (RemoveUser) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public RemoveUser setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public RemoveUser set(String parameterName, Object value) {
        return (RemoveUser) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "requests.update".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
     *
     * @param id
     * @return the request
     */
    public Update update(java.lang.String id) throws java.io.IOException {
      Update result = new Update(id);
      initialize(result);
      return result;
    }

    public class Update extends LunchbuddyRequest<Void> {

      private static final String REST_PATH = "requests/update/{id}";

      /**
       * Create a request for the method "requests.update".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
       * <p> {@link
       * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected Update(java.lang.String id) {
        super(Lunchbuddy.this, "PUT", REST_PATH, null, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public Update setAlt(java.lang.String alt) {
        return (Update) super.setAlt(alt);
      }

      @Override
      public Update setFields(java.lang.String fields) {
        return (Update) super.setFields(fields);
      }

      @Override
      public Update setKey(java.lang.String key) {
        return (Update) super.setKey(key);
      }

      @Override
      public Update setOauthToken(java.lang.String oauthToken) {
        return (Update) super.setOauthToken(oauthToken);
      }

      @Override
      public Update setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Update) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Update setQuotaUser(java.lang.String quotaUser) {
        return (Update) super.setQuotaUser(quotaUser);
      }

      @Override
      public Update setUserIp(java.lang.String userIp) {
        return (Update) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public Update setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Update set(String parameterName, Object value) {
        return (Update) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Users collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Lunchbuddy lunchbuddy = new Lunchbuddy(...);}
   *   {@code Lunchbuddy.Users.List request = lunchbuddy.users().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Users users() {
    return new Users();
  }

  /**
   * The "users" collection of methods.
   */
  public class Users {

    /**
     * Create a request for the method "users.create".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.User}
     * @return the request
     */
    public Create create(com.appspot.formal_cascade_539.lunchbuddy.model.User content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends LunchbuddyRequest<com.appspot.formal_cascade_539.lunchbuddy.model.User> {

      private static final String REST_PATH = "users/create";

      /**
       * Create a request for the method "users.create".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
       * <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.User}
       * @since 1.13
       */
      protected Create(com.appspot.formal_cascade_539.lunchbuddy.model.User content) {
        super(Lunchbuddy.this, "POST", REST_PATH, content, com.appspot.formal_cascade_539.lunchbuddy.model.User.class);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUserIp(java.lang.String userIp) {
        return (Create) super.setUserIp(userIp);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "users.get".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param id
     * @return the request
     */
    public Get get(java.lang.String id) throws java.io.IOException {
      Get result = new Get(id);
      initialize(result);
      return result;
    }

    public class Get extends LunchbuddyRequest<com.appspot.formal_cascade_539.lunchbuddy.model.User> {

      private static final String REST_PATH = "users/get/{id}";

      /**
       * Create a request for the method "users.get".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected Get(java.lang.String id) {
        super(Lunchbuddy.this, "GET", REST_PATH, null, com.appspot.formal_cascade_539.lunchbuddy.model.User.class);
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
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public Get setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "users.patch".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
     *
     * @param id
     * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.User}
     * @return the request
     */
    public Patch patch(java.lang.String id, com.appspot.formal_cascade_539.lunchbuddy.model.User content) throws java.io.IOException {
      Patch result = new Patch(id, content);
      initialize(result);
      return result;
    }

    public class Patch extends LunchbuddyRequest<Void> {

      private static final String REST_PATH = "users/update/{id}";

      /**
       * Create a request for the method "users.patch".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
       * <p> {@link
       * Patch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.User}
       * @since 1.13
       */
      protected Patch(java.lang.String id, com.appspot.formal_cascade_539.lunchbuddy.model.User content) {
        super(Lunchbuddy.this, "PATCH", REST_PATH, content, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public Patch setAlt(java.lang.String alt) {
        return (Patch) super.setAlt(alt);
      }

      @Override
      public Patch setFields(java.lang.String fields) {
        return (Patch) super.setFields(fields);
      }

      @Override
      public Patch setKey(java.lang.String key) {
        return (Patch) super.setKey(key);
      }

      @Override
      public Patch setOauthToken(java.lang.String oauthToken) {
        return (Patch) super.setOauthToken(oauthToken);
      }

      @Override
      public Patch setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Patch) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Patch setQuotaUser(java.lang.String quotaUser) {
        return (Patch) super.setQuotaUser(quotaUser);
      }

      @Override
      public Patch setUserIp(java.lang.String userIp) {
        return (Patch) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public Patch setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Patch set(String parameterName, Object value) {
        return (Patch) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "users.removeUser".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link RemoveUser#execute()} method to invoke the remote operation.
     *
     * @param id
     * @return the request
     */
    public RemoveUser removeUser(java.lang.String id) throws java.io.IOException {
      RemoveUser result = new RemoveUser(id);
      initialize(result);
      return result;
    }

    public class RemoveUser extends LunchbuddyRequest<Void> {

      private static final String REST_PATH = "users/delete/{id}";

      /**
       * Create a request for the method "users.removeUser".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link RemoveUser#execute()} method to invoke the remote
       * operation. <p> {@link
       * RemoveUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected RemoveUser(java.lang.String id) {
        super(Lunchbuddy.this, "DELETE", REST_PATH, null, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public RemoveUser setAlt(java.lang.String alt) {
        return (RemoveUser) super.setAlt(alt);
      }

      @Override
      public RemoveUser setFields(java.lang.String fields) {
        return (RemoveUser) super.setFields(fields);
      }

      @Override
      public RemoveUser setKey(java.lang.String key) {
        return (RemoveUser) super.setKey(key);
      }

      @Override
      public RemoveUser setOauthToken(java.lang.String oauthToken) {
        return (RemoveUser) super.setOauthToken(oauthToken);
      }

      @Override
      public RemoveUser setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RemoveUser) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RemoveUser setQuotaUser(java.lang.String quotaUser) {
        return (RemoveUser) super.setQuotaUser(quotaUser);
      }

      @Override
      public RemoveUser setUserIp(java.lang.String userIp) {
        return (RemoveUser) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public RemoveUser setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public RemoveUser set(String parameterName, Object value) {
        return (RemoveUser) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "users.update".
     *
     * This request holds the parameters needed by the the lunchbuddy server.  After setting any
     * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
     *
     * @param id
     * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.User}
     * @return the request
     */
    public Update update(java.lang.String id, com.appspot.formal_cascade_539.lunchbuddy.model.User content) throws java.io.IOException {
      Update result = new Update(id, content);
      initialize(result);
      return result;
    }

    public class Update extends LunchbuddyRequest<Void> {

      private static final String REST_PATH = "users/update/{id}";

      /**
       * Create a request for the method "users.update".
       *
       * This request holds the parameters needed by the the lunchbuddy server.  After setting any
       * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
       * <p> {@link
       * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @param content the {@link com.appspot.formal_cascade_539.lunchbuddy.model.User}
       * @since 1.13
       */
      protected Update(java.lang.String id, com.appspot.formal_cascade_539.lunchbuddy.model.User content) {
        super(Lunchbuddy.this, "PUT", REST_PATH, content, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public Update setAlt(java.lang.String alt) {
        return (Update) super.setAlt(alt);
      }

      @Override
      public Update setFields(java.lang.String fields) {
        return (Update) super.setFields(fields);
      }

      @Override
      public Update setKey(java.lang.String key) {
        return (Update) super.setKey(key);
      }

      @Override
      public Update setOauthToken(java.lang.String oauthToken) {
        return (Update) super.setOauthToken(oauthToken);
      }

      @Override
      public Update setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Update) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Update setQuotaUser(java.lang.String quotaUser) {
        return (Update) super.setQuotaUser(quotaUser);
      }

      @Override
      public Update setUserIp(java.lang.String userIp) {
        return (Update) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public Update setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public Update set(String parameterName, Object value) {
        return (Update) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Lunchbuddy}.
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

    /** Builds a new instance of {@link Lunchbuddy}. */
    @Override
    public Lunchbuddy build() {
      return new Lunchbuddy(this);
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
     * Set the {@link LunchbuddyRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLunchbuddyRequestInitializer(
        LunchbuddyRequestInitializer lunchbuddyRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(lunchbuddyRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}