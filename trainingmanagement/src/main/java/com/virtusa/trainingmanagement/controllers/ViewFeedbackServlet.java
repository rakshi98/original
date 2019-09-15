
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
import com.virtusa.trainingmanagement.dao.implementations.FeedbackDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.FeedbackDao;
import com.virtusa.trainingmanagement.models.Feedback;

/**
 * Servlet implementation class ViewFeedbackServlet
 */
@WebServlet("/ViewFeedbackServlet")
public class ViewFeedbackServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public ViewFeedbackServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		FeedbackDao feedbackDao=new FeedbackDaoImpl();
		
		List<Feedback> feedbackList;
		try 
		{
			feedbackList = feedbackDao.viewFeedback();
		//converting java object to java script object(json)
			response.getWriter().write(new Gson().toJson(feedbackList));
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
