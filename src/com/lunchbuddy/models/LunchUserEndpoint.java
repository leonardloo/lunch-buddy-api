package com.lunchbuddy.models;

import com.lunchbuddy.api.PMF;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "lunchuserendpoint", namespace = @ApiNamespace(ownerDomain = "lunchbuddy.com", ownerName = "lunchbuddy.com", packagePath = "models"))
public class LunchUserEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listLunchUser")
	public CollectionResponse<LunchUser> listLunchUser(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<LunchUser> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(LunchUser.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<LunchUser>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (LunchUser obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<LunchUser> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getLunchUser")
	public LunchUser getLunchUser(@Named("id") String id) {
		PersistenceManager mgr = getPersistenceManager();
		LunchUser lunchuser = null;
		try {
			lunchuser = mgr.getObjectById(LunchUser.class, id);
		} finally {
			mgr.close();
		}
		return lunchuser;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param lunchuser the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertLunchUser")
	public LunchUser insertLunchUser(LunchUser lunchuser) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (containsLunchUser(lunchuser)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.makePersistent(lunchuser);
		} finally {
			mgr.close();
		}
		return lunchuser;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param lunchuser the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateLunchUser")
	public LunchUser updateLunchUser(LunchUser lunchuser) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsLunchUser(lunchuser)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(lunchuser);
		} finally {
			mgr.close();
		}
		return lunchuser;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeLunchUser")
	public void removeLunchUser(@Named("id") String id) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			LunchUser lunchuser = mgr.getObjectById(LunchUser.class, id);
			mgr.deletePersistent(lunchuser);
		} finally {
			mgr.close();
		}
	}

	private boolean containsLunchUser(LunchUser lunchuser) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(LunchUser.class, lunchuser.getEduEmail());
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
