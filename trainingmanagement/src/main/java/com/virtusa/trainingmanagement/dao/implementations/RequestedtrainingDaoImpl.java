package com.virtusa.trainingmanagement.dao.implementations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.virtusa.trainingmanagement.dao.interfaces.RequestedtrainingDao;
import com.virtusa.trainingmanagement.helpers.OracleHelper;
import com.virtusa.trainingmanagement.models.Requestedtraining;

public class RequestedtrainingDaoImpl implements RequestedtrainingDao
{

	private Connection conn;
	private CallableStatement callable;
	private Statement statement;
	private int result;
	private boolean status;
	private ResourceBundle rb;
	private ResultSet resultSet;
		
		//instance block
		{
			rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
		}
		//request for interested training
		@Override
		public boolean postTraining(Requestedtraining empposttraining) throws SQLException {
			// TODO Auto-generated method stub
			try
			{
				conn=OracleHelper.getConnection();
				conn.setAutoCommit(false);
				callable=conn.prepareCall("{call empaddtraining(?,?,?,?,?)}");
				callable.setString(1, empposttraining.getEmpId());
				callable.setString(2,empposttraining.getFullName() );
				callable.setString(3, empposttraining.getEmailId());
				callable.setString(4, empposttraining.getTrainingName());
				callable.setInt(5, empposttraining.getPhoneNumber());
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
		
		//admin will view employee requested trainings
		@Override
		public List<Requestedtraining> getAllRequestedTrainings() throws SQLException {
			List<Requestedtraining> requestedTrainingList=new ArrayList<Requestedtraining>();
			Requestedtraining requestedTraining=null;
			conn=OracleHelper.getConnection();
			String query=rb.getString("getAllRequestedTrainings");
			try
			{
				statement=conn.createStatement();
				resultSet=statement.executeQuery(query);
				while(resultSet.next())
				{
					requestedTraining=new Requestedtraining ();
					
					requestedTraining.setEmpId(resultSet.getString(1));
					requestedTraining.setFullName(resultSet.getString(2));
					requestedTraining.setEmailId(resultSet.getString(3));
					requestedTraining.setTrainingName(resultSet.getString(4));
					requestedTraining.setPhoneNumber(resultSet.getInt(5));
					requestedTrainingList.add(requestedTraining);
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally{
				conn.close();
			}
			
			return requestedTrainingList;
		}
		
		
		
	}



		
		

