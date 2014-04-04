package com.lunchbuddy.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;
import com.lunchbuddy.models.LunchDate;
import com.lunchbuddy.models.Request;

@Api(name = "requestcontroller", version = "v1", description = "endpoint for matching requests")
public class RequestController {

	
	@ApiMethod(name = "findMatch", httpMethod = HttpMethod.GET)
	public LunchDate matchRequest(Request req) {
		LunchDate result = null;
		// iterate over request pool and find best match
		CollectionResponse<Request> listResp = listRequest("", null);
		Collection<Request> requestPool = listResp.getItems();
		result = MatchingAlgorithm.findMatch(req, requestPool);
		return result;
	}
	
	

	@SuppressWarnings({ "unchecked", "unused" })
	private CollectionResponse<Request> listRequest(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;

		List<Request> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Request.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Request>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and
			// accomodate
			// for lazy fetch.
			for (Request obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Request> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/*
	 * Helper Methods to interface with the model endpoints
	 */
	public Request createRequest(Request request) {
		PersistenceManager pm = getPersistenceManager();
		pm.makePersistent(request);
		pm.close();
		return request;
	}

	public void getRequest(@Named("id") String id) {

	}

	public void deleteRequest(@Named("id") String id) {
		PersistenceManager pm = getPersistenceManager();
		// TODO: implement
	}

	public void updateRequest(@Named("id") String id) {
		PersistenceManager pm = getPersistenceManager();
		// TODO: implement
	}

	// accessor method for persistence manager
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
