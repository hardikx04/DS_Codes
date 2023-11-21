class CircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public CircularQueue(int size) {
        maxSize = size;
        front = -1;
        rear = -1;
        queueArray = new int[maxSize];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % maxSize;
            queueArray[rear] = data;
            System.out.println(data + " enqueued to the queue");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            int data = queueArray[front];
            if (front == rear) {
                front = rear = -1; 
            } else {
                front = (front + 1) % maxSize;
            }
            System.out.println(data + " dequeued from the queue");
        }
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }
}

public class CircularQueueExample {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
