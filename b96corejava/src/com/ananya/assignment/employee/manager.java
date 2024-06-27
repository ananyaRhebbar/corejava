package com.ananya.assignment.employee;

public class manager {
	
	private int noOfTeamMembers;
	private String projectName;

	public int getNoOfTeamMembers() {
		return noOfTeamMembers;
	}

	@Override
	public String toString() {
		return "manager [noOfTeamMembers=" + noOfTeamMembers + ", projectName=" + projectName + "]";
	}

	public void setNoOfTeamMembers(int noOfTeamMembers) {
		this.noOfTeamMembers = noOfTeamMembers;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
