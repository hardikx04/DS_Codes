class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue {
    private Node front;
    private Node rear;

    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        System.out.println(data + " enqueued to the queue");
    }

    public void dequeue() {
        if (!isEmpty()) {
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            System.out.println(data + " dequeued from the queue");
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Peek: " + front.data);
        } else {
            System.out.println("Queue is empty. Cannot peek.");
        }
    }
}

public class LinkedListQueueExample {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
