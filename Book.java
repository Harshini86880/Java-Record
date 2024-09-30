public class Book {
    private String name;
    private String isbn;
    private String author;
    private String publisher;

    /**
     * Constructor to initialize the instance variables
     */
    public Book(String name, String isbn, String author, String publisher) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Get methods
    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    // Method to get book info as a string
    public String getBookInfo() {
        return "Book Name: " + name + ", ISBN: " + isbn + ", Author: " + author + ", Publisher: " + publisher;
    }
}