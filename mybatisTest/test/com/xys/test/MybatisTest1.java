package com.xys.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xys.dao.PersonDao;
import com.xys.model.Person;

public class MybatisTest1 {
	
	private SqlSessionFactory sqlsessionFactory=null;

	@Test
	public void test() {
		SqlSession sqlseeion= sqlsessionFactory.openSession();
		PersonDao person=sqlseeion.getMapper(PersonDao.class);
		List<Person> list= person.getInfo(null);
		System.out.println(list);
		sqlseeion.close();
	}
	@Test
	public void test1() {
		SqlSession sqlseeion= sqlsessionFactory.openSession();
		PersonDao person=sqlseeion.getMapper(PersonDao.class);
	    Map<Integer,Person> list= person.getInfo1();
	    for(int i=0;i<=list.size();i++) {
	    	System.out.println(list.get(i));
	    }
		for (Entry<Integer,Person> mapw : list.entrySet()) {
			int a=mapw.getKey();
			System.out.println("key="+mapw.getKey()+";value="+mapw.getValue());
		}
		
		sqlseeion.commit();
		sqlseeion.close();
		
	}
	
	@Test
	public void test2() {
		SqlSession sqlseeion= sqlsessionFactory.openSession();
		PersonDao person=sqlseeion.getMapper(PersonDao.class);
	    Map<Integer,Person> list= person.getInfo1();
	    for(int i=0;i<=list.size();i++) {
	    	System.out.println(list.get(i));
	    }
		for (Entry<Integer,Person> mapw : list.entrySet()) {
			int a=mapw.getKey();
			System.out.println("key="+mapw.getKey()+";value="+mapw.getValue());
		}
		
		sqlseeion.commit();
		sqlseeion.close();
		
	}
	@Test
	public void test3() {
		SqlSession sqlseeion= sqlsessionFactory.openSession();
		PersonDao person=sqlseeion.getMapper(PersonDao.class);
	    List<Person> pList=person.getInfo("李四");
	    System.out.println(pList.get(0).getAge());
		sqlseeion.commit();
		sqlseeion.close();
		
	}
	@Before
	public void before() throws IOException {
		InputStream in=Resources.getResourceAsStream("mybatisConfig.xml");
		sqlsessionFactory= new SqlSessionFactoryBuilder().build(in);
		
	}
	
}
