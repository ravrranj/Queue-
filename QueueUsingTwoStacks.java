
import java.util.*;

public class QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //Enqueue
    public void enqueue(int x) {
        stack1.push(x);

    }    

    //Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {

            // Move all elements from stack1 to stack2
            
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                  stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    //Driver code

    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());  //10
        System.out.println(q.peek());     //20
        q.enqueue(40);
        System.out.println(q.dequeue());   //20
        System.out.println(q.dequeue());   //30
        System.out.println(q.dequeue());   //40 
        System.out.println(q.dequeue());   // queue is empty -> -1
    }
}