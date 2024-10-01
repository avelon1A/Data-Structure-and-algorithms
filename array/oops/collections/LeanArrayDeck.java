package array.oops.collections;

import java.util.ArrayDeque;

public class LeanArrayDeck { // using in sliding window
    public static void main(String[] args) {
        
               ArrayDeque<Integer> ard = new ArrayDeque<>();

               ard.offer(1);
               ard.offerFirst(2);
               ard.offerLast(34);
               System.out.println(ard);

    }
    
}
