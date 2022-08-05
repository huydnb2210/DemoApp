package com.huy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException{
		HttpSession session = rq.getSession();
		
		int k = (int) session.getAttribute("k");
		PrintWriter out = rs.getWriter();
		k = k * k;
		out.print("Result is: " + k);
		
		System.out.println("sq called");
	}
}
