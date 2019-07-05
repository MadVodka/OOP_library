package services;

import com.sun.istack.internal.Nullable;
import entity.Book;
import repository.Library;

public class LibraryServiceImpl implements LibraryService {
    /**
     * @param book
     * @param library
     * @return number of position if added successfully otherwise -1
     */
    @Override
    public int addBook(Book book, Library library) {
        for (int i = 0; i < getSize(library); i++) {
            if (library.getBooks()[i] == null) {
                library.getBooks()[i] = book;
                return i;
            }
        }
        return -1;
    }

    /**
     * @param position
     * @param library
     * @return true if removed successfully otherwise false
     */
    @Override
    public boolean remove(int position, Library library) {
        if (position >= getSize(library)) {
            return false;
        }
        if (library.getBooks()[position] != null) {
            library.getBooks()[position] = null;
            return true;
        }
        return false;
    }

    @Override
    @Nullable
    public Book search(int position, Library library) {
        return library.getBooks()[position];
    }

    @Override
    public Book[] getAllBooks(Library library) {
        return library.getBooks();
    }

    @Override
    public int getSize(Library library) {
        return library.getBooks().length;
    }
}
