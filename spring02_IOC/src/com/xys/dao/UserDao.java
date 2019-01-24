package com.xys.dao;

import org.springframework.stereotype.Repository;

import com.xys.model.User;

@Repository
public class UserDao extends BaseDao<User> {
	@Override
	public void save() {
		System.out.println("保存用户信息到数据库。。。");
	}

}
