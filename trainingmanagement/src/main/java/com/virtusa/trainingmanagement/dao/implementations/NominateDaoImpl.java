
package com.virtusa.trainingmanagement.dao.implementations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.virtusa.trainingmanagement.dao.interfaces.NominateDao;
import com.virtusa.trainingmanagement.helpers.OracleHelper;
import com.virtusa.trainingmanagement.models.Nominate;

public class NominateDaoImpl implements NominateDao
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
	
	@Override
	public boolean nominateForTraining(Nominate nominate) throws SQLException 
	{
		try
		{
			conn=OracleHelper.getConnection();
			conn.setAutoCommit(false);
			callable=conn.prepareCall("{call addNominate(?,?,?)}");
			callable.setString(1, nominate.getEmpId());
			callable.setString(2, nominate.getEmpName());
			callable.setString(3, nominate.getTrainingId());
		
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
	public List<Nominate> getAllNominations() throws SQLException 
	{
		List<Nominate> nominationsList=new ArrayList<Nominate>();
		Nominate nominations=null;
		conn=OracleHelper.getConnection();
		String query=rb.getString("getallNominations");
		try
		{
			statment=conn.createStatement();
			resultSet=statment.executeQuery(query);
			while(resultSet.next())
			{
				nominations=new Nominate();
				nominations.setEmpId(resultSet.getString(1));
				nominations.setEmpName(resultSet.getString(2));
				nominations.setTrainingId(resultSet.getString(3));
				nominationsList.add(nominations);
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
		
		return nominationsList;
	}
	

}
