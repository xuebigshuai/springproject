package com.xys.service;

import org.springframework.stereotype.Service;

import com.xys.model.Book;

@Service
public class BookService extends BaseService<Book> {
	
	public void save() {
		baseDao.save();
		//Arrays.asList();
	}

}
