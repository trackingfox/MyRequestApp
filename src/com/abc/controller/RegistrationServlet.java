package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String userage = request.getParameter("userage");
		String useremail = request.getParameter("useremail");
		String userphone = request.getParameter("userphone");

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h1 style='color:red; text-align:center;'>Aradhya Brilliance Center</h1>");
		out.println("<h2 style='color:blue; text-align:center;'>Student Details</h2>");
		out.println("<table border='1' align='center' bgcolor='cyan'>");

		out.println("<tr>");
		out.println("<td>USERNAME</td>");
		out.println("<td>" + username + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>USERAGE</td>");
		out.println("<td>" + userage + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>USEREMAIL</td>");
		out.println("<td>" + useremail + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>USERPHONE</td>");
		out.println("<td>" + userphone + "</td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</body></html>");

		out.close();
	
	}

}
