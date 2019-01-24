package com.xys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.xys.model.Person;

public interface PersonDao {

	boolean addInfo(Person person);
	boolean updateInfo(Person person);
	List<Person>  getInfo(@Param("name") String name);
	boolean deleteInfo(Person person);
	/**
	 * @MapKey 里的value 值是 Java bean中的属性  将作为map的key值
	 * */	
	@MapKey("id")
	Map<Integer,Person> getInfo1();
	
	
}
