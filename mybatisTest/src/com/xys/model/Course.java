package com.xys.model;

public class Course {

	private int id;
	
	private int courseid;
	
	private String name;
	
	private double score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseid=" + courseid + ", name=" + name + ", score=" + score + "]";
	}
	
	
	
}
