
public class MyQueues {
    int[] arr;
    int front;
    int rear;
    int capacity;

    public MyQueues(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // Enqueue operation
    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
    
        arr[++rear] = data;
    }

    // Dequeue operation
    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front];
        front++;
        return removed;
    }

    // Peak front element

    public int peak() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }  
}