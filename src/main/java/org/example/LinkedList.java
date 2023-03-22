package org.example;

public class LinkedList {

    NodeLinkedList head;

    static class NodeLinkedList {
        int data;
        NodeLinkedList next;

        NodeLinkedList(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {

        NodeLinkedList new_nodeLinkedList = new NodeLinkedList(data);


        if (list.head == null) {
            list.head = new_nodeLinkedList;
        } else {
            NodeLinkedList last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_nodeLinkedList;
        }

        return list;
    }

    public static void printList(LinkedList list) {
        NodeLinkedList currentNodeLinkedList = list.head;

        System.out.print("LinkedList: ");

        while (currentNodeLinkedList != null) {
            System.out.print(currentNodeLinkedList.data + " ");

            currentNodeLinkedList = currentNodeLinkedList.next;
        }
    }

}
