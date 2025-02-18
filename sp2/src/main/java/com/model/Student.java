package com.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
	
	private int id;
	private String name;
	private String city;
	private double percentage;
	private int[] marks;
	private Map<String,List<String>> details= new HashMap();
	private Address Address;

	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public Map<String, List<String>> getDetails() {
		return details;
	}
	public void setDetails(Map<String, List<String>> details) {
		this.details = details;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + ", marks="
				+ Arrays.toString(marks) + ", details=" + details + ", Address=" + Address + "]";
	}
	
	

}
