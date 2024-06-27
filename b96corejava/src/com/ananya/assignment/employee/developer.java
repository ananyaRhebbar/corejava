package com.ananya.assignment.employee;

public class developer {
	
	private String language;
	private int experience;

	public String getLanguage() {
		return language;
	}

	@Override
	public String toString() {
		return "developer [language=" + language + ", experience=" + experience + "]";
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
