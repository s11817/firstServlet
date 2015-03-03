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
  
		
    public GettingServlet() {
    	
		
        super();
       
      }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ServletContext context = request.getServletContext();
		HttpSession session = request.getSession();
		
		if(session.getAttribute("name") != null) response.sendRedirect("wasSend.jsp");
		if(Data.id>4) response.sendRedirect("noPlace.jsp");
		
		
		//Data nowy = new Data();
		Data.user[Data.id] = new Data(null, null, null, null, null, null);

		Data.user[Data.id].setName(request.getParameter("name"));
		Data.user[Data.id].setSurname(request.getParameter("surname"));
		Data.user[Data.id].setEmail(request.getParameter("email"));
		Data.user[Data.id].setWorkname(request.getParameter("workname"));
		Data.user[Data.id].setInfo(request.getParameter("info"));
		Data.user[Data.id].setWork(request.getParameter("work"));
	
		response.getWriter().println("Thanks for form ");
	
	session.setAttribute("name",Data.user[Data.id].getName());


	
	Data.id++;
	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
