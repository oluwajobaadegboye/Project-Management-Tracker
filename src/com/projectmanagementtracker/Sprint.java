package com.projectmanagementtracker;

import java.util.Date;
import java.util.List;

public class Sprint {
	private String name;
	private Date dueDate;
	private List<Feature> feature;
	public Sprint(String name, Date dueDate, List<Feature> feature) {
		super();
		this.name = name;
		this.dueDate = dueDate;
		this.feature = feature;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public List<Feature> getFeature() {
		return feature;
	}
	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}
	
}
