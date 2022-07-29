package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	RequestDispatcher rd = null;
	String uname = request.getParameter("uname");
	String pword = request.getParameter("pword");
	
		if (uname.equalsIgnoreCase("Nawwal")&&pword.equals("Nawwal")) 
		{
			out.println("From inside servlet 'LoginController'");
		}
		else
		{
			rd = request.getRequestDispatcher("ErrorLogin.html");
			rd.include(request,response);
		}
	
	}

}
