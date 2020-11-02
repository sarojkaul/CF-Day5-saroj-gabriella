package Gabriella;

public class LendInfo extends Book{
   String dayFrom;
   String dayTo;
   String lName;     // the name of the person who lent the book from the library

    public LendInfo() {
        super();
    }

    public LendInfo(String title, String author, String publisher, int publYear, String ISBN, int numOfBooks, int lent, String dayFrom, String dayTo, String lName) {
        super(title, author, publisher, publYear, ISBN, numOfBooks, lent);
        this.dayFrom = dayFrom;
        this.dayTo = dayTo;
        this.lName = lName;

    }
    public void printLendInfo(){
        System.out.println("Book is lent to:"+this.lName+"  Date from: "+this.dayFrom+"   Date to: "+this.dayTo);
        System.out.println("----------------------------------------------------------");
    }


}
