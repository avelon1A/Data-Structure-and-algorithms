package array.oops.solidPrinciples;

import java.util.*;

public class Stack1 {
    

    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        animals.add("tiger");
        animals.add("Lion");
        System.out.println(animals);
        animals.pop();
        System.out.println(animals.peek());
    }
}
