import java.util.Arrays; //22CSU105 LATIKA MUKHI

class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stack, 0, top + 1));
    }
}

public class StackUsingArrays {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Is Stack Empty: " + stack.isEmpty());
        System.out.println("Is Stack Full: " + stack.isFull());
    }
}
