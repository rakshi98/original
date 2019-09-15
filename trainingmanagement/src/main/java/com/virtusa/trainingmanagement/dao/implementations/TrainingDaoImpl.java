package com.virtusa.trainingmanagement.dao.implementations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.virtusa.trainingmanagement.dao.interfaces.TrainingDao;
import com.virtusa.trainingmanagement.helpers.OracleHelper;
import com.virtusa.trainingmanagement.models.Training;

public class TrainingDaoImpl implements TrainingDao
{
	private Connection conn;
	private CallableStatement callable;
	private int result;
	private boolean status;
	
	private ResourceBundle rb;

	private ResultSet resultSet;
	private Statement statement;
	
	//instance block
	{
		rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
	}
	

	@Override
	public boolean addAdminScheduleTraining(Training adminScheduleTraining) throws SQLException 
	{
		
		try{
			
			conn=OracleHelper.getConnection();
			conn.setAutoCommit(false);
			callable=conn.prepareCall("{call scheduleTrainingProcedure(?,?,?,?,?,?)}");
			callable.setString(1, adminScheduleTraining.getTrainingId());
			callable.setString(2, adminScheduleTraining.getTrainingName());
			callable.setString(3, adminScheduleTraining.getDomain());
			callable.setDate(4,Date.valueOf(adminScheduleTraining.getStartDate()));
			callable.setDate(5, Date.valueOf((adminScheduleTraining).getEndDate()));
			callable.setString(6, adminScheduleTraining.getVenue());
		
			
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
	public List<Training> getAllTrainings() throws SQLException {
		List<Training> trainingList=new ArrayList<Training>();
		Training adminScheduleTraining=null;
		conn=OracleHelper.getConnection();
		String query=rb.getString("getallTraining");
		try
		{
			statement=conn.createStatement();
			resultSet=statement.executeQuery(query);
			while(resultSet.next())
			{
				adminScheduleTraining=new Training();
				
				adminScheduleTraining.setTrainingId(resultSet.getString(1));
				adminScheduleTraining.setTrainingName(resultSet.getString(2));
				adminScheduleTraining.setDomain(resultSet.getString(3));
				adminScheduleTraining.setStartDate(resultSet.getDate(4).toLocalDate());
				adminScheduleTraining.setEndDate(resultSet.getDate(5).toLocalDate());
				adminScheduleTraining.setVenue(resultSet.getString(6));
				trainingList.add(adminScheduleTraining);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			conn.close();
		}
		
		return trainingList;
	
	}
}
