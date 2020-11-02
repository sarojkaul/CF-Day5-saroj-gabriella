package Gabriella;

public class Library {
    public static void main(String[] args) {

        Book b1= new Book("Eine billion Dollar", "Andreas Esbach", "Bastei Lübbe", 2004, "3-404-15040-6", 4,2);
        Book b2= new Book("Englisch Dictionary", "", "Oxford University", 2018, "3-404-15123-6", 10,10);
        Book b3= new Book("Gier", "Marc Elsberg", "Bastei Lübbe", 2004, "3-404-15040-6", 4,2);
        Book b4= new Book("Austrian Cuisine", "Plachutta", "Orac", 2008, "3-404-15040-6", 2,0);

        Book bookArr[] = {b1,b2,b3,b4};

        for (Book x: bookArr) {
            x.printBook();
        }

        LendInfo l1 = new LendInfo();
        l1.author =b1.author;
        l1.title =b1.title;
        l1.publisher=b1.publisher;
        l1.ISBN = b1.ISBN;
        l1.dayFrom = "15.10.2020";
        l1.dayTo = "15.11.2020";
        l1.lName = "Karoline Hukapu";

        b1.printBook();
        l1.printLendInfo();



    }
}
