package com.cg.payroll.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrintData")
public class PrintDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body><div align='center'>"+
				"<h2 style='color:powderblue;'>Salary Details</h2>"+
				"<form name='Salary' action='#' method='post'><table>"+
				"<tr><td>Basic Salary: </td><td><input type='number' name='basicSalary' required></td></tr>"+
				"<tr><td>HRA: </td><td><input type='number' name='hra' required></td></tr>"+
				"<tr><td>EPF: </td><td><input type='number' name='epf' required></td></tr>"+
				"</table><br><button type='submit' name='next'>Next</button>"+
				"<button type='reset' name='reset'>Reset</button></form></div></body></html>"); 
	}

}
