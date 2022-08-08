package com.huy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException{
		int k = 0;
		Cookie cookies[] = rq.getCookies();
		
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
//		HttpSession session = rq.getSession(); //HttpSession
//		
//		int k = (int) session.getAttribute("k");
		k = k * k;
		PrintWriter out = rs.getWriter();
		
		out.print("Result is: " + k);
		
		System.out.println("sq called");
	}
}
