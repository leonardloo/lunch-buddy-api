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

@Api(name = "lunchdateendpoint", namespace = @ApiNamespace(ownerDomain = "lunchbuddy.com", ownerName = "lunchbuddy.com", packagePath = "models"))
public class LunchDateEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listLunchDate")
	public CollectionResponse<LunchDate> listLunchDate(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<LunchDate> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(LunchDate.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<LunchDate>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (LunchDate obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<LunchDate> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getLunchDate")
	public LunchDate getLunchDate(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		LunchDate lunchdate = null;
		try {
			lunchdate = mgr.getObjectById(LunchDate.class, id);
		} finally {
			mgr.close();
		}
		return lunchdate;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param lunchdate the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertLunchDate")
	public LunchDate insertLunchDate(LunchDate lunchdate) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (containsLunchDate(lunchdate)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.makePersistent(lunchdate);
		} finally {
			mgr.close();
		}
		return lunchdate;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param lunchdate the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateLunchDate")
	public LunchDate updateLunchDate(LunchDate lunchdate) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsLunchDate(lunchdate)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(lunchdate);
		} finally {
			mgr.close();
		}
		return lunchdate;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeLunchDate")
	public void removeLunchDate(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			LunchDate lunchdate = mgr.getObjectById(LunchDate.class, id);
			mgr.deletePersistent(lunchdate);
		} finally {
			mgr.close();
		}
	}

	private boolean containsLunchDate(LunchDate lunchdate) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(LunchDate.class, lunchdate.getId());
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
