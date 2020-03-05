package com.kgisl.vehicleinsurance.dao;

import java.util.List;

import com.kgisl.vehicleinsurance.model.Policy;
import com.kgisl.vehicleinsurance.model.PolicyPlan;
import com.kgisl.vehicleinsurance.model.PolicyType;

public interface PolicyDao {

	public List<Policy> getAll();

	public Boolean add(final Policy p);

	public List<Policy> getById(int user_id);
	
	public List<Policy> getAllById(int user_id);
	

	public List<PolicyType> getType();
	
	public List<PolicyPlan> getPlan();

	

}