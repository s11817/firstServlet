package com.example.servletjspdemo.web;

public class Data {
	
	String name;
	String surname;
	String email;
	String workname;
	String info;
	String work;
	
	public Data() {
		super();
	}
	
	public Data(String name, String surname, String email, String workname, String info, String work) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.workname = workname;
		this.info = info;
		this.work = work;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWorkname() {
		return workname;
	}
	public void setWorkname(String workname) {
		this.workname = workname;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
	
	
	
	
	

}
