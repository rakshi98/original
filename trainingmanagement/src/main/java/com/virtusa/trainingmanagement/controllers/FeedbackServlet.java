package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.trainingmanagement.dao.implementations.FeedbackDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.FeedbackDao;
import com.virtusa.trainingmanagement.models.Feedback;

/**
 * Servlet implementation class EmpFeedbackServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/EmpFeedbackServlet" })

public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		//read values from ajax call
		
		//model
		Feedback empfeedback=new Feedback();
		empfeedback.setEmpId(request.getParameter("empId"));
		empfeedback.setEmpName(request.getParameter("empName"));
		empfeedback.setTrainingName(request.getParameter("trainingName"));
		empfeedback.setComments(request.getParameter("comments"));
		//call dao
		FeedbackDao empfeedbackDao=new FeedbackDaoImpl();
		boolean status=false;
		String errorMessage = null;
		try
		{
			status=empfeedbackDao.feedback(empfeedback);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		System.out.println(status);
		if(status)
			out.println("Posted Successfully");
		else
			out.println("Error occurred,"+errorMessage);
		
	}

	}


