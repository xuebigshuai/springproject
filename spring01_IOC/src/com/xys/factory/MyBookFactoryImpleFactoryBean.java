package com.xys.factory;

import org.springframework.beans.factory.FactoryBean;

import com.xys.model.Book;

/**
 * 实现factoryBeen的工厂类来创建对象
 * @author luoji
 *
 */
public class MyBookFactoryImpleFactoryBean implements FactoryBean<Book> {

	@Override
	public Book getObject() throws Exception {
		Book book=new Book();
		book.setName("佚名");
		book.setPrice(111);
		System.out.println("实现了FactoryBeen");
		return book;
	}

	@Override
	public Class<?> getObjectType() {
		return Book.class;
	}

	/**
	 * 控制创建的对象是不是单例
	 * 
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}

}
