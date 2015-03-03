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
		
	
		
		response.getWriter().println("Hello!");
		response.getWriter().println("Zapisani u¿ytkownicy to: ");
		for( int idv=0; idv < Data.id ; idv++){
			response.getWriter().println(" ");
			response.getWriter().println("User nr: " + (idv+1));
			response.getWriter().println("name: "+Data.user[idv].getName());
			response.getWriter().println("surname: "+Data.user[idv].getSurname());
			response.getWriter().println("email: "+Data.user[idv].getEmail());
			response.getWriter().println("workname: "+Data.user[idv].getWorkname());
			response.getWriter().println("info: "+Data.user[idv].getInfo());
			response.getWriter().println("work: "+Data.user[idv].getWork());
			
			
			
		}
		
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
}
