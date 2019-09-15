package com.virtusa.trainingmanagement.dao.implementations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.virtusa.trainingmanagement.dao.interfaces.RegisterDao;

import com.virtusa.trainingmanagement.helpers.OracleHelper;
import com.virtusa.trainingmanagement.models.Register;
public class RegisterDaoImpl implements RegisterDao
{
		private Connection conn;
		private CallableStatement callable;
		private int result;
		private boolean status;
		private ResourceBundle rb;
	
		//instance block
		{
			rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
		}
		
	 	@Override
		public boolean addDetails(Register register) throws SQLException
		{
			// TODO Auto-generated method stub
			
			try
			{
				conn=OracleHelper.getConnection();
				conn.setAutoCommit(false);
				callable=conn.prepareCall("{call addRegister(?,?,?,?,?,?)}");
				callable.setString(1, register.getEmpId());
				callable.setString(2, register.getName());
				callable.setString(3, register.getRole());
				callable.setString(4, register.getEmaiId());
				callable.setString(5, register.getPassword());
			   callable.setInt(6, register.getPhoneNo());
				result = callable.executeUpdate();
				if(result>0)
					status=true;
				
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
	}


