package com.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.models.Book;
import com.qa.models.Customer;
import com.qa.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book createBookRecord(Book b)
	{
		return bookRepository.save(b);
	}

	public Iterable<Book> getAllBooksByBookname(String bookname)
	{
		return bookRepository.getBookByBookname(bookname);
	}
	
	public Iterable<Book> getAllBooksByAuthor(String author)
	{
		return bookRepository.getBookByAuthor(author);
	}
	
	public Iterable<Book> getAllBooksByPublisher(String publisher)
	{
		return bookRepository.getBookByPublisher(publisher);
	}
	
	
	public Iterable<Book> getAllBooksByOverview(String overview)
	{
		return bookRepository.getBookByOverview(overview);
	}
	
	public Iterable<Book> getAllBooksByIsbn(int isbn)
	{
		return bookRepository.getBookByIsbn(isbn);
	}
	
	public Iterable<Book> getAllBooksByPrice(double price)
	{
		return bookRepository.getBookByPrice(price);
	}
	
	
	public Iterable<Book> getAllBooks()
	{
		return bookRepository.findAll();
	}
}
