package com.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet
{

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("I'm in register service method..........");
	}
}
