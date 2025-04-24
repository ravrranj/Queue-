

public class Main1 {
    public static void main(String[] args) {

    LLQueue q = new LLQueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display();

    System.out.println("Dequeued: " + q.dequeue());
    q.display();
    System.out.println("Peek: " + q.peek());
}
}