package saroj;

public class Person {

    public static  void main(String[] args) {
      Main person1 = new Main("saroj","Kaul",28);
      Main person2 = new Main("Mahi", "Mahi", 29);
      person1.displayMain();
       System.out.println("First Name:   " +person1.firstname);
        System.out.println("Last Name:   " +person1.lastname);
        System.out.println("Age:   " +person1.age);
        System.out.println("First Name : "+person2.firstname.toUpperCase());

    }
}
