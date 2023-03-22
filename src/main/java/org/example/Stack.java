package org.example;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());
        return arr[--top];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }

        return -1;
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == capacity - 1;
    }
}
