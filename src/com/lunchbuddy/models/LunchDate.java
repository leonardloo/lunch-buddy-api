package com.lunchbuddy.models;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class LunchDate {

	private static final long WAIT_TIME = 5 * 60 * 60;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private Request requestA;
	@Persistent
	private Request requestB;
	@Persistent
	private String restaurantId;
	@Persistent
	private boolean isConfirmed;
	@Persistent
	private TimeInterval matchedInterval;
	@Persistent
	private Date expiryTime;

	public LunchDate(Request requestA, Request requestB, String restaurantId,
			TimeInterval matched) {
		this.requestA = requestA;
		this.requestB = requestB;
		this.matchedInterval = matched;
		this.restaurantId = restaurantId;
		this.expiryTime = new Date(System.currentTimeMillis() + WAIT_TIME);
		this.isConfirmed = false;
	}

	// Getters & Setters
	
	
	public Request getRequestA() {
		return requestA;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public TimeInterval getMatchedInterval() {
		return matchedInterval;
	}

	public void setMatchedInterval(TimeInterval matchedInterval) {
		this.matchedInterval = matchedInterval;
	}

	public Date getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	public void setRequestA(Request requestA) {
		this.requestA = requestA;
	}

	public Request getRequestB() {
		return requestB;
	}

	public void setRequestB(Request requestB) {
		this.requestB = requestB;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

}
