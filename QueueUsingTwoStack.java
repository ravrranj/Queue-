

import java.util.*;

public class QueueUsingTwoStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //Enqueue

    public void enqueue(int x) {
        stack1.push(x);
    }

    //Dequeue

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if(stack2.isEmpty()) {
            //move the elements from stack 1 to stack 2

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
                
            }

        }
        return stack2.pop();
    }

    // peek

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    //check if queue is empty

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    //main function to check the output (Driver code)

    public static void main (String[] args) {
        QueueUsingTwoStack q = new QueueUsingTwoStack();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q.dequeue());
        System.out.println(q.peek());
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}