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
 * on 2014-04-04 at 05:08:58 UTC 
 * Modify at your own risk.
 */

package com.appspot.formal_cascade_539.requestcontroller;

/**
 * Service definition for Requestcontroller (v1).
 *
 * <p>
 * endpoint for matching requests
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link RequestcontrollerRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Requestcontroller extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the requestcontroller library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "requestcontroller/v1/";

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
  public Requestcontroller(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Requestcontroller(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the RequestController collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Requestcontroller requestcontroller = new Requestcontroller(...);}
   *   {@code Requestcontroller.RequestController.List request = requestcontroller.requestController().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public RequestController requestController() {
    return new RequestController();
  }

  /**
   * The "requestController" collection of methods.
   */
  public class RequestController {

    /**
     * Create a request for the method "requestController.createRequest".
     *
     * This request holds the parameters needed by the the requestcontroller server.  After setting any
     * optional parameters, call the {@link CreateRequest#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.appspot.formal_cascade_539.requestcontroller.model.Request}
     * @return the request
     */
    public CreateRequest createRequest(com.appspot.formal_cascade_539.requestcontroller.model.Request content) throws java.io.IOException {
      CreateRequest result = new CreateRequest(content);
      initialize(result);
      return result;
    }

    public class CreateRequest extends RequestcontrollerRequest<com.appspot.formal_cascade_539.requestcontroller.model.Request> {

      private static final String REST_PATH = "createRequest";

      /**
       * Create a request for the method "requestController.createRequest".
       *
       * This request holds the parameters needed by the the requestcontroller server.  After setting
       * any optional parameters, call the {@link CreateRequest#execute()} method to invoke the remote
       * operation. <p> {@link CreateRequest#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.appspot.formal_cascade_539.requestcontroller.model.Request}
       * @since 1.13
       */
      protected CreateRequest(com.appspot.formal_cascade_539.requestcontroller.model.Request content) {
        super(Requestcontroller.this, "POST", REST_PATH, content, com.appspot.formal_cascade_539.requestcontroller.model.Request.class);
      }

      @Override
      public CreateRequest setAlt(java.lang.String alt) {
        return (CreateRequest) super.setAlt(alt);
      }

      @Override
      public CreateRequest setFields(java.lang.String fields) {
        return (CreateRequest) super.setFields(fields);
      }

      @Override
      public CreateRequest setKey(java.lang.String key) {
        return (CreateRequest) super.setKey(key);
      }

      @Override
      public CreateRequest setOauthToken(java.lang.String oauthToken) {
        return (CreateRequest) super.setOauthToken(oauthToken);
      }

      @Override
      public CreateRequest setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (CreateRequest) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public CreateRequest setQuotaUser(java.lang.String quotaUser) {
        return (CreateRequest) super.setQuotaUser(quotaUser);
      }

      @Override
      public CreateRequest setUserIp(java.lang.String userIp) {
        return (CreateRequest) super.setUserIp(userIp);
      }

      @Override
      public CreateRequest set(String parameterName, Object value) {
        return (CreateRequest) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "requestController.deleteRequest".
     *
     * This request holds the parameters needed by the the requestcontroller server.  After setting any
     * optional parameters, call the {@link DeleteRequest#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public DeleteRequest deleteRequest(java.lang.String id) throws java.io.IOException {
      DeleteRequest result = new DeleteRequest(id);
      initialize(result);
      return result;
    }

    public class DeleteRequest extends RequestcontrollerRequest<Void> {

      private static final String REST_PATH = "request/{id}";

      /**
       * Create a request for the method "requestController.deleteRequest".
       *
       * This request holds the parameters needed by the the requestcontroller server.  After setting
       * any optional parameters, call the {@link DeleteRequest#execute()} method to invoke the remote
       * operation. <p> {@link DeleteRequest#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected DeleteRequest(java.lang.String id) {
        super(Requestcontroller.this, "DELETE", REST_PATH, null, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public DeleteRequest setAlt(java.lang.String alt) {
        return (DeleteRequest) super.setAlt(alt);
      }

      @Override
      public DeleteRequest setFields(java.lang.String fields) {
        return (DeleteRequest) super.setFields(fields);
      }

      @Override
      public DeleteRequest setKey(java.lang.String key) {
        return (DeleteRequest) super.setKey(key);
      }

      @Override
      public DeleteRequest setOauthToken(java.lang.String oauthToken) {
        return (DeleteRequest) super.setOauthToken(oauthToken);
      }

      @Override
      public DeleteRequest setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (DeleteRequest) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public DeleteRequest setQuotaUser(java.lang.String quotaUser) {
        return (DeleteRequest) super.setQuotaUser(quotaUser);
      }

      @Override
      public DeleteRequest setUserIp(java.lang.String userIp) {
        return (DeleteRequest) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public DeleteRequest setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public DeleteRequest set(String parameterName, Object value) {
        return (DeleteRequest) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "requestController.getRequest".
     *
     * This request holds the parameters needed by the the requestcontroller server.  After setting any
     * optional parameters, call the {@link GetRequest#execute()} method to invoke the remote operation.
     *
     * @param id
     * @return the request
     */
    public GetRequest getRequest(java.lang.String id) throws java.io.IOException {
      GetRequest result = new GetRequest(id);
      initialize(result);
      return result;
    }

    public class GetRequest extends RequestcontrollerRequest<Void> {

      private static final String REST_PATH = "void/{id}";

      /**
       * Create a request for the method "requestController.getRequest".
       *
       * This request holds the parameters needed by the the requestcontroller server.  After setting
       * any optional parameters, call the {@link GetRequest#execute()} method to invoke the remote
       * operation. <p> {@link
       * GetRequest#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected GetRequest(java.lang.String id) {
        super(Requestcontroller.this, "GET", REST_PATH, null, Void.class);
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
      public GetRequest setAlt(java.lang.String alt) {
        return (GetRequest) super.setAlt(alt);
      }

      @Override
      public GetRequest setFields(java.lang.String fields) {
        return (GetRequest) super.setFields(fields);
      }

      @Override
      public GetRequest setKey(java.lang.String key) {
        return (GetRequest) super.setKey(key);
      }

      @Override
      public GetRequest setOauthToken(java.lang.String oauthToken) {
        return (GetRequest) super.setOauthToken(oauthToken);
      }

      @Override
      public GetRequest setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetRequest) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetRequest setQuotaUser(java.lang.String quotaUser) {
        return (GetRequest) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetRequest setUserIp(java.lang.String userIp) {
        return (GetRequest) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public GetRequest setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public GetRequest set(String parameterName, Object value) {
        return (GetRequest) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "requestController.updateRequest".
     *
     * This request holds the parameters needed by the the requestcontroller server.  After setting any
     * optional parameters, call the {@link UpdateRequest#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public UpdateRequest updateRequest(java.lang.String id) throws java.io.IOException {
      UpdateRequest result = new UpdateRequest(id);
      initialize(result);
      return result;
    }

    public class UpdateRequest extends RequestcontrollerRequest<Void> {

      private static final String REST_PATH = "void/{id}";

      /**
       * Create a request for the method "requestController.updateRequest".
       *
       * This request holds the parameters needed by the the requestcontroller server.  After setting
       * any optional parameters, call the {@link UpdateRequest#execute()} method to invoke the remote
       * operation. <p> {@link UpdateRequest#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected UpdateRequest(java.lang.String id) {
        super(Requestcontroller.this, "PUT", REST_PATH, null, Void.class);
        this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public UpdateRequest setAlt(java.lang.String alt) {
        return (UpdateRequest) super.setAlt(alt);
      }

      @Override
      public UpdateRequest setFields(java.lang.String fields) {
        return (UpdateRequest) super.setFields(fields);
      }

      @Override
      public UpdateRequest setKey(java.lang.String key) {
        return (UpdateRequest) super.setKey(key);
      }

      @Override
      public UpdateRequest setOauthToken(java.lang.String oauthToken) {
        return (UpdateRequest) super.setOauthToken(oauthToken);
      }

      @Override
      public UpdateRequest setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (UpdateRequest) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public UpdateRequest setQuotaUser(java.lang.String quotaUser) {
        return (UpdateRequest) super.setQuotaUser(quotaUser);
      }

      @Override
      public UpdateRequest setUserIp(java.lang.String userIp) {
        return (UpdateRequest) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String id;

      /**

       */
      public java.lang.String getId() {
        return id;
      }

      public UpdateRequest setId(java.lang.String id) {
        this.id = id;
        return this;
      }

      @Override
      public UpdateRequest set(String parameterName, Object value) {
        return (UpdateRequest) super.set(parameterName, value);
      }
    }

  }

  /**
   * Create a request for the method "findMatch".
   *
   * This request holds the parameters needed by the the requestcontroller server.  After setting any
   * optional parameters, call the {@link FindMatch#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public FindMatch findMatch() throws java.io.IOException {
    FindMatch result = new FindMatch();
    initialize(result);
    return result;
  }

  public class FindMatch extends RequestcontrollerRequest<com.appspot.formal_cascade_539.requestcontroller.model.LunchDate> {

    private static final String REST_PATH = "matchRequest";

    /**
     * Create a request for the method "findMatch".
     *
     * This request holds the parameters needed by the the requestcontroller server.  After setting
     * any optional parameters, call the {@link FindMatch#execute()} method to invoke the remote
     * operation. <p> {@link
     * FindMatch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected FindMatch() {
      super(Requestcontroller.this, "GET", REST_PATH, null, com.appspot.formal_cascade_539.requestcontroller.model.LunchDate.class);
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
    public FindMatch setAlt(java.lang.String alt) {
      return (FindMatch) super.setAlt(alt);
    }

    @Override
    public FindMatch setFields(java.lang.String fields) {
      return (FindMatch) super.setFields(fields);
    }

    @Override
    public FindMatch setKey(java.lang.String key) {
      return (FindMatch) super.setKey(key);
    }

    @Override
    public FindMatch setOauthToken(java.lang.String oauthToken) {
      return (FindMatch) super.setOauthToken(oauthToken);
    }

    @Override
    public FindMatch setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (FindMatch) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public FindMatch setQuotaUser(java.lang.String quotaUser) {
      return (FindMatch) super.setQuotaUser(quotaUser);
    }

    @Override
    public FindMatch setUserIp(java.lang.String userIp) {
      return (FindMatch) super.setUserIp(userIp);
    }

    @Override
    public FindMatch set(String parameterName, Object value) {
      return (FindMatch) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Requestcontroller}.
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

    /** Builds a new instance of {@link Requestcontroller}. */
    @Override
    public Requestcontroller build() {
      return new Requestcontroller(this);
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
     * Set the {@link RequestcontrollerRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setRequestcontrollerRequestInitializer(
        RequestcontrollerRequestInitializer requestcontrollerRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(requestcontrollerRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
