package Gabriella;

import java.sql.SQLOutput;

public class Person {

    String sureName;
    String lastName;
    int age;
    String city;
    String street;
    String phoneNumber;

    public Person(String sName, String lName, int age, String city, String street,String pNumber){
        this.sureName = sName;
        this.lastName = lName;
        this.age = age;
        this.city = city;
        this.street = street;
        this.phoneNumber = pNumber;

    }

    public Person() {

    }

    public void getPersonDetails() {
        System.out.println("Name:       "+sureName+" "+lastName.toUpperCase());
       // System.out.println("Lastname:      "+lastName.toUpperCase());
        System.out.println("Age:           "+age);
        System.out.println("City:          "+city);
        System.out.println("Street:        "+street);
        System.out.println("Phone number:  "+ phoneNumber);
        System.out.println("---------------------------------------------------------");

    }


}
