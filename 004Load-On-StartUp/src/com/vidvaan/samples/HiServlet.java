package com.vidvaan.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiServlet
 */
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HiServlet() {
		System.out.println("Hi Servlet Object created");
	}

	public void init(ServletConfig config) {
		System.out.println("Hi Servlet is Initilized !");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("Hi...  ");
		System.out.println("Hi Servlet service is executed...  ");
		pw.close();
	}

	public void destroy() {
		System.out.println("Hi Servlet is distroed !");
	}
}
