package com.virtusa.trainingmanagement.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.trainingmanagement.models.Nominate;

public interface NominateDao 
{
	boolean nominateForTraining(Nominate nominate) throws SQLException; //insert
	List<Nominate> getAllNominations() throws SQLException; //select all nominations
}
