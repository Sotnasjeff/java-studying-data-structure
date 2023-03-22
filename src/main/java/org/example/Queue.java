package org.example;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        this.arr = new int[size];
        this.capacity = size;
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        int x = arr[front];

        System.out.println("Removing " + x);

        this.front = (front + 1) % capacity;
        this.count--;

        return x;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + item);

        this.rear = (rear + 1) % capacity;
        this.arr[rear] = item;
        this.count++;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated\n");
            System.exit(-1);
        }

        return this.arr[front];
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == this.capacity;
    }
}
