package com.vidvaan.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		System.out.println("Welcome Servlet Object created");
	}

	public void init(ServletConfig config) {
		System.out.println("Welcome Servlet is Initilized !");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("Hello...  ");
		System.out.println("Welcome Servlet service is executed...  ");
		pw.close();
	}

	public void destroy() {
		System.out.println("Welcome Servlet is distroed !");
	}
}
