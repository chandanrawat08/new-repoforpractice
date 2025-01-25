package com.example.demo.model;

public class Student {
	
	private Integer sId;
	private String name;
	private String email;
	
	
	
	public Student(Integer sId, String name, String email) {
		this.sId = sId;
		this.name = name;
		this.email = email;
	}
	
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
