package demo;

import entity.Book;
import generators.BookGenerator;
import generators.PositionGenerator;
import repository.Library;
import services.LibraryService;
import services.LibraryServiceImpl;

import java.util.Arrays;

public class DemoServiceImpl implements DemoService {
    private LibraryService libraryService;
    private Library library;
    private PositionGenerator positionGenerator;

    public DemoServiceImpl() {
        libraryService = new LibraryServiceImpl();
        library = new Library();
        positionGenerator = new PositionGenerator();
    }

    @Override
    public void start() {
        System.out.println("------ Start demo ------");
        addBooksDemo();
        removeRandomBookDemo(7);
        searchRandomBookDemo(5);
        addBooksAfterRemove(4);
        printAllBooks();
        System.out.println("------ End demo ------");
    }

    private void addBooksDemo() {
        int size = libraryService.getSize(library);
        int overSize = size + 5; // to show unsuccessful adding books
        BookGenerator bookGenerator = new BookGenerator();
        for (int i = 0; i < overSize; i++) {
            Book book = bookGenerator.generate();
            int result = libraryService.addBook(book, library);
            if (result >= 0) {
                System.out.println(book + " was put on the position " + result);
            } else {
                System.out.println("Not possible to add " + book);
            }
        }
        System.out.println();
    }

    private void addBooksAfterRemove(int amount) {
        BookGenerator bookGenerator = new BookGenerator();
        System.out.println("------ Adding books after removing procedure ------");
        for (int i = 0; i < amount; i++) {
            Book book = bookGenerator.generate();
            int result = libraryService.addBook(book, library);
            if (result >= 0) {
                System.out.println(book + " was put on the position " + result);
            } else {
                System.out.println("Not possible to add " + book);
            }
        }
        System.out.println();
    }

    private void removeRandomBookDemo(int amount) {
        int bound = libraryService.getSize(library);
        int count = 0;
        System.out.println("------ Remove result ------");
        while (count < amount) {
            int position = positionGenerator.generate(bound);
            boolean result = libraryService.remove(position, library);
            if (result) {
                System.out.println("Book on the position " + position + " removed");
            } else {
                System.out.println("Not possible to remove book on position " + position);
            }
            count++;
        }
        System.out.println();
    }

    private void searchRandomBookDemo(int amount) {
        int bound = libraryService.getSize(library);
        int count = 0;
        System.out.println("------ Search result ------");
        while (count < amount) {
            int position = positionGenerator.generate(bound);
            Book book = libraryService.search(position, library);
            if (book != null) {
                System.out.println("Position " + position + ": " + book);
            } else {
                System.out.println("Not found book on position " + position);
            }
            count++;
        }
        System.out.println();
    }

    private void printAllBooks() {
        System.out.println("------ Library ------");
        Book[] books = libraryService.getAllBooks(library);
        int bound = libraryService.getSize(library);
        for (int i = 0; i < bound; i++) {
            System.out.print("Position " + i + ": ");
            if (books[i] != null) {
                System.out.println(books[i]);
            } else {
                System.out.println("empty");
            }
        }
        System.out.println();
    }
}
