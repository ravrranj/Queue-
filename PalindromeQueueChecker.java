

import java.util.*;

public class PalindromeQueueChecker {

    public static boolean isPalindrome(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> temp = new LinkedList<>(queue);  // copy of original queue

        //Push all elements into stack
        for (int num : temp) {
            stack.push(num);
        }

        // Compare elements from queue and stack

        while(!temp.isEmpty()) {
            if (!temp.poll().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);

        System.out.println("Queue is : " + queue);
        System.out.println("Is Palindrome? " + isPalindrome(queue));
    }
}

