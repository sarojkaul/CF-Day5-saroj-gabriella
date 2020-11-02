package Gabriella;

public class Book {

    String title;
    String writer;
    String publisher;
    int publYear;
    String ISBN;
    int numOfBooks;  //this is the number of book right now in the library
    int lent;        //this is what people lent.  numOfBooks+lent= the whole amount of book

    public Book(String title, String writer, String publisher, int publYear, String ISBN, int numOfBooks, int lent) {
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
        this.publYear = publYear;
        this.ISBN = ISBN;
        this.numOfBooks = numOfBooks;
        this.lent = lent;
    }
}
