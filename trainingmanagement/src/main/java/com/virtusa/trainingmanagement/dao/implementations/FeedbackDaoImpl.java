package com.virtusa.trainingmanagement.dao.implementations;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.virtusa.trainingmanagement.helpers.OracleHelper;
import com.virtusa.trainingmanagement.models.Feedback;

public class FeedbackDaoImpl implements com.virtusa.trainingmanagement.dao.interfaces.FeedbackDao
{
	private Connection conn;
	private CallableStatement callable;
	private Statement statment;
	private int result;
	private boolean status;
	private ResourceBundle rb;
	private ResultSet resultSet;
	
	//instance block
	{
		rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
	}

	public boolean feedback(Feedback empfeedback) throws SQLException {
		// TODO Auto-generated method stub
		try
		{
			conn=OracleHelper.getConnection();
			conn.setAutoCommit(false);
			callable=conn.prepareCall("{call addFeedback(?,?,?,?)}");
			callable.setString(1, empfeedback.getEmpId());
			callable.setString(2,empfeedback.getEmpName() );
			callable.setString(3, empfeedback.getTrainingName());
			callable.setString(4, empfeedback.getComments());
			
			result = callable.executeUpdate();
			if(result>0)
			{
				status=true;
			}
			
			conn.commit();
		}
		catch(SQLException e){
			conn.rollback();
		}
		finally{
			conn.close();
		}
		return status;
	}

	@Override
	public List<Feedback> viewFeedback() throws SQLException 
	{
		
		List<Feedback> feedbackList=new ArrayList<Feedback>();
		Feedback feedback=null;
		conn=OracleHelper.getConnection();
		String query=rb.getString("getallfeedback");
		try
		{
			statment=conn.createStatement();
			resultSet=statment.executeQuery(query);
			while(resultSet.next())
			{
				feedback=new Feedback();
				feedback.setEmpId(resultSet.getString(1));
				feedback.setEmpName((resultSet.getString(2)));
				feedback.setTrainingName(resultSet.getString(3));
				feedback.setComments(resultSet.getString(4));
				
				feedbackList.add(feedback);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			conn.close();
		}
			conn.close();
		
		return feedbackList;
	}
			
}
