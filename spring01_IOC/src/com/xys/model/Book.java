package com.xys.model;

public class Book {

	private String name;
	
	private double price;
	
	

	public Book() {
		super();
		System.out.println("创建book对象。。。。。。");
	}

	public void initBook() {
		System.out.println("初始化book时调用。。。。。");
	}
	public void destroyBook() {
		System.out.println("销毁book时调用。。。。。");
	}
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
	
}
