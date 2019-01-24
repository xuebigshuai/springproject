package com.xys.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xys.dao.BaseDao;

public class BaseService<T> {
	
	@Autowired
	protected BaseDao<T> baseDao;
	

}
