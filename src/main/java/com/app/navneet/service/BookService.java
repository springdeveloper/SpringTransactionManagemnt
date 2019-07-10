package com.app.navneet.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.navneet.model.Book;
import com.app.navneet.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book findByID(Long id) {
		
		return bookRepository.findByBookId(id);
		
	}
	@Transactional(readOnly = true)
	public void addBook(Book book) {
		bookRepository.save(book);
	}

}
