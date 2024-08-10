package LinkedListSolution;

public class Question3 {

        public static void main(String[] args) {
            LinkedList2 list = new LinkedList2();


            list.append(10);
            list.append(10);
            list.append(20);
            list.append(30);
            list.append(30);
            list.append(30);
            list.append(40);

            System.out.println("Original Linked List:");
            list.printList();


            list.removeDuplicates();

            System.out.println("Linked List after removing duplicates:");
            list.printList();
        }
    }
class LinkedList2 {
    Node head;

    // Node class
    static class Node {
        int data;
        Node next;


        Node(int d) {
            data = d;
            next = null;
        }
    }


    public void removeDuplicates() {
        Node current = head;


        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                // Move to the next node if no duplicate
                current = current.next;
            }
        }
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
