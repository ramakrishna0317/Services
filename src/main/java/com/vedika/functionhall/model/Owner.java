package com.vedika.functionhall.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "functionhall_reference_data")
public class Owner {
	@Id
	private String id;
	private String name;

	private String firstName;

	private String lastName;

	private String city;

	private String state;

	private String zipcode;

	/* db ref */
	private List<FunctionHall> functionhall;
 private List<AwsCredentials> ImageDetials;
 public List<AwsCredentials> getAwscredentials() {
	return  ImageDetials;
}

public void setAwscredentials(List<AwsCredentials> awscredentials) {
	this. ImageDetials = awscredentials;
}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public List<FunctionHall> getFunctionhall() {
		return functionhall;
	}

	public void setFunctionhall(List<FunctionHall> functionhall) {
		this.functionhall = functionhall;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", firstName=" + firstName + ", lastName=" + lastName + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + ", functionhall=" + functionhall + "]";
	}


	
}