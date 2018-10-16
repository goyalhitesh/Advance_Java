package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   /*- public LoginServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}
*/
	/*@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<div align=center><h2 style=color:Slateblue;>Signin Page</h2>");
		out.println("<form name='loginForm' action='SignIn' method='post'><table>");
		out.println("<tr><td>Username: </td><td><input type=text name=username></td></tr>");
		out.println("<tr><td>Password: </td><td><input type=password name=password></td></tr>");
		out.println("</table><br>");
		out.println("<button name=submit value=Signin>Signin</button>");
		out.println("<button name=reset value=Reset>Reset</button>");
		out.println("<button name=forgot password value=Forgot Password>Forgot Password</button>");
		out.print("</form></div></body></html>");
	}*/
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int associateId = Integer.parseInt(request.getParameter("username"));
		String password = request.getParameter("password");
		
		Associate associate = new Associate(associateId, password);
		RequestDispatcher distpatcher;
		if(associate.getAssociateId()==11111 && associate.getPassword().equals("hhgg11"))
		{
			distpatcher = request.getRequestDispatcher("loginSuccessPage.jsp");
			request.setAttribute("associate", associate);
			distpatcher.forward(request, response);
		}
		else
		{
			distpatcher = request.getRequestDispatcher("errorPage.jsp");
			request.setAttribute("errorMessage", "associateId or password is wrong");
			distpatcher.forward(request, response);
		}
	}
	
	
}
