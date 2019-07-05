package repository;

import entity.Book;

public class Library {
    private static final int SIZE = 30;
    private Book[] books;

    public Library() {
        books = new Book[SIZE];
    }

    public Book[] getBooks() {
        return books;
    }
}
