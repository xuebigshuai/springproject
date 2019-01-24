package com.xys.service;

import org.springframework.stereotype.Service;

import com.xys.model.User;

@Service
public class UserService extends BaseService<User> {
	
	public void save() {
		baseDao.save();
	}

}
