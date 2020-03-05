package com.kgisl.vehicleinsurance.dao;

import java.util.List;

import com.kgisl.vehicleinsurance.model.Login;

public interface LoginDao {

//	public List<Login> getAll();

	public Boolean add(final Login l);

	public List<Login> getById(int user_id);
	
	public int getAll(Login log);

}
