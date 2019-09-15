package com.virtusa.trainingmanagement.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.trainingmanagement.models.Requestedtraining;

public interface RequestedtrainingDao 
{
	public boolean postTraining(Requestedtraining empposttraining) throws SQLException;
	List<Requestedtraining> getAllRequestedTrainings() throws SQLException;
}
