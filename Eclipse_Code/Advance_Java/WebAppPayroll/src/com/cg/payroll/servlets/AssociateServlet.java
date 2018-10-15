package com.cg.payroll.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Associate")
public class AssociateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AssociateServlet() {
        super();
    }
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<html><body><div align='center'>");
		out.println("<h2 style='color:Slateblue;'>Associate Details</h2>");
		out.println("<form name='Associate' action='BankDetails' method='post'><table bgcolor=Slateblue>");
		out.println("<tr><td>AssociateID:</td><td><input type=text name=associateId placeholder=Associate Id required></td></tr>");
		out.println("<tr><td>yearlyInvestmentUnder8oC:</td><td><input type=number name=investment placeholder=Investment required></td></tr>");
		out.println("<tr><td>First Name:</td><td><input type=text name=firstName placeholder=First Name required></td></tr>");
		out.println("<tr><td>Last Name:</td><td><input type=text name=lastName placeholder=Last Name required></td></tr>");
		out.println("<tr><td>Department:</td><td><input type=text name=department placeholder=Department required></td></tr>");
		out.println("<tr><td>Designation:</td><td><input type=text name=designation placeholder=Designation required></td></tr>");
		out.println("<tr><td>Pancard No:</td><td><input type=text name=pancard placeholder=ABCDE1234A pattern=([A-Z]{5}[0-9]{4}[A-Z]{1}) required></td></tr>");
		out.println("<tr><td>Email Id:</td><td><input type=email name=emailId placeholder=Email Id required></td></tr>");
		out.println("</table><br>");
		out.println("<button type='submit' name=next>Next</button>");
		//out.println("<a href='BankDetails'><button name='next'>Next</button></a>");
		out.println("<button type='reset' name=reset>Reset</button>");
		out.print("</form></div></body></html>");
	}


}
