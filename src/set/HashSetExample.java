package set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        //defining
        HashSet<String> hashSet1 = new HashSet<>();

        //adding data : does not allow duplicate values
        hashSet1.add("dog");
        hashSet1.add("fish");
        hashSet1.add("parrot");
        hashSet1.add("cat");
        hashSet1.add("null");
        hashSet1.add("fish");


        // prints data in unordered way  : Best for SEARCHING operation
        System.out.println("hashSet is unordered: " + hashSet1);

        //removing
        hashSet1.remove("null");
        System.out.println("hashSet after removing null value: " + hashSet1);

        //traversing
        for (String h1: hashSet1){
            System.out.println(h1);
        }


    }
}
