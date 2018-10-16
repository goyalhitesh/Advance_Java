package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Reg")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<div align=center><h2 style=color:Slateblue;> SignUp Page </h2>");
		out.println("<form name='RegistrationForm' action='Registration' method='post'><table>");
		out.println("<tr><td>Associate ID:</td><td><input type=text name=associateId placeholder=AssociateID></td></tr>");
		out.println("<tr><td>First Name:</td><td><input type=text name=firstName placeholder=FirstName></td></tr>");
		out.println("<tr><td>Last Name:</td><td><input type=text name=lastName placeholder=LastName></td></tr>");
		out.println("<tr><td>Department:</td><td><input type=text name=department placeholder=Department></td></tr>");
		out.println("<tr><td>Designation:</td><td><input type=text name=designation placeholder=Designation></td></tr>");
		out.println("<tr><td>Date of Birth:</td><td><input type=date name=dateOfBirth placeholder=2000-01-01></td></tr>");
		out.println("<tr><td>Username:</td><td><input type=text name=username placeholder=Username></td></tr>");
		out.println("<tr><td>Password:</td><td><input type=password name=password placeholder=Password></td></tr>");
		out.println("<tr><td>Hobbies:</td><td><input type=checkbox name=hobbies value=Cricket checked>Cricket");
		out.println("<input type=checkbox name=hobbies value=Singing>Singing<input type=checkbox name=hobbies value=Chess>Chess");
		out.println("<input type=checkbox name=hobbies value=Reading Books>Reading Books<br><input type=checkbox name=hobbies value=Dancing>Dancing");
		out.println("<input type=checkbox name=hobbies value=BasketBall>BasketBall<input type=checkbox name=hobbies value=Swimming>Swimming</td></tr>");
		out.println("<tr><td>Gender:</td>");
		out.println("<td><input type=radio name=gender value=Male checked>Male<input type=radio name=gender value=Female>Female");
		out.println("<input type=radio name=gender value=Other>Other<br></td></tr>");
		out.println("<tr><td>Graduation:</td><td> <select name=graduation>");
		out.println("<option name=graduation value=B.E.>B.E.</option><option name=graduation value=B.Sc.>B.Sc.</option>");
		out.println("<option name=graduation value=B.Tech.>B.Tech.</option><option name=graduation value=B.Com.>B.Com.</option>");
		out.println("<option name=graduation value=B.A.>B.A.</option></td></tr>");
		out.println("<tr><td>Post Graduation:</td><td> <select name=postGraduation><option name=postGraduation value=None>None</option>");
		out.println("<option name=postGraduation value=M.E.>M.E.</option><option name=postGraduation value=M.Sc.>M.Sc.</option>");
		out.println("<option name=postGraduation value=M.Tech.>M.Tech.</option><option name=postGraduation value=PhD.>PhD.</option>");
		out.println("<option name=postGraduation value=M.Com.>M.Com.</option><option name=postGraduation value=M.A.>M.A.</option></td></tr>");
		out.println("<tr><td>Email ID:</td><td><input type=email name=emailId placeholder=Email></td></tr>");
		out.println("<tr><td>Age:</td><td><input type=number name=age max=25 min=01 placeholder=01></td></tr>");
		out.println("<tr><td>Address:</td><td><textarea rows=4 cols=50 name=address placeholder=Enter text here...></textarea></td></tr>");
		out.println("<tr><td>City:</td><td><input type=text name=city placeholder=City></td></tr>");
		out.println("<tr><td>Pincode:</td><td><input type=number name=pincode min=100001 max=999999 placeholder=123456></td></tr>");
		out.println("<tr><td>Country:</td><td><input type=text name=country placeholder=Country></td></tr>");
		out.println("<tr><td>Resume:</td><td><input type=file name=resume accept=pdf/*></td></tr></table>");
		out.println("<br><button type=submit value=Submit>Submit</button>");
		out.println("<button name=reset value=reset>Reset</button></form></div></body></html>");
	}

}
