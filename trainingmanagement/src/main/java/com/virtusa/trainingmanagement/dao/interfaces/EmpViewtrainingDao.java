package com.virtusa.trainingmanagement.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.trainingmanagement.models.Training;




public interface EmpViewtrainingDao 
{
	List<Training> getAllTraining() throws SQLException; //select all

}
