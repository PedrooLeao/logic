package oo.collection;

import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        Book b1 =  new Book("Moby Dick", "Herman", "1234567890123");
        Book b2 =  new Book("Ulysses", "James Joyce", "1234567890122");
        Book b3 =  new Book("Don Quixote", "Miguel de Cervantes", "1234567890121");

        Book.addBook(b1);
        Book.addBook(b2);
        Book.addBook(b3);

        List<Book> bookList = Book.getBookList();
        System.out.println("List of books:");
        for (Book book: bookList) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        Book.revoveBook(b2);
        System.out.println("\nAfter removing " + b1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book: bookList) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
