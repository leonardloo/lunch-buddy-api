package com.lunchbuddy.api;

import javax.jdo.PersistenceManager;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.lunchbuddy.models.Request;

@Api(name = "lunchbuddy", version = "v1")
public class RequestController {

	@ApiMethod(name = "requests.create", path = "requests/create", httpMethod = HttpMethod.POST)
	public Request createRequest(Request request) {
		PersistenceManager pm = getPersistenceManager();
		pm.makePersistent(request);
		pm.close();
		return request;
	}

	@ApiMethod(name = "requests.get", path = "requests/get/{id}", httpMethod = HttpMethod.GET)
	public void getRequest(@Named("id") String id) {
		PersistenceManager pm = getPersistenceManager();
		// TODO: implement
	}

	@ApiMethod(name = "requests.removeUser", path = "requests/delete/{id}", httpMethod = HttpMethod.DELETE)
	public void deleteRequest(@Named("id") String id) {
		PersistenceManager pm = getPersistenceManager();
		// TODO: implement
	}

	@ApiMethod(name = "requests.update", path = "requests/update/{id}", httpMethod = HttpMethod.PUT)
	public void updateRequest(@Named("id") String id) {
		PersistenceManager pm = getPersistenceManager();
		// TODO: implement
	}

	// accessor method for persistence manager
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}

