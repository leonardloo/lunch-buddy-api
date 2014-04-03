package com.lunchbuddy.models;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeIntervalTest {

	private TimeInterval t1;
	private TimeInterval t2;
	private TimeInterval t3;
	private TimeInterval t4;

	@Before
	public void setUp() throws Exception {
		t1 = new TimeInterval(new Date(1), new Date(10));
		t2 = new TimeInterval(new Date(5), new Date(15));
		t3 = new TimeInterval(new Date(16), new Date(20));
		t4 = new TimeInterval(new Date(17), new Date(19));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHasExpired() {
		assertTrue(t1.hasExpired());
	}

	@Test
	public void testMsOverlap() {
		assertEquals(5, t1.msOverlap(t2));
		assertEquals(-1, t2.msOverlap(t3));
		assertEquals(2, t3.msOverlap(t4));
	}

}
