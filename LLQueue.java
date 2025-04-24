


public class LLQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null, rear = null;

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = front.data;
        front = front.next;

        //if queue become empty after removal
        if (front ==  null) {
            rear = null;
        }
        return val;
    }
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
       
    }

    // check if empty
    public boolean isEmpty() {
        return front == null;
    }
    //Display

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}