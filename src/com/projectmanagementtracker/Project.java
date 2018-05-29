package com.projectmanagementtracker;

import java.util.List;

public class Project {
	private String name;
	private String manager;
	private List<String> releases;
	public Project(String name, String manager, List<String> releases) {
		super();
		this.name = name;
		this.manager = manager;
		this.releases = releases;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public List<String> getReleases() {
		return releases;
	}
	public void setReleases(List<String> releases) {
		this.releases = releases;
	}
	
	
}
