package com.lunchbuddy.api;

import javax.jdo.PersistenceManager;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.lunchbuddy.models.LBUser;

@Api(name = "lunchbuddy", version = "v1")
public class UserController {

	@ApiMethod(name = "users.create", path = "users/create", httpMethod = HttpMethod.POST)
	public LBUser createUser(LBUser user) {
		PersistenceManager pm = getPersistenceManager();
		pm.makePersistent(user);
		pm.close();
		return user;
	}
	
	@ApiMethod(name = "users.get", path = "users/get/{id}", httpMethod = HttpMethod.GET)
	public LBUser getUser(@Named("id") String id) {
		PersistenceManager pm = getPersistenceManager();
		//TODO: implement
		Key k = KeyFactory.createKey(LBUser.class.getSimpleName(), id);
		LBUser user = pm.getObjectById(LBUser.class, k);
		return user;
	}

	@ApiMethod(name = "users.removeUser", path = "users/delete/{id}", httpMethod = HttpMethod.DELETE)
	public void deleteUser(@Named("id") String id) {
		PersistenceManager pm = getPersistenceManager();
		//TODO: implement
	}
	
	@ApiMethod(name = "users.update", path = "users/update/{id}", httpMethod = HttpMethod.PUT)
	public void updateUser(@Named("id") String id, LBUser user) {
		PersistenceManager pm = getPersistenceManager();
		//TODO: implement 
	}
	
	

	// accessor method for persistence manager
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
}

