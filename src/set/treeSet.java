package set;

import  java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {
        //defining
        TreeSet<String> treeSet = new TreeSet<>();


        //adding data : does not allow duplicate values
        treeSet.add("dog");
        treeSet.add("fish");
        treeSet.add("parrot");
        treeSet.add("cat");
        treeSet.add(null); // does not allow null value
        treeSet.add("fish");


        // prints data in ordered way
        System.out.println("hashSet is unordered: " + treeSet);

        //removing
        treeSet.remove("fish");
        System.out.println("hashSet after removing null value: " + treeSet);

        //traversing
        for (String h1 : treeSet) {
            System.out.println(h1);
        }
    }
}
