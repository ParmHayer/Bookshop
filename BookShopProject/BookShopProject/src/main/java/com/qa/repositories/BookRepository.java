package com.qa.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qa.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	// Get books by name
	@Modifying
	@Transactional
	@Query("SELECT b from Book b where b.bookname like %:bookname%")
	public Iterable<Book> getBookByBookname(@Param("bookname") String bookname);

	@Query("SELECT b from Book b where b.author like %:author%")
	public Iterable<Book> getBookByAuthor(@Param("author")String author);

	@Query("SELECT b from Book b where b.publisher like %:publisher%")
	public Iterable<Book> getBookByPublisher(@Param("publisher")String publisher);

	@Query("SELECT b from Book b where b.overview like %:overview%")
	public Iterable<Book> getBookByOverview(@Param("overview")String overview);

	@Query("SELECT b from Book b where b.isbn like %:isbn%")
	public Iterable<Book> getBookByIsbn(@Param("isbn")int isbn);

	@Query("SELECT b from Book b where b.price = :price")
	public Iterable<Book> getBookByPrice(@Param("price")double price);
	
}