package com.cg.book;

import java.util.*;
public class Library{
    private ArrayList<Book> bookList=new ArrayList<Book>();
    
    public void setBookList(ArrayList<Book> bookList){
        this.bookList=bookList;
    }
    public ArrayList<Book> getBookList(){
        return bookList;
    }
    public void addBook(Book b){
        bookList.add(b);
    }
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }
        public ArrayList<Book> find_book(int id) {
			return bookList;
		} 
        	
        
    }

