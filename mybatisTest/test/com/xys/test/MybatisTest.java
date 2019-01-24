package com.xys.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;


public class MybatisTest {

	@Test
	public void test() {
		Map<String, Object> map=new HashMap<>();
		map.put("id", 123);
		map.put("name", "suresh");
		map.get("id");
		for (Entry<String, Object> mapw : map.entrySet()) {
			mapw.getKey();
			mapw.getValue();
			System.out.println("key="+mapw.getKey()+";value="+mapw.getValue());
			
		}
		List<Map<String,Object>> l=new ArrayList<>();
		for (Map<String, Object> map2 : l) {
			
		}
		
	}

}
