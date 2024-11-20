package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();

        //adding or inserting
        list1.add(20);
        list1.add(null);
        list1.add(21);
        list1.add(23);
        list1.add(20);
        System.out.println("List1 elements: "+list1);

        //removing data at index 2
        list1.remove(2);
        System.out.println("List1 elements after removing element at index: "+list1);

        //searching data at specific position
        System.out.println("element at 3rd index: "+list1.get(2));

        //updating the data replaces the data at 3rd index
        list1.set(3,33);
        System.out.println("List1 elements: "+list1);
        list1.set(1,27);

        //size of list
        System.out.println("List1 elements: "+list1.size());

        //sort list
        Collections.sort(list1);
        System.out.println("List1 elements: "+list1);

        //traversing the list using for each loop
        for (Integer l1:list1){
            System.out.println("l1: "+l1);

        }


    }
}

