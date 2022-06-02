package com.tns.dao;

import java.util.List;

import com.tns.entities.Book;

public interface BookDao {
	public abstract Book getBookById(int id);
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookCount();
	public abstract List<Book> getAuthorBook (String author);
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getBooksInPriceRange(double low , double high);
	

}