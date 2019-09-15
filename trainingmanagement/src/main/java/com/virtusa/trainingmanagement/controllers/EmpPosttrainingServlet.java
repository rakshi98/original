package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.trainingmanagement.dao.implementations.RequestedtrainingDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.RequestedtrainingDao;
import com.virtusa.trainingmanagement.models.Requestedtraining;

/**
 * Servlet implementation class Emp_posttraining
 */
@WebServlet("/EmpPosttrainingServlet")
public class EmpPosttrainingServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		//read values from ajax call
		
		//model
		Requestedtraining empposttraining=new Requestedtraining();
		empposttraining.setEmpId(request.getParameter("empId"));
		empposttraining.setFullName(request.getParameter("fullName"));
		empposttraining.setEmailId(request.getParameter("emailId"));
		System.out.println(request.getParameter("emailId"));
		empposttraining.setTrainingName(request.getParameter("trainingName"));
		empposttraining.setPhoneNumber(Integer.parseInt(request.getParameter("phoneNumber")));
		
		//call dao
		RequestedtrainingDao empposttrainingDao=new RequestedtrainingDaoImpl();
		boolean status=false;
		String errorMessage = null;
		try
		{
			status=empposttrainingDao.postTraining(empposttraining);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		if(status)
			out.println("Posted Successfully");
		else
			out.println("Error occurred,"+errorMessage);
		
	}
}
