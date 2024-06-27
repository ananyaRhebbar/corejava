package com.ananya.assignment.utilites;

import com.ananya.assignment.employee.*;

public class AssignmentMain {
	
	public class EmployeeUtilities {
		
		public void Developer(int employeeId, String employeeName, double employeeSalary, String language, int experience) {		
		developer d1 = new developer();
		//d1.setName(employeeName);
		//d1.setEmployeeId(employeeId);
		//d1.setSalary(employeeSalary);
		d1.setLanguage(language);
		d1.setExperience(experience);
		System.out.println(d1);
	 }
		public void Manager(int employeeId, String employeeName, double employeeSalary,int noOfTeamMaembers, String projectName ) {
			manager m1 = new manager();
			//m1.setName(employeeName);
			//m1.setEmployeeId(employeeId);
			//m1.setSalary(employeeSalary);
			m1.setNoOfTeamMembers(noOfTeamMaembers);
			m1.setProjectName(projectName);
			System.out.println(m1);
		}

	}

}
