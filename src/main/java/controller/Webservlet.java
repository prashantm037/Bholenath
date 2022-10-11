package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Webservlet")
public class Webservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Webservlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<h2>");
	out.println("Hello");
	out.println("<h2>");
	out.println("<table>");
	out.println("<pre>");
	out.println("Name<input type='text'/>");
	out.println("</pre>");
	out.println("Email<input tye='text'/>");
	out.println("<input type='submit' value='save'/>");
	out.println("</table>");
	
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
