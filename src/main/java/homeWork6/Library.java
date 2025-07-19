package homeWork6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public void printAllBooks() {
        ArrayList<Book> sorted = new ArrayList<>(books);
        Collections.sort(sorted, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        for (Book book : sorted) {
            System.out.println(book);
        }
    }
}






