package com.lunchbuddy.models;

import java.util.List;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Request {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	@Extension(vendorName = "datanucleus", key = "gae.encoded-pk", value = "true")
	private String id;

	@Persistent
	private String userId;

	@Persistent
	// user selected time interval for lunch date request
	private TimeInterval interval;

	@Persistent
	// sorted list of restaurant Ids sorted by preference
	private List<String> restaurantPreferences;
	// latitude and longitude, from where user request originated

	@Persistent
	private double lat;

	@Persistent
	private double lon;

	// TODO: constructor with desired init parameters

	// Getters & Setters
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRequestId() {
		return id;
	}

	public void setRequestId(String requestId) {
		this.id = requestId;
	}

	public TimeInterval getInterval() {
		return interval;
	}

	public void setInterval(TimeInterval interval) {
		this.interval = interval;
	}

	public List<String> getRestaurantPreferences() {
		return restaurantPreferences;
	}

	public void setRestaurantPreferences(List<String> restaurantPreferences) {
		this.restaurantPreferences = restaurantPreferences;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

}
