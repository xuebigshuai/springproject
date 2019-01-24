package com.xys.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xys.service.MatherCalculate;

class AopTest {
	ApplicationContext context= new ClassPathXmlApplicationContext("config/ioc.xml");

	@Test
	void test() {
		MatherCalculate calculate=context.getBean(MatherCalculate.class);
		calculate.add(1, 2);
		calculate.div(1, 0);
		System.out.println(calculate.getClass());
	}

}
