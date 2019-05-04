package com.example.learning;

public class AccessBook {
	public static void main(String[] args) {
		BookDao bookDao=new  BookDaoImpl();
		 for (Books book : bookDao.getALlBooks()) {
	            System.out.println("Book ISBN : " + book.getIsbn());
	        }

	        //update student
	        Books book = bookDao.getALlBooks().get(1);
	        book.setBookName("Algorithms");
	        bookDao.saveBook(book);
	}
}
