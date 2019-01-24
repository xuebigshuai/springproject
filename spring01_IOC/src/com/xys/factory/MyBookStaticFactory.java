package com.xys.factory;

import com.xys.model.Book;

/**
 * 静态工厂法创建bean
 * @author xueyushuai
 *
 */
public class MyBookStaticFactory {
	
	
	public static Book getBook() {
		Book book=new Book();
		System.out.println("静态工厂法创建bean");
		return book;
	}

	public static Book getBook(String name) {
		Book book=new Book();
		book.setName(name);
		book.setPrice(9.8);
		return book;
	}
	
	public static Book getBook(double price) {
		Book book=new Book();
		book.setName("佚名");
		book.setPrice(price);
		return book;
	}

	
	public static Book getBook(String name,double price) {
		Book book=new Book();
		book.setName(name);
		book.setPrice(price);
		return book;
	}

}
