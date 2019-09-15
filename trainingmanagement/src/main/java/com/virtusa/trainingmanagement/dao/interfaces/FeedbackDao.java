package com.virtusa.trainingmanagement.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.trainingmanagement.models.Feedback;

public interface FeedbackDao 
{
	public boolean feedback(Feedback empfeedback) throws SQLException;//insert
	List<Feedback> viewFeedback() throws SQLException; //view
}
