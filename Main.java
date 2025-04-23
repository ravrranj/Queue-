


    public class Main{
        public static void main(String[] args) {
            MyQueues q = new MyQueues(5);
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.display();
            System.out.println(q.dequeue());
            q.display();
            System.out.println(q.peak());
        }
    }
