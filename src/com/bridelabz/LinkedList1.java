package com.bridelabz;

public class LinkedList1 {
    Node head;

    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
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


        System.out.println("======================================");

        System.out.println(" Display The Result of Add Last");
        linkedList.addLast(15);
        linkedList.addLast(20);
        linkedList.printList();

        System.out.println("======================================");
        System.out.println(" Display The Result of Delete First");
        linkedList.deleteFirst();
        linkedList.printList();

        System.out.println("=======================================");

    }
    // Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
}