package array.oops;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private List<Book> books; // Library has Books

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Book book1 = new Book("1984");
        Book book2 = new Book("To Kill a Mockingbird");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
