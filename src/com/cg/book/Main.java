package com.cg.book;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Library lib=new Library();
        int i,choice;
        for(i=0;i<50;i++){
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Find Book by Id");
           System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice=s.nextInt();s.nextLine();
            if(choice==1){
                Book b=new Book();
                System.out.println("Enter the ID No:");
                b.setBook_no(s.nextInt());s.nextLine();
                System.out.println("Enter the book name:");
                b.setBookName(s.nextLine());
                System.out.println("Enter the author name:");
                b.setAuthor(s.nextLine());
                lib.addBook(b);
            }
            if(choice==2){
                ArrayList<Book> result=lib.viewAllBooks();
                if(result.isEmpty())
                {
                    System.out.println("The list is empty");
                    continue;
                }
                Iterator iter=result.iterator();
                while(iter.hasNext())
                {
                    Book b=(Book)iter.next();
                    System.out.println("Id No: "+b.getBook_no());
                    System.out.println("Book name:"+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if(choice==3){
                System.out.println("Enter the Id:");
                
                int id=s.nextInt();
                ArrayList<Book> result=lib.find_book(id);
                if(result.isEmpty()){
                    System.out.println("None of the book published by the Id : "+id);
                    continue;
                }
                Iterator iter=result.iterator();
                while(iter.hasNext()){
                    
                    Book b=(Book)iter.next();
                    System.out.println("Id No: "+b.getBook_no());
                    System.out.println("Book name: "+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            
            if(choice==4)
            System.exit(0);
        }
        
      
    }
}
