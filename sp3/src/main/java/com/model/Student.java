package com.model;

import com.dao.object;

public class Student {
	private int id;
	private String name;
	private String city;
	private double perceentage;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", perceentage=" + perceentage + "]";
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
	public object getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPerceentage() {
		return perceentage;
	}
	public void setPerceentage(double perceentage) {
		this.perceentage = perceentage;
	}
	

}
