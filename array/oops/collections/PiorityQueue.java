package array.oops.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PiorityQueue {
    
 public static void main(String[] args) {
    
    Queue<Integer> pq = new PriorityQueue<>();
    pq.offer(4);
    pq.offer(2);
    pq.offer(3);
    pq.offer(4);
    pq.offer(5);
    pq.offer(6);

    System.out.println(pq);
    pq.poll();
    System.out.println(pq);
    System.out.println(pq.peek());



 }



}
