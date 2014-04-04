package com.lunchbuddy.models;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.jdo.annotations.EmbeddedOnly;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Request {

	// child class must have a key field whose type can contain the parent key
	// information: either a Key, or a Key value encoded as a string
	// since request is a child class of parent, it needs to have a KEY
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent(mappedBy = "request")
	private User user;

	

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
	public Request(Date startTime, Date endTime, User user, double lat,
			double lon) {
		TimeInterval t = new TimeInterval(startTime, endTime);
		this.user = user;
		this.lat = lat;
		this.lon = lon;
		this.interval = t;
	}

	// Getters & Setters

	public Key getKey() {
		return this.key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
