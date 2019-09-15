package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApproveServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/ApproveServlet" })
public class ApproveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String empId=request.getParameter("empId");
		HttpSession session = request.getSession();
		session.setAttribute("status",true);
	}

}
