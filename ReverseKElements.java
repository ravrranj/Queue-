

import java.util.*;

public class ReverseKElements {

    public static void ReverseKElementsqueue(Queue<Integer> queue, int k) {
        if(queue.isEmpty() || k > queue.size() || k < 0) {
            System.out.println("Invalid value of k");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        //Step 1: Push first k elements into stack

        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        //Step 2: Enqueue the elements from stack back to queue
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        //Step 3: Move the remaining (n-k) elements to the back
        int size = queue.size();
        for(int i = 0; i < size - k; i++) {
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k = 6;
        System.out.println("Original Queue: " + q);

        ReverseKElementsqueue(q, k);

        System.out.println("Queue after reversing first " + k + " elements " + q);
    }
}