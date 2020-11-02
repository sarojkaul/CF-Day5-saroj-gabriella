package Gabriella;

public class Main {

    public static void main(String[] args) {

    Person p1 = new Person("Otto","Müller", 32, "Berlin", "Ahorn Strasse 33","0049123456789");
    Person p2 = new Person("Leila", "Lichtenstein",28,"Wien","Donau Strasse 19","");
    Person p3 = new Person("Richard","Lichtenstein",8,"Wien","Donau Strasse 19","");
    Person p4 = new Person("Peter","Lichtenstein",8,"Wien","Donau Strasse 19","");

        p1.getPersonDetails();
        p2.getPersonDetails();
    }
}
