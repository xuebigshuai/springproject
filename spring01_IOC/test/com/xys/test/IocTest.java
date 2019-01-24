package com.xys.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xys.model.Book;
import com.xys.model.Person;

class IocTest {

	/**
	 * 获取IOC容器
	 */
	ApplicationContext  context=new ClassPathXmlApplicationContext("config/ioc.xml"); 

	
	@Test
	void test() {
		Person person=context.getBean(Person.class);
		System.out.println(person);
	}
	@Test
	void test2() {
		Person person=(Person) context.getBean("person2");
		System.out.println(person);
	}
	@Test
	void test3() {
		Book book=(Book)context.getBean("book1");
		book.setName("东游记");
		Person person=(Person) context.getBean("person2");
		System.out.println(person);
		
	}
	@Test
	void test4() {
		@SuppressWarnings("unused")
		Book book=(Book)context.getBean("book1");
		//book.setName("东游记");
		Person person=(Person) context.getBean("person3");
		System.out.println(person);
		 @SuppressWarnings("unchecked")
		List<Book> booklist=(List<Book>) context.getBean("mylist");
		System.out.println(booklist);
		System.out.println(booklist.getClass());
		
		
		@SuppressWarnings("unchecked")
		Map<String,Object> map=(Map<String, Object>) context.getBean("mymap");
		System.out.println(map);
		System.out.println(map.getClass());
		
	}

}
