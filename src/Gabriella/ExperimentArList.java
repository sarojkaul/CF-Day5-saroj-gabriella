package Gabriella;
import java.util.*;

public class ExperimentArList {
    public static void main(String[] args) {

        // create array list
        // ArrayList < String > arrayList = new ArrayList < String > ();
        ArrayList<String> menu = new ArrayList<String>();

        menu.add("cheese cake");
        menu.add("hot chili");
        menu.add("vine soup");
        menu.add("Steak");
        menu.add("schoko mousse");
        menu.add("selleri saft");
        menu.add("pizza pepperoni");

        for (int i=0; i<menu.size(); i++){
            System.out.println( "Element"+i+"  "+ menu.get(i));
        }
        System.out.println("****************listing length of elements**************************");
        for (String string : menu){
           System.out.println(string+"  "+string.length());
        }

        menu.set(0,"Strawberry Cheese Cake");

        System.out.println("*****************remove element3*****************************");
        menu.remove(3);
        for (int i=0; i<menu.size(); i++){
            System.out.println( "Element"+i+"  "+ menu.get(i));
        }

        System.out.println("*****************sort elements*****************************");
        Collections.sort(menu);
        for (int i=0; i<menu.size(); i++){
            System.out.println( "Element"+i+"  "+ menu.get(i)+"     iterator=     "+menu.iterator());
        }
        System.out.println("****************try out index of method************");
        System.out.println(menu.indexOf("vine soup"));

        menu.clear();






    }



}
