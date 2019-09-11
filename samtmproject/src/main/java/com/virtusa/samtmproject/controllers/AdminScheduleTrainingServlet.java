

package com.virtusa.samtmproject.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.samtmproject.dao.implementations.AdminScheduleTrainingImpl;
import com.virtusa.samtmproject.dao.interfaces.AdminScheduleTrainingDao;
import com.virtusa.samtmproject.models.AdminScheduleTraining;

/**
 * Servlet implementation class AdminScheduleTrainingServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/AdminScheduleTrainingServlet" })
public class AdminScheduleTrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminScheduleTrainingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		//read values from ajax call
		
		//model
		AdminScheduleTraining adminScheduleTraining=new AdminScheduleTraining();
		
		adminScheduleTraining.setTrainingId(request.getParameter("trainingId"));
		adminScheduleTraining.setTrainingName(request.getParameter("trainingName"));
		adminScheduleTraining.setDomain(request.getParameter("domain"));
		adminScheduleTraining.setStartDate(LocalDate.parse(request.getParameter("startDate")));
		adminScheduleTraining.setEndDate(LocalDate.parse(request.getParameter("endDate")));
		adminScheduleTraining.setVenue(request.getParameter("venue"));
		
		
		//call dao
		AdminScheduleTrainingDao adminScheduleTrainingDao=new AdminScheduleTrainingImpl();
		boolean status=false;
		String errorMessage = null;
		try
		{
			status=adminScheduleTrainingDao.addAdminScheduleTraining(adminScheduleTraining);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		if(status)
			out.println("training Added Sucessfully");
		else
			out.println("Error occurred,"+errorMessage);
		
	
	}
	


}

