package com.kgisl.vehicleinsurance.model;

public class PolicyType {
	
	private String policy_type;

	public String getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}

	public PolicyType(String policy_type) {
		super();
		this.policy_type = policy_type;
	}

	public PolicyType() {
		super();
	}

	@Override
	public String toString() {
		return "PolicyType [policy_type=" + policy_type + "]";
	}
	
	

}
