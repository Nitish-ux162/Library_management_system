import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String publicationYear;
    private boolean isBorrowed;

    public Book(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            return title + " has been borrowed successfully.";
        } else {
            return title + " is already borrowed.";
        }
    }

    public String returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            return title + " has been returned successfully.";
        } else {
            return title + " is not borrowed.";
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear + ", Borrowed: " + isBorrowed;
    }
}

public class Library {
    private List<Book> books;
    private Scanner scanner;

    public Library() {
        this.books = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book publication year: ");
        String publicationYear = scanner.nextLine();

        books.add(new Book(title, author, publicationYear));