package com.cg.book;

public class Book { 
	  private int book_no;
	  private String bookName;
	  private String author;
	public Book(int book_no, String bookName, String author) {
		super();
		this.book_no = book_no;
		this.bookName = bookName;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [book_no=" + book_no + ", bookName=" + bookName + ", author=" + author + "]";
	}
	  
	  
	  
}