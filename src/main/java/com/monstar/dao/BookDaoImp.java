package com.monstar.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp implements BookDao {
	
	@Autowired
	DataSource dataSource;
	
	public int getBookCount(){
		return 0;
	}
	
}
