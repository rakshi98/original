package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.gson.Gson;
import com.virtusa.trainingmanagement.dao.implementations.TrainingDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.TrainingDao;
import com.virtusa.trainingmanagement.models.Training;

/**
 * Servlet implementation class EmpApplytraining
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/EmpViewtrainingServlet" })
public class EmpViewtrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpViewtrainingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		TrainingDao trainingDao=new TrainingDaoImpl();
		try
		{
			List<Training> trainingList=trainingDao.getAllTrainings();
			//converting java object to java script object(json)
			response.getWriter().write(new Gson().toJson(trainingList));
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
