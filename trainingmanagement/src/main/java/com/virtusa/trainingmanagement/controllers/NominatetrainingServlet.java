package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.virtusa.trainingmanagement.dao.implementations.NominateDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.NominateDao;
import com.virtusa.trainingmanagement.models.Nominate;


/**
 * Servlet implementation class NominatetrainingServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/NominatetrainingServlet" })
public class NominatetrainingServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		@SuppressWarnings("unused")
		String errorMessage = null;
		
		//read values from ajax call
		
		//model
		Nominate nominate=new Nominate();
		
		nominate.setEmpId(request.getParameter("empId"));
		nominate.setEmpName(request.getParameter("empName"));
		nominate.setTrainingId(request.getParameter("trainingId"));
		
		//call dao
		NominateDao nominateDao=new NominateDaoImpl();
		boolean status=false;
		
		try
		{
			status=nominateDao.nominateForTraining(nominate);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		System.out.println(status);
		
		if(status) {
			out.println("Training Added Succesfully");
		}
		else {
			out.println("Unsuccessfull");
		}
	}
}
