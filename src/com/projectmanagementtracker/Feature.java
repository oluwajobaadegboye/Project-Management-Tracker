package com.projectmanagementtracker;

import java.util.Date;

public class Feature {
	private String name;
	private String description;
	private String sprintName;
	private Date releaseDate;
	private String developer;
	public Feature(String name, String description, String sprintName, Date releaseDate, String developer) {
		super();
		this.name = name;
		this.description = description;
		this.sprintName = sprintName;
		this.releaseDate = releaseDate;
		this.developer = developer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSprintName() {
		return sprintName;
	}
	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
}
