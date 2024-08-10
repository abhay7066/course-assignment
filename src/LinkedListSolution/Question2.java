package LinkedListSolution;
/*
Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.

 */
public class Question2 {


        public static void main(String[] args) {
            LinkedList1 list = new LinkedList1();


            list.append(10);
            list.append(20);
            list.append(30);
            list.append(40);

            System.out.println("Original Linked List:");
            list.printList();

            list.insertAtPosition(2, 25);

            System.out.println("Linked List after inserting 25 at position 2:");
            list.printList();


            list.insertAtPosition(0, 15);

            System.out.println("Linked List after inserting 15 at position 0:");
            list.printList();
        }
    }

class LinkedList1 {
    Node head;
    static class Node {
        int data;
        Node next;


        Node(int d) {
            data = d;
            next = null;
        }
    }


    public void insertAtPosition(int position, int newData) {
        Node newNode = new Node(newData);


        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;


        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }


        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node after the current node
        newNode.next = current.next;
        current.next = newNode;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void append(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }
}