package com.teachingassistantsystem.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachingassistantsystem.dao.BookDao;
import com.teachingassistantsystem.dto.BookDTO;
import com.teachingassistantsystem.entity.Book;
import com.teachingassistantsystem.services.BookService;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	@Override
	public void saveOrUpdateBook(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		bookDao.saveOrUpdateBook(convertBookBean(bookDTO));
	}
	private Book convertBookBean(BookDTO bookDTO){
		Book book=new Book();
		if(bookDTO.getId()!=0){
			book.setId(bookDTO.getId());
		}
		book.setName(bookDTO.getName());
		book.setAuthor(bookDTO.getAuthor());
		return book;
	}
	@Override
	public long saveBookWithId(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
