package com.lunchbuddy.models;

import java.util.Calendar;
import java.util.Date;

import javax.jdo.annotations.EmbeddedOnly;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@EmbeddedOnly
public class TimeInterval {

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
