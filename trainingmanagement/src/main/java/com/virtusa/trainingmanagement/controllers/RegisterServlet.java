package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.trainingmanagement.dao.implementations.RegisterDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.RegisterDao;
import com.virtusa.trainingmanagement.models.Register;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/RegisterServlet" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		System.out.println("hello");
		
		//read values from ajax call
		String empId=request.getParameter("empId");
		String name=request.getParameter("name");
		String role=request.getParameter("role");
		String emailId=request.getParameter("email");
		String password=request.getParameter("password");
		int phoneNo=Integer.parseInt(request.getParameter("phoneNo"));
		//model
		Register register=new Register(empId,name,role,emailId,password,phoneNo);
		register.setEmailId(empId);
		register.setName(name);
		register.setRole(role);
		register.setEmailId(emailId);
		register.setPassword(password);
		register.setPhoneNo(phoneNo);
		
		//call dao
		RegisterDao registerDao=new RegisterDaoImpl();
		boolean status=false;
		String errorMessage = null;
		try
		{
			status=registerDao.addDetails(register);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		if(status)
		{
			out.println("Successfully registered click on login");
			response.sendRedirect("/Trainingmanagement/views/Login.jsp");
		}
		else
			out.println("Error occurred,"+errorMessage);
		
	}

}
