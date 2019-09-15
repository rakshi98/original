package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.trainingmanagement.dao.implementations.LoginDaoImpl;
import com.virtusa.trainingmanagement.dao.interfaces.LoginDao;
import com.virtusa.trainingmanagement.models.Register;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher=null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		  String emailId = request.getParameter("emailId"); 
		  String password = request.getParameter("password");
		 

		  LoginDao<Register,String> loginDao = new LoginDaoImpl();
			
			Register register = loginDao.getByUser(emailId);
			
			if(register==null)
			{
				out.println("<div class=\"prompt\"><h6>Username does not exist...Try Again</h6></div>");
				System.out.println("Failed");
			}
			else if(emailId.equals(register.getEmailId())&&password.equals(register.getPassword()))
			{
				if("admin".equals(register.getRole()))
				{
					HttpSession session = request.getSession();
					session.setAttribute("name", emailId);
					response.sendRedirect("/Trainingmanagement/views/adminhome.jsp");
			    }
				else if("employee".equals(register.getRole()))
				{
					HttpSession session = request.getSession();
					session.setAttribute("name", emailId);
					response.sendRedirect("/Trainingmanagement/views/emphome.jsp");
				}
				else 
				{
					HttpSession session = request.getSession();
					session.setAttribute("name", emailId);
					response.sendRedirect("/Trainingmanagement/views/projectmanagerhome.jsp");
				
				}
			}
			else
			{
				out.println("<div class=\"prompt\"><h5>Access Denied...Try Again</h5></div>");
			}
			out.close(); 
	}  
}

