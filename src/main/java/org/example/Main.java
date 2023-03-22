package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import static org.example.LinkedList.insert;
import static org.example.LinkedList.printList;
import org.example.Tree.BinaryTree;



public class Main {
    public static void main(String[] args) {
        org.example.LinkedList list = new org.example.LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        printList(list);

        BinaryTree tree = new BinaryTree();

        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);


        System.out.println(tree.containsNode(6));
        System.out.println(tree.containsNode(0));
        tree.traversePostOrder(tree.root);
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

            while (iterator.hasNext()) {
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

        while (iterator.hasNext()) {
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
        TreeSet tree = new TreeSet<>();

        tree.add(2);
        tree.add(5);
        tree.add(9);

        Iterator<Integer> iterator = tree.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(tree);
        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(tree.isEmpty());
        System.out.println(tree);
    }

}



