package com.xys.dao;

import org.springframework.stereotype.Repository;

import com.xys.model.Book;
@Repository
public class BookDao extends BaseDao<Book> {
	
	@Override
	public void save() {
		System.out.println("保存书到数据库。。。");
	}

}
