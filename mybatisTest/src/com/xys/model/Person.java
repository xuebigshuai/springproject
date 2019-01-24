package com.xys.model;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int age;
	
	private String name;
	
	private double salary;
	
	private String birth;
	
	private String registerTime;
	
	private int  courseid;
	private Course course;

	
	public Person(int id, int age, String name, double salary, String birth, String registerTime, int courseid,
			Course course) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.birth = birth;
		this.registerTime = registerTime;
		this.courseid = courseid;
		this.course = course;
	}


	public Person(int id, int age, String name, double salary, String birth, String registerTime) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.birth = birth;
		this.registerTime = registerTime;
	}
	

	public Course getCourse() {
		return course;
	}


	public int getCourseid() {
		return courseid;
	}


	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	
	public Person() {
		super();
	}

	public Person(int age, String name, double salary, String birth, String registerTime) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.birth = birth;
		this.registerTime = registerTime;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + ", birth=" + birth
				+ ", registerTime=" + registerTime + ", courseid=" + courseid + ", course=" + course + "]";
	}
	
	
	
}
