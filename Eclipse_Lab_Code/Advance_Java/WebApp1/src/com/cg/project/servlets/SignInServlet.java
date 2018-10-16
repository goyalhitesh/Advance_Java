package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignIn")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public SignInServlet() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><div align='center'>");
		
		if(username.equals("12345") && password.equals("hhgg11##"))
			out.print("<font color='green'>Welcome Associate "+username+"</font>");
		else
			out.print("<font color='red'>Username or Password is wrong!! Please Enter again.</font>");
		out.print("</div></body></html>");
	}

}
