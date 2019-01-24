package com.xys.factory;

import com.xys.model.Book;

/**
 * 通过实例工厂法创建
 * @author luoji
 *
 */
public class MyBookInstaceFactory {
	
	public Book getBook() {
		
		return new Book();
		
	}
	
   public Book getBook(String name) {
	     Book book=new Book();
	     book.setName(name);
		return book ;
		
	}

}
