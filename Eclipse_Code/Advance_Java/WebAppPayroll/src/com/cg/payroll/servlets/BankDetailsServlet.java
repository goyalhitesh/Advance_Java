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
		PrintWriter out = response.getWriter();
		out.print("<html><body><div align='center'>"+"<p>Hey</p>"+
				"<form name='BankDetails' action='Salary' method='post'>"+
				"<table bgcolor=Slateblue><tr>"+
				"<td>Bank Name:</td><td><select name=bankName>"+
				"<option name=bankName value=State Bank of India>State Bank of India</option>"+
				"<option name=bankName value=Punjab National Bank>Punjab National Bank</option>"+
				"<option name=bankName value=HDFC Bank>HDFC Bank</option>"+
				"<option name=bankName value=ICICI Bank>ICICI Bank</option>"+
				"<option name=bankName value=Axis Bank>Axis Bank</option>"+
				"<option name=bankName value=Standard Chartered>Standard Chartered</option>"+
				"<option name=bankName value=Citi Bank>Citi Bank</option>"+
				"<option name=bankName value=Central Bank of India>Central Bank of India</option>"+
				"</select></td></tr><tr><td>Account Number:</td>"+
				"<td><input type=number name=accountNumber minlength=10  maxlength=20 required></td></tr><tr>"+
				"<td>Bank IFSC Code:</td><td><input type=text name=ifscCode pattern=([A-Z]{4}[A-Z0-9]{7}) placeholder=ABCDE123456 required></td>"+
				"</tr></table><br><button type=submit name=next>Next</button>"+
				"<button type=reset name=reset>Reset</button></form>"+
				"</div></body></html>");
	}

}
