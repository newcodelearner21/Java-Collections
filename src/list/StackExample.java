package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack1= new Stack<>();

        //adding the data
        stack1.push(30);
        stack1.push(31);
        stack1.push(32);
        stack1.push(31);

        System.out.println("adding data in stack1: "+stack1);

        //removing data - last in is first out:LIFO

        stack1.pop();
        System.out.println("after first pop in stack1: "+stack1);

        stack1.pop();
        System.out.println("after second pop in stack1: "+stack1);


    }

}
