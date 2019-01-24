package com.xys.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xys.service.BookService;
import com.xys.service.UserService;

class IocTest {

	ApplicationContext context=new ClassPathXmlApplicationContext("config/iocConfig.xml");
	@Test
	void test() {
		BookService bookService=(BookService) context.getBean("bookService");
		bookService.save();
		//UserService service=(UserService) context.getBean("userService");
		UserService bean = (UserService) context.getBean("userService");
		
		bean.save();
	}

}
