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
import com.virtusa.trainingmanagement.dao.implementations.NominateDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.NominateDao;
import com.virtusa.trainingmanagement.models.Nominate;

/**
 * Servlet implementation class ViewNominationsServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/ViewNominationsServlet" })
public class ViewNominationsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		NominateDao nominateDao=new NominateDaoImpl();
		
		List<Nominate> nominateList;
		try 
		{
			nominateList = nominateDao.getAllNominations();
		//converting java object to java script object(json)
			response.getWriter().write(new Gson().toJson(nominateList));
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
