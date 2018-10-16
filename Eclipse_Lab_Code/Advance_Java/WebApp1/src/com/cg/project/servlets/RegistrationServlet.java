package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String associateId = request.getParameter("associateId");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String department = request.getParameter("department");
		String designation = request.getParameter("designation");
		String dateOfBirth = request.getParameter("dateOfBirth");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String[] hobbies = request.getParameterValues("hobbies");
		String gender = request.getParameter("gender");
		String graduation = request.getParameter("graduation");
		String postGraduation = request.getParameter("postGraduation");
		String emailId = request.getParameter("emailId");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String pinCode = request.getParameter("pincode");
		String country = request.getParameter("country");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><div align='center'><table border=1>");
		out.println("<tr><td>AssociateId = "+associateId+"</td></tr>");
		out.println("<tr><td>First Name = "+firstName+"</td></tr>");
		out.println("<tr><td>Last Name = "+lastName+"</td></tr>");
		out.println("<tr><td>Department = "+department+"</td></tr>");
		out.println("<tr><td>Designation = "+designation+"</td></tr>");
		out.println("<tr><td>Date of Birth = "+dateOfBirth+"</td></tr>");
		out.println("<tr><td>Username = "+username+"</td></tr>");
		out.println("<tr><td>Password = "+password+"</td></tr>");
		out.println("<tr><td>Hobbies = ");
		for (String h:hobbies)
			out.print(h);
		out.println("</td></tr>");
		out.println("<tr><td>Gender = "+gender+"</td></tr>");
		out.println("<tr><td>Graduation = "+graduation+"</td></tr>");
		out.println("<tr><td>Post Graduation = "+postGraduation+"</td></tr>");
		out.println("<tr><td>Email Id = "+emailId+"</td></tr>");
		out.println("<tr><td>Age = "+age+"</td></tr>");
		out.println("<tr><td>Address = "+address+"</td></tr>");
		out.println("<tr><td>City = "+city+"</td></tr>");
		out.println("<tr><td>pinCode = "+pinCode+"</td></tr>");
		out.println("<tr><td>Country = "+country+"</td></tr>");
		out.print("</table></div></body></html>");
	}
}
