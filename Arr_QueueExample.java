class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public ArrayQueue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queueArray = new int[maxSize];
    }

    public void enqueue(int data) {
        if (!isFull()) {
            rear++;
            queueArray[rear] = data;
            System.out.println(data + " enqueued to the queue");
        } else {
            System.out.println("Queue is full. Cannot enqueue " + data);
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            int data = queueArray[front];
            front++;
            System.out.println(data + " dequeued from the queue");
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Peek: " + queueArray[front]);
        } else {
            System.out.println("Queue is empty. Cannot peek.");
        }
    }
}

public class ArrayQueueExample {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
