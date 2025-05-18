# Queue-
A Queue is a linear data structure that follows FIFO (First In First Out). 


🔹 What is a Queue?
A Queue is a linear data structure that follows the FIFO (First In First Out) principle. The element inserted first is removed first.


 Queues are everywhere in the real world, following the FIFO (First In, First Out) principle—meaning the first item added is the first one removed. Here are some real-world examples:
🚶‍♂️ Everyday Examples:
- Waiting in Line – Whether at a bank, airport, or grocery store, people are served in the order they arrive.
- Call Center Support – Customer calls are handled in the order they come in.
- Traffic at Toll Booths – Cars pass through in the order they arrive.
- Printer Queue – When multiple documents are sent to a printer, they are printed in the order they were submitted.
- Movie Ticket Booking – Online ticket systems process reservations in sequence.
💻 Computer Science Applications:
- Task Scheduling – Operating systems use queues to manage processes.
- Network Requests – Web servers handle incoming requests in order.
- Breadth-First Search (BFS) – Used in graph traversal algorithms.
- Message Queues – Used in messaging systems like Kafka or RabbitMQ.
Queues help maintain order, fairness, and efficiency in both real life and computing.


🔹 Types of Queues:
Simple Queue – Basic FIFO

Circular Queue – Last position is connected to the first to make a circle (saves space)

Priority Queue – Elements are processed based on priority, not just order

Deque (Double Ended Queue) – Insertion and deletion from both ends

Queue using Stacks – Advanced concept to solve using only stacks

🔹 Queue Operations (and Time Complexities):

Operation	Description	Time Complexity
enqueue()	Insert element at rear	O(1)
dequeue()	Remove element from front	O(1)
peek() / front()	View the front element	O(1)
isEmpty()	Check if queue is empty	O(1)
✅ Implemented using LinkedList, Array, or Stack (Java also has Queue, Deque, PriorityQueue).

🌍 Importance of Queue in Real-Life Applications
Queues are everywhere in the real world:

CPU Scheduling – OS manages processes in a queue.

IO Buffers – Printers, disk scheduling.

Customer Service Systems – Calls/tickets in queue.

Messaging Systems – Kafka, RabbitMQ, etc., use queues to manage events.

Job Queues – In background processing (like in web apps, order processing).

Breadth-First Search (BFS) – Queues are essential for BFS in graphs and trees.

Traffic Systems – Vehicles waiting at a signal—perfect real-life queue!

🎯 Important Interview Questions on Queue
🔰 Easy:
Implement a Queue using Arrays

Implement a Queue using Linked List

Implement Queue using Two Stacks

🔄 Medium:
Circular Queue Implementation

Design a Queue with getMin() in O(1)

Generate Binary Numbers from 1 to N using Queue

Reverse the first K elements of a Queue

Interleave the first and second halves of a queue

🌪️ Hard:
LRU Cache (Least Recently Used – uses Queue + HashMap)

Sliding Window Maximum (Deque-based)

Rotten Oranges Problem (BFS using Queue)

Level Order Traversal of a Binary Tree (BFS)

Implement a priority queue without using built-in libraries

💡 Tip for Interviews:
If they ask you to design a queue, ask:

“Should I use a LinkedList or Array-based implementation, or would you like me to go with stacks?”

That shows you’re thinking from both implementation and efficiency perspectives 🔥
