package com.virtusa.trainingmanagement.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.trainingmanagement.models.Training;

public interface TrainingDao 
{
	boolean addAdminScheduleTraining(Training adminScheduleTraining) throws SQLException; //insert
	List<Training> getAllTrainings() throws SQLException; //select all

}
