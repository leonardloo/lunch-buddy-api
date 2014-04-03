package com.lunchbuddy.models;

public class LunchDate {

	private Request requestA;
	private Request requestB;
	private String restaurantId;

	// TODO: constructor with desired init parameters

	// Getters & Setters
	public Request getRequestA() {
		return requestA;
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
