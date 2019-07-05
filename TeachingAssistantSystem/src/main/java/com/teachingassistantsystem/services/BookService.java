package com.teachingassistantsystem.services;

import com.teachingassistantsystem.dto.BookDTO;

public interface BookService {
	public void saveOrUpdateBook(BookDTO bookDTO);
	public long saveBookWithId(BookDTO bookDTO);
}