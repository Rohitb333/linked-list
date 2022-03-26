package com.bridelabz;

public class LinkedList1 {
    Node head;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Display The List Result Add");
        linkedList.addFirst(3);
        linkedList.addFirst(5);
        linkedList.addFirst(7);
        linkedList.printList();

    }
}