package com.john.models;

public class People {
	private String name;
	private String gender;
	private int age;
	private String job;
	private String hobby;
	privtae String sn;
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		if(name == null ) name = "John Doe";
		return "Hi My name is "+getName();
	}
	
	
}
