

import java.util.*;

public class ReverseEveryKGroupQueues {

    public static void reverseEveryK(Queue<Integer> queue, int k) {
        if(queue.isEmpty() || k <= 0) {
            System.out.println("Invalid value of k");
            return;
        }

        int size = queue.size();
        Queue<Integer> tempQueue = new LinkedList<>();

        while (size >= k) {
            Stack<Integer>stack = new Stack<>();
            for (int i = 0 ; i < k; i++) {
                stack.push(queue.remove()); 
            }

            while (!stack.isEmpty()) {
                tempQueue.add(stack.pop()); 
            }

            size -= k;
        }

        // add remaining elements (less than k) as they are
        while(!queue.isEmpty()) {
            tempQueue.add(queue.remove());
        }

        // copy everything back to original queue
        while(!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove()); 
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 13; i++) {
            q.add(i);
        }

        int k = 3;

        System.out.println("Original Queue: " + q);

        reverseEveryK(q, k);

        System.out.println("Queue after reversing every " + k + " elements group : " + q);
    }
}