package Gabriella;

public class Book {

    String title;
    String author;
    String publisher;
    int publYear;
    String ISBN;
    int numOfBooks;  //this is the number of book right now in the library
    int lent;        //this is what people lent.  numOfBooks+lent= the whole amount of book

    public Book(String title, String author, String publisher, int publYear, String ISBN, int numOfBooks, int lent) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publYear = publYear;
        this.ISBN = ISBN;
        this.numOfBooks = numOfBooks;
        this.lent = lent;
    }

    public Book() {

    }

    public void printBook(){
        System.out.println("Title: "+this.title);
        System.out.println("Writer: "+this.author);
        System.out.println("Free examples: "+this.numOfBooks+"   Lent:"+this.lent);
        System.out.println("----------------------------------------------------------");
    }
}
