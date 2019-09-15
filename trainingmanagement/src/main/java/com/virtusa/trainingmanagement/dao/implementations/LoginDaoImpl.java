package com.virtusa.trainingmanagement.dao.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;


import com.virtusa.trainingmanagement.dao.interfaces.LoginDao;

import com.virtusa.trainingmanagement.helpers.OracleHelper;
import com.virtusa.trainingmanagement.models.Register;


public class LoginDaoImpl implements LoginDao<Register,String>
{
		
		private ResourceBundle rb;
		//instance block
		{
			rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
		}

	@Override
	public Collection<Register> getAll() 
	{
		String query=rb.getString("getallUsers");
		Collection<Register> users = new ArrayList<Register>();

		try(Connection con = OracleHelper.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query))
		{
			
			while(rs.next())
			{
			
					String empId = rs.getString(1);
					String name= rs.getString(2);
					String role=rs.getString(3);
					String emailId=rs.getString(4);
					String password=rs.getString(5);
					int phoneNo=rs.getInt(6);
					Register registereduser = new Register(empId, name,role,emailId,password,phoneNo);
					users.add(registereduser);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("In exception");
		}

		return users;
		
		
	}

	@Override
	public Register getByUser(String key) {
		// TODO Auto-generated method stub
		String sqlQuery = "select * from register where emailid =? ";
		Register register = null;
		try (Connection con = OracleHelper.getConnection();
				PreparedStatement pre_stmt = con.prepareStatement(sqlQuery))
		{

			pre_stmt.setString(1, key);
			pre_stmt.executeQuery();
			ResultSet rs = pre_stmt.executeQuery(sqlQuery);
			
			if (rs.next()) 
			{
				String empId = rs.getString(1);
				String name= rs.getString(2);
				String role=rs.getString(3);
				String emailId=rs.getString(4);
				String password=rs.getString(5);
				int phoneNo=rs.getInt(6);
				register = new Register(empId, name,role,emailId,password,phoneNo);
				
			}
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("in login dao");
			System.out.println(e);
		}
		
		return register;
	}
	
}


