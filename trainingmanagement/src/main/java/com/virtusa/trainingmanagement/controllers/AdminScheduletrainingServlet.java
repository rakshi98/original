package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.trainingmanagement.dao.implementations.TrainingDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.TrainingDao;
import com.virtusa.trainingmanagement.models.Training;

/**
 * Servlet implementation class AdminScheduletrainingServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/AdminScheduletrainingServlet" })
public class AdminScheduletrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		//read values from ajax call
		
		//model
		Training adminScheduletraining=new Training();
		
		adminScheduletraining.setTrainingId(request.getParameter("trainingId"));
		adminScheduletraining.setTrainingName(request.getParameter("trainingName"));
		adminScheduletraining.setDomain(request.getParameter("domain"));
		adminScheduletraining.setStartDate(LocalDate.parse(request.getParameter("startDate")));
		adminScheduletraining.setEndDate(LocalDate.parse(request.getParameter("endDate")));
		adminScheduletraining.setVenue(request.getParameter("venue"));
		
		
		//call dao
		TrainingDao adminScheduleTrainingDao=new TrainingDaoImpl();
		boolean status=false;
		
		@SuppressWarnings("unused")
		String errorMessage = null;
		try
		{
			status=adminScheduleTrainingDao.addAdminScheduleTraining(adminScheduletraining);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		System.out.println(status);
		
		if(status) 
		{
			out.println("Training Added Succesfully");
		}
		else 
		{
			out.println("Unsuccessfull");
		}
	}
}


