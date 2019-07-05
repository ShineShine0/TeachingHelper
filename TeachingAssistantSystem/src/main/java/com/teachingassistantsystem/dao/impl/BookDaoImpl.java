package com.teachingassistantsystem.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teachingassistantsystem.dao.BookDao;
import com.teachingassistantsystem.entity.Book;

@Repository
@Transactional
public class BookDaoImpl implements BookDao{

	@Autowired
	SessionFactory sessionFactory;
	private Session getCurentSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void saveOrUpdateBook(Book book) {
		// TODO Auto-generated method stub
		try{
			getCurentSession().save(book);
		}catch(Exception ex){
			throw ex;
		}
		
	}

	@Override
	public long saveWithId(Book book) {
		// TODO Auto-generated method stub
		try{
			long id=(long)getCurentSession().save(book);
			return id;
		}catch(Exception ex){
			throw ex;
		}
	}

}
