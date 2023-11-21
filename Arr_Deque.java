public class ArrayDeque {

    //Latika 22csu105
    private int[] deque;
    private int front, rear, capacity;
    private int size;

    public ArrayDeque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    public void enqueueFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueue at the front.");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front = front - 1;
        }
        deque[front] = item;
        size++;
        System.out.println(item + " enqueued at the front of the deque.");
    }

    public void enqueueRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueue at the rear.");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        deque[rear] = item;
        size++;
        System.out.println(item + " enqueued at the rear of the deque.");
    }

    public int dequeueFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeue from the front.");
            return -1; // Return some default value or throw an exception
        }
        int item = deque[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        size--;
        return item;
    }

    public int dequeueRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeue from the rear.");
            return -1; // Return some default value or throw an exception
        }
        int item = deque[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear = rear - 1;
        }
        size--;
        return item;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return front == -1;
    }public int peekFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot peek at the front.");
            return -1; // Return some default value or throw an exception
        }
        return deque[front];
}public int peekRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot peek at the rear.");
            return -1; // Return some default value or throw an exception
        }
        return deque[rear];
    }

    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque(5);

        deque.enqueueRear(10);
        deque.enqueueRear(20);
        deque.enqueueFront(30);
        deque.enqueueFront(40);
System.out.println("Front element is: " + deque.peekFront());
        System.out.println("Rear element is: " + deque.peekRear());
 System.out.println(deque.dequeueFront() + " dequeued from the front of the deque.");
        System.out.println(deque.dequeueRear() + " dequeued from the rear of the deque.");
 System.out.println("Is deque empty? " + deque.isEmpty());
        System.out.println("Is deque full? " + deque.isFull());
    }
}