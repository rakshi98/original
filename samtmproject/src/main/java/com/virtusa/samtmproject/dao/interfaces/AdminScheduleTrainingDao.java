package com.virtusa.samtmproject.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.samtmproject.models.AdminScheduleTraining;

public interface AdminScheduleTrainingDao {
	boolean addAdminScheduleTraining(AdminScheduleTraining adminScheduleTraining) throws SQLException; //insert
	List<AdminScheduleTraining> getAllTrainigns() throws SQLException; //select all


}
