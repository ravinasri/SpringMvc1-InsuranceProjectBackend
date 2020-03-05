package com.kgisl.vehicleinsurance.dao;

import java.util.List;

import com.kgisl.vehicleinsurance.model.User;

public interface UserDao {

	public List<User> getAll();

	public Boolean add(final User u);

	public List<User> getById(int user_id);

}