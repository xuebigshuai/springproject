package com.xys.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xys.model.Book;

class IocTest1 {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("config/ioc.xml");

	@Test
	void test() {
		Object book=context.getBean("book2");
		System.out.println(book);
		Object book11=context.getBean("book2");
		System.out.println(book==book11);
		Object book1=context.getBean("book3");
		System.out.println(book1);
		Object book2=context.getBean("book4");
		System.out.println(book2);
		Book book3=(Book) context.getBean("book5");
		book3.setName("《哈哈哈，十年少》");
		System.out.println(book3);
		Object book4=context.getBean("book6");
		System.out.println(book4);
	}
	
	@Test
	void test1() {
        //FactoryBean接口实现类工厂只有在获取bean的时候创建		
		Object book=context.getBean("book7");
		System.out.println(book);
		Object book1=context.getBean("book7");
		System.out.println(book1==book);
	
	}
	
	@Test
	void test2() {
        //FactoryBean接口实现类工厂只有在获取bean的时候创建		
		Object book=context.getBean("book8");
		System.out.println(book);
		Object book1=context.getBean("book8");
		System.out.println(book1==book);
		AbstractApplicationContext con=(AbstractApplicationContext) context;
		con.close();
	
	}

}
