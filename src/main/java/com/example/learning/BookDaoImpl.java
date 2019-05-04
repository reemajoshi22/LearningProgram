package com.example.learning;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{
	private List<Books> books;
	public BookDaoImpl() {
        books = new ArrayList<>();
        books.add(new Books(1, "Java"));
        books.add(new Books(2, "Python"));
        books.add(new Books(3, "Android"));
    }
	@Override
	public List<Books> getALlBooks() {
		return books;
	}

	@Override
	public Books getBooksByIsbn(int isbn) {
		return books.get(isbn);
	}

	@Override
	public void saveBook(Books book) {
		books.add(book);
	}

	@Override
	public void deleteBooks(Books book) {
		books.remove(book);
	}

}
