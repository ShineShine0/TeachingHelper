package com.teachingassistantsystem.dao;

import com.teachingassistantsystem.entity.Book;

public interface BookDao {
	public void saveOrUpdateBook(Book book);
	public long saveWithId(Book book);
}
