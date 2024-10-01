package array.oops.solidPrinciples;

import java.util.LinkedList;
import java.util.Queue;

public class LinkList1 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); 
        // use to add elements in Queue add() is also use to add element
        //  but it is not succesfull it will through error

        //poll use to get the first element  and remove is also there
        //  but remove() will throw error if it fails
        queue.offer(34);
        queue.offer(55);

 
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }
    
}
