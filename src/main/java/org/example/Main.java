package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main {
    public static void main(String[] args) {

    }

    public static void Vector() {
        Vector vector = new Vector<>(2, 1);

        vector.addElement("");
        vector.addElement(1);

        System.out.println(vector.size());

        while (vector.iterator().hasNext()) {
            System.out.println(vector.iterator().next());
        }
    }

    public static void Stack() {
        Stack stack = new Stack<>();

        Random random = new Random();

        int i = 5;
        while (i != 0) {
            System.out.println("PUSH: " + stack.push(random.nextInt(20)));
            i--;
        }

        System.out.println("");

        while (!stack.isEmpty()) {
            System.out.println("POP: " + stack.pop());
        }

        System.out.println(stack.isEmpty());
    }

    public static void Queue() {
        Queue queue = new LinkedList<>();

        System.out.println("PUSH: " + queue.add("a"));
        System.out.println("PUSH: " + queue.add("b"));

        System.out.println(queue.poll());

        System.out.println(queue.element());
        System.out.println(queue.peek());
    }

    public static void ArrSynchUsingSynchronizedList() {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        list.add("Jeff");
        list.add("Adriana");
        list.add("Jessica");
        list.add("Jackson");

        synchronized (list) {
            Iterator<String> iterator = list.iterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

    public static void ArrSynchUsingThreadingSafeVariable() {
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Jeff");
        list.add("Adriana");
        list.add("Jessica");
        list.add("Jackson");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void UsingComparatorAndComparableAndSort() {
        List<Person> arr = new ArrayList<Person>();

        arr.add(new Person("Jeff", 21, "123.124.123-40"));
        arr.add(new Person("Adriana", 23, "000.124.123-40"));
        arr.add(new Person("Wesley", 33, "123.124.000-40"));

        for (Person p : arr) {
            System.out.println(p.getName() + " " + p.getAge());
        }

        Collections.sort((List) arr);

        System.out.println("===============================");

        for (Person p : arr) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }

    public static void TreeSet() {
        
    }

}


