
import java.util.*;
import java.util.LinkedList;

public class ReverseQueue {
    public static void reverse (Queue<Integer> queue) {
        if (queue.isEmpty()) return;

        int front = queue.poll();
        reverse(queue);
        queue.offer(front);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}