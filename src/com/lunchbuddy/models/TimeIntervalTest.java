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


	@Test
	public void testOverlapIntervalPartial() {
		/*
		System.out.println(t1.getStartTime().toString());
		System.out.println(t1.getEndTime().toString());
		System.out.println(t2.getStartTime().toString());
		System.out.println(t2.getEndTime().toString());
		*/

		TimeInterval t1t2 = t1.overlapInterval(t2);
		TimeInterval t2t1 = t2.overlapInterval(t1);

		/*
		System.out.println(t1t2.getStartTime().toString());
		System.out.println(t1t2.getEndTime().toString());
		
		System.out.println(new TimeInterval(new Date(5), new Date(10)).getStartTime());
		System.out.println(new TimeInterval(new Date(5), new Date(10)).getEndTime());
		*/


		assertEquals(t1t2.getStartTime(), new TimeInterval(new Date(5), new Date(10)).getStartTime() );
		assertEquals(t1t2.getEndTime(), new TimeInterval(new Date(5), new Date(10)).getEndTime() );

		assertEquals(t2t1.getStartTime(), new TimeInterval(new Date(5), new Date(10)).getStartTime() );
		assertEquals(t2t1.getEndTime(), new TimeInterval(new Date(5), new Date(10)).getEndTime() );

	}


	@Test
	public void testOverlapIntervalTotal() {


		TimeInterval t3t4 = t3.overlapInterval(t4);
		TimeInterval t4t3 = t4.overlapInterval(t3);

		assertEquals(t3t4.getStartTime(), new TimeInterval(new Date(17), new Date(19)).getStartTime() );
		assertEquals(t4t3.getEndTime(), new TimeInterval(new Date(17), new Date(19)).getEndTime() );

	}



	@Test
	public void testOverlapIntervalNull() {


		TimeInterval t1t3 = t1.overlapInterval(t3);
		TimeInterval t3t1 = t3.overlapInterval(t1);


		assertEquals(t1t3,null );
		assertEquals(t3t1,null );			
	}

}
