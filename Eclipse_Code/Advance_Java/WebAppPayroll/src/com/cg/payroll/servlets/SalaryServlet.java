package com.cg.payroll.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Salary")
public class SalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SalaryServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String associateId = request.getParameter("associateId");
		String yearlyInvestmentUnder8oC = request.getParameter("investment");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String department = request.getParameter("department");
		String designation = request.getParameter("designation");
		String pancard = request.getParameter("pancard");
		String emailId = request.getParameter("emailId");
		String bankName = request.getParameter("bankName");
		String accountNumber = request.getParameter("accountNumber");
		String ifscCode = request.getParameter("ifscCode");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body><h2>Associate Details</h2><table>");
		out.println("<tr><td>associateId: "+associateId+"</td></tr>");
		out.println("<tr><td>yearlyInvestmentUnder8oC: "+yearlyInvestmentUnder8oC+"</td></tr>");
		out.println("<tr><td>firstName: "+firstName+"</td></tr>");
		out.println("<tr><td>lastName: "+lastName+"</td></tr>");
		out.println("<tr><td>department: "+department+"</td></tr>");
		out.println("<tr><td>designation: "+designation+"</td></tr>");
		out.println("<tr><td>pancard: "+pancard+"</td></tr>");
		out.println("<tr><td>emailId: "+emailId+"</td></tr>");
		out.println("</table>");
		
		out.print("<h2>Bank Details</h2><table>");
		out.println("<tr><td>Bank Name: "+bankName+"</td></tr>");
		out.println("<tr><td>Account Number: "+accountNumber+"</td></tr>");
		out.println("<tr><td>IFSC Code: "+ifscCode+"</td></tr>");
		out.print("</table>");
		
		
	}

}
