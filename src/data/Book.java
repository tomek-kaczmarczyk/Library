package data;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int releaseDate;
    private int pages;

    public Book(String title, String author, String publisher, String isbn, int releaseDate, int pages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.releaseDate = releaseDate;
        this.pages = pages;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void printInfo() {
        System.out.println(getTitle() + " " + getAuthor() + " " + getPublisher() + " " + getIsbn() + " " + getReleaseDate() + " " + getPages());
    }

}
