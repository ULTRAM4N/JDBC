package com.SpringRest.SpringRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	private String title;
	private String description;
	
	// Constructor
	public Course(long id, String title, String description) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// default constructor
	public Course() {
		super();
	}
	
}
