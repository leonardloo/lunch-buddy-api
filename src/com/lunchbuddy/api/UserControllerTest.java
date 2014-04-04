package com.lunchbuddy.api;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;

import org.junit.*;

import static org.junit.Assert.*;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.lunchbuddy.models.User;

public class UserControllerTest {

	public static final String NAME_FOR_TESTING = "Rachel";
	public static final String ID_FOR_TESTING = "test@gmail.com";

	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(
			new LocalDatastoreServiceTestConfig());

	@Before
	public void setUp() {
		helper.setUp();
	}

	@After
	public void tearDown() {
		helper.tearDown();
	}

//	@Test
//	public void simpleJdo() {
//		User u = new User();
//		u.setName(NAME_FOR_TESTING);
//		u.setEduEmail(ID_FOR_TESTING);
//
//		PersistenceManager pm;
//
//		// prove User doesn't span tests
//		pm = PMF.get().getPersistenceManager();
//		boolean notFound = false;
//		try {
//			Key k = KeyFactory.createKey(User.class.getName(), ID_FOR_TESTING);
//			pm.getObjectById(User.class, k);
//			fail("should have raised not found");
//		} catch (JDOObjectNotFoundException e) {
//			notFound = true;
//		} finally {
//			pm.close();
//		}
//		assertTrue(notFound);
//
//		pm = PMF.get().getPersistenceManager();
//		try {
//			pm.makePersistent(u);
//		} finally {
//			pm.close();
//		}
//
//		pm = PMF.get().getPersistenceManager();
//		try {
//			Key k = KeyFactory.createKey(User.class.getName(), ID_FOR_TESTING);
//			u = pm.getObjectById(User.class, k);
//		} finally {
//			pm.close();
//		}
//
//		assertNotNull(pm);
//		assertEquals(NAME_FOR_TESTING, u.getName());
//	}
}