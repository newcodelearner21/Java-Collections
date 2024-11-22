package map;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        //define
        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();

        //adding data
        map1.put(101,"Dog");
        map1.put(102,"fish");
        map1.put(103,"parrot");
        map1.put(104,"cat");
        map1.put(102,"hen");

        //prints data in ordered form
        System.out.println("printing map1: "+ map1);

        //removing data
        map1.remove(104);//only key needed to remove data
        System.out.println("printing map1 after removing values of 104: "+ map1);

        //traversing using MapEntry
        for(Map.Entry m1: map1.entrySet()){
            System.out.println(m1.getKey()+"-----"+m1.getValue());
        }
    }
}
