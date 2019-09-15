package com.virtusa.trainingmanagement.dao.interfaces;

//import java.sql.SQLException;
import java.util.Collection;

//import com.virtusa.trainingmanagement.models.Login;

public interface LoginDao<T,K> 
{
	/*
	 * public boolean addDetails(Login login) throws SQLException; //insert public
	 * Login getByUser(String emailId);
	 */
	Collection<T> getAll();
	T getByUser(K key);
}
