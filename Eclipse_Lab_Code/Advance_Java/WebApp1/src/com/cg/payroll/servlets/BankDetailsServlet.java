package com.cg.payroll.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BankDetails")
public class BankDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BankDetailsServlet() {
        super();
    }
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
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
		out.println("</table><br><p style='color:red;'>Press Next button if entered data is correct</p><br>"+
					"<a href='Salary'><button type='Submit' form='form1' value='submit' name='next'>Next</button></a>"+
					"</body></html+>");
	}

}
