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
import com.virtusa.trainingmanagement.dao.implementations.RequestedtrainingDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.RequestedtrainingDao;
import com.virtusa.trainingmanagement.models.Requestedtraining;

/**
 * Servlet implementation class ViewRequestedTrainingServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/ViewRequestedTrainingServlet" })
public class ViewRequestedTrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRequestedTrainingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			// TODO Auto-generated method stub
			response.setContentType("text/html");
			RequestedtrainingDao empPosttrainingDao=new RequestedtrainingDaoImpl();
			
			List<Requestedtraining> viewrequestedList;
			try 
			{
				viewrequestedList = empPosttrainingDao.getAllRequestedTrainings();
			//converting java object to java script object(json)
				response.getWriter().write(new Gson().toJson(viewrequestedList));
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}

	}

