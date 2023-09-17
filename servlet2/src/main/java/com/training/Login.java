package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		PrintWriter out = res.getWriter();
		out.print("Hello Kundan!");
		System.out.println("I'm in service method...........");
	}
}
