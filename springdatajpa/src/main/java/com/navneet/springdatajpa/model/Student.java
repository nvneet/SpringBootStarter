package com.navneet.springdatajpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long id;
	private String name;
	private int testScore;
	
	public Student() {
		// org.springframework.orm.jpa.JpaSystemException: No default constructor
		// for entity:  : com.navneet.springdatajpa.model.Student; 
		// nested exception is org.hibernate.InstantiationException: No default 
		// constructor for entity:  : com.navneet.springdatajpa.model.Student
	}
	
	public Student(long id, String name, int testScore) {
		this.id = id;
		this.name = name;
		this.testScore = testScore;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
}
