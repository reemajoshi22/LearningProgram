package com.example.learning;

import java.util.List;

public interface BookDao {
	List<Books> getALlBooks();
	Books getBooksByIsbn(int isbn);
	void saveBook(Books book);
	void deleteBooks(Books book);
}
