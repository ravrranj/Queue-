

import java.util.*;

public class ReverseEveryKGroupQueue {

    public static void reverseEveryK(Queue<Integer> queue, int k){
        if (queue.isEmpty() || k <= 0) {
            System.out.println("Invalid value of k");
            return;
        }
    
    Queue<Integer> result = new LinkedList<>();
    
    while ((!queue.isEmpty())) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        // take up to k elements into the stack 

        while (!queue.isEmpty() && count < k) {
            stack.push(queue.remove());
            count++;
        }

        //Pop from stack to result queue (reversed group)
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }        
    }

         // Transfer back to the original queue
         while (!result.isEmpty()) {
            queue.add(result.remove());
         }
        }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1 ; i <= 12; i++) {
            q.add(i);
        }

        int k = 3;

        System.out.println("Original Queue: " + q);

        reverseEveryK(q, k);

        System.out.println("Queue after reversing every " + k + " elements group : " + q);
    
    } 
 }