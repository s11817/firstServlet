package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.*;
import com.example.servletjspdemo.web.Data;

public class StorageService {
	
	private List<Data> db = new ArrayList<Data>();
	
	public void add(Data user){
		Data newuser = new Data(user.getName(), user.getSurname(), user.getEmail(), user.getWorkname(),user.getInfo(), user.getWork());
		db.add(newuser);
	}
	 
	public List<Data> getAllUsers(){
		return db;
	}

}
