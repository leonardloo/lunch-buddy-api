package com.lunchbuddy.models;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class User {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String eduEmail;
	
	@Persistent(defaultFetchGroup = "true")
    private Request request;

	@Persistent
	private String fbId;
	@Persistent
	private String privateEmail;

	@Persistent
	private String name;
	@Persistent
	private String gender;

	public User(String eduEmail, String name, String fbId, String privateEmail, String gender){
		if(eduEmail == null){
			throw new IllegalArgumentException();
		}
		this.eduEmail = eduEmail;
		this.name = name;
		this.fbId = fbId;
		this.privateEmail = privateEmail;
		this.gender = gender;
	}
	
	
	public String getFbId() {
		return fbId;
	}

	public void setFbId(String fbId) {
		this.fbId = fbId;
	}

	public String getPrivateEmail() {
		return privateEmail;
	}

	public void setPrivateEmail(String privateEmail) {
		this.privateEmail = privateEmail;
	}

	public String getEduEmail() {
		return eduEmail;
	}

	public void setEduEmail(String eduEmail) {
		this.eduEmail = eduEmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
