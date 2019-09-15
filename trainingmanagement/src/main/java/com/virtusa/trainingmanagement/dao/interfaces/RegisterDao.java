package com.virtusa.trainingmanagement.dao.interfaces;

import java.sql.SQLException;

import com.virtusa.trainingmanagement.models.Register;


public interface RegisterDao 
{
	public boolean addDetails(Register register) throws SQLException; //insert
}
