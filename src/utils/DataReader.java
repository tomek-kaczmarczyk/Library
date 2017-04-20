package utils;

import data.Book;
import static java.lang.System.out;

import java.util.Scanner;

public class DataReader {
    private Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public void close(){
        sc.close();
    }

    public Book readAndCreateBook() {
        System.out.println("Podaj nazwę książki");
        String title = sc.nextLine();
        System.out.println("Podaj tytuł książki");
        String author = sc.nextLine();
        System.out.println("Podaj wydawnictwo");
        String publisher = sc.nextLine();
        System.out.println("Podaj ISBN");
        String isbn = sc.nextLine();
        System.out.println("Podaj rok wydania");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj ilość stron");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author, publisher, isbn, releaseDate, pages);
    }
}
