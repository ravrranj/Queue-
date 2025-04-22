
import java.util.*;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>() ;

        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // peek at the front
        System.out.println("Front of queue: " + queue.peek());

        // Dequeue elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        //check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        //print remaining queue
        System.out.println("Remaining queue: " + queue);
    }
}