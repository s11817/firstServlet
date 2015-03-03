package com.example.servletjspdemo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GettingServlet")
public class GettingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static int id = 1;
    public static Data user[] = new Data[5];
  
	
    public GettingServlet() {
    	
		
        super();
       
      }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ServletContext context = request.getServletContext();
		HttpSession session = request.getSession();
		
		if(session.getAttribute("name") != null) response.sendRedirect("wasSend.jsp");
		if(id>5) response.sendRedirect("noPlace.jsp");
		
		int i = id -1;
		
		user[i] = new Data();

		user[i].setName(request.getParameter("name"));
		user[i].setSurname(request.getParameter("surname"));
		user[i].setEmail(request.getParameter("email"));
		user[i].setWorkname(request.getParameter("workname"));
		user[i].setInfo(request.getParameter("info"));
		user[i].setWork(request.getParameter("work"));
	
		response.getWriter().println("thanks for form "+user[i].getName());
	
	session.setAttribute("name",user[i].getName());


	id++;
	
	
	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
