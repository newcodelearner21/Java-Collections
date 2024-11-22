package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        //defining
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();

        //adding data : does not allow duplicate values
        linkedHashSet1.add("dog");
        linkedHashSet1.add("fish");
        linkedHashSet1.add("parrot");
        linkedHashSet1.add("cat");
        linkedHashSet1.add("null"); //null value allowed
        linkedHashSet1.add("fish");


        // prints data in ordered way
        System.out.println("hashSet is unordered: " + linkedHashSet1);

        //removing
        linkedHashSet1.remove("null");
        System.out.println("hashSet after removing null value: " + linkedHashSet1);

        //traversing
        for (String h1 : linkedHashSet1) {
            System.out.println(h1);
        }
    }
}