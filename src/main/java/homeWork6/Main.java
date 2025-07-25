package homeWork6;

public class Main {
        public static void main(String[] args) {
            Library library = new Library();

            library.addBook(new Book("War and Peace", "Leo Tolstoy"));
            library.addBook(new Book("Anna Karenina", "Leo Tolstoy"));
            library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

            System.out.println("All books:");
            library.printAllBooks();
            System.out.println("\nBooks by Leo Tolstoy:");
            for (Book b : library.findBooksByAuthor("Leo Tolstoy")) {
                System.out.println(b);
            }

            library.removeBook("The Great Gatsby");
            System.out.println("\nAfter removing 'The Great Gatsby':");
            library.printAllBooks();
        }
    }

