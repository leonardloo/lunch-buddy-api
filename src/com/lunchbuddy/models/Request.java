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

	/*
	 * Inner class Time Interval for timing logic
	 */
	@PersistenceCapable
	@EmbeddedOnly
	public static class TimeInterval {

		private Date startTime;
		private Date endTime;

		public TimeInterval(Date start, Date end) {
			if (start.compareTo(end) >= 0) {
				throw new IllegalArgumentException();
			}
			this.startTime = start;
			this.endTime = end;
		}

		// Getters & Setters
		public Date getStartTime() {
			return startTime;
		}

		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}

		public Date getEndTime() {
			return endTime;
		}

		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}

		public long getLength() {
			return (this.endTime.getTime() - this.startTime.getTime());
		}

		// helper methods

		public boolean hasExpired() {
			if (this.endTime.compareTo(Calendar.getInstance().getTime()) < 0) {
				return true;
			} else {
				return false;
			}
		}

		// overlap between 2 intervals in ms, returns -1 if no overlap
		public long msOverlap(TimeInterval otherInterval) {

			// this interval completely before the otherInterval or the
			// otherInterval completely before the this interval
			if ((this.endTime.compareTo(otherInterval.getStartTime()) <= 0)
					|| (otherInterval.getEndTime().compareTo(this.startTime)) <= 0) {
				return -1;
			}
			// this.endTime is after otherInterval.startTime
			if (this.endTime.compareTo(otherInterval.getStartTime()) > 0) {
				long overlap = Math.min(this.endTime.getTime()
						- otherInterval.getStartTime().getTime(),
						otherInterval.getLength());
				return overlap;
			}
			// otherInterval.endTime is after this.startTime
			if (otherInterval.getEndTime().compareTo(this.endTime) > 0) {
				long overlap = Math.min(otherInterval.getEndTime().getTime()
						- this.startTime.getTime(), this.getLength());
				return overlap;
			}
			return 0;
		}

		// overlap method returning a TimeInterval object
		public TimeInterval overlapInterval(TimeInterval otherInterval) {

			Date currentStart, currentEnd;

			if (this.startTime.compareTo(otherInterval.startTime) >= 0) {
				currentStart = this.startTime;
			} else {
				currentStart = otherInterval.startTime;
			}

			if (this.endTime.compareTo(otherInterval.endTime) <= 0) {
				currentEnd = this.endTime;
			} else {
				currentEnd = otherInterval.endTime;
			}

			if (currentStart.compareTo(currentEnd) < 0) {
				return new TimeInterval(currentStart, currentEnd);
			} else {
				return null;
			}
		}

	}

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
