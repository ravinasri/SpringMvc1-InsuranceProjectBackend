package com.kgisl.vehicleinsurance.model;

public class PolicyPlan {
	
	private String policy_plan;

	public String getPolicy_plan() {
		return policy_plan;
	}

	public void setPolicy_plan(String policy_plan) {
		this.policy_plan = policy_plan;
	}

	public PolicyPlan(String policy_plan) {
		super();
		this.policy_plan = policy_plan;
	}

	public PolicyPlan() {
		super();
	}

	@Override
	public String toString() {
		return "PolicyPlan [policy_plan=" + policy_plan + "]";
	}
	
	

}
