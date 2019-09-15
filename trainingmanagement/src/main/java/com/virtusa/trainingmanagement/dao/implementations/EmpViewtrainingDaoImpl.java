package com.virtusa.trainingmanagement.dao.implementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.virtusa.trainingmanagement.dao.interfaces.EmpViewtrainingDao;
import com.virtusa.trainingmanagement.helpers.OracleHelper;
import com.virtusa.trainingmanagement.models.Training;


public class EmpViewtrainingDaoImpl implements EmpViewtrainingDao
{
	
	private Connection conn;
	private ResourceBundle rb;
	private Statement statment;
	private ResultSet resultSet;
	
	//instance block
	{
		rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
	}

	@Override
	public List<Training> getAllTraining() throws SQLException {
		// TODO Auto-generated method stub
		List<Training> trainingList=new ArrayList<Training>();
		Training adminScheduledtraining=null;
		conn=OracleHelper.getConnection();
		String query=rb.getString("getallTraining");
		try
		{
			statment=conn.createStatement();
			resultSet=statment.executeQuery(query);
			while(resultSet.next())
			{
				adminScheduledtraining=new Training();
				adminScheduledtraining.setTrainingId(resultSet.getString(1));
				adminScheduledtraining.setTrainingName(resultSet.getString(2));
				adminScheduledtraining.setDomain(resultSet.getString(3));
				adminScheduledtraining.setStartDate(resultSet.getDate(4).toLocalDate());
				adminScheduledtraining.setEndDate(resultSet.getDate(5).toLocalDate());
				adminScheduledtraining.setVenue(resultSet.getString(6));
				trainingList.add(adminScheduledtraining);
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
