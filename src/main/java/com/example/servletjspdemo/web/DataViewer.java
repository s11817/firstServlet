package com.example.servletjspdemo.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

@WebServlet("/DataViewer")
public class DataViewer extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	
	Data user[];
	
	  
	
	
     public DataViewer() {
        super();
     }
     
     

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	int id=1;
		response.getWriter().println("Hello!");
		for(int i=0; i<5 ; i++) response.getWriter().println(user[i].getName());
		 
		
		
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
}
