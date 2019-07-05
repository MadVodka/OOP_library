package services;

import entity.Book;
import repository.Library;

public interface LibraryService {
    int addBook(Book book, Library library);

    boolean remove(int position, Library library);

    Book search(int position, Library library);

    Book[] getAllBooks(Library library);

    int getSize(Library library);
}
