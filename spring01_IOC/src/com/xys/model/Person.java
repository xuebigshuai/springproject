package com.xys.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;


public class Person {

	private String name;
	
	private String  sex;
	
	private double salary;
	
	private List<Book> booklist;
	
	private Map<String,Object> map;
	
	//key=value  key和value都是字符集
	private Properties properties;

	public Person(String name, String sex, double salary, List<Book> booklist, Map<String, Object> map,
			Properties properties) {
		super();
		this.name = name;
		this.sex = sex;
		this.salary = salary;
		this.booklist = booklist;
		this.map = map;
		this.properties = properties;
	}

	public Person() {
		super();
	   System.out.println("初始化创建personBean");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Book> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", salary=" + salary + ", booklist=" + booklist + ", map="
				+ map + ", properties=" + properties + "]";
	}
	
	
	
	
}
