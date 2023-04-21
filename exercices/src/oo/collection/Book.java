package oo.collection;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String  ISBN;
    private static List<Book> bookList = new ArrayList<>();
    public Book(String title, String author, String  ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String  getISBN() {
        return ISBN;
    }

    public void setISBN(String  ISBN) {
        this.ISBN = ISBN;
    }

    public static void addBook (Book book){
        bookList.add(book);
    }

    public static void revoveBook (Book book){
        bookList.remove(book);
    }

    public static List<Book> getBookList() {
        return bookList;
    }
}
