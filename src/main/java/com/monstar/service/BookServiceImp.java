package com.monstar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monstar.dao.BookDao;

@Service
public class BookServiceImp implements BookService{
	
	@Autowired
	private BookDao bookDao;

	public int getBookCount() {
		return bookDao.getBookCount();
	}
	
}
