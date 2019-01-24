package com.xys.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class IocTest2 {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("config/icoConfig.xml");
	
	@Test
	void test() throws SQLException {
		DataSource datasource=context.getBean(DataSource.class);
		Connection connection=datasource.getConnection();
		System.out.println(connection);
	}

}
