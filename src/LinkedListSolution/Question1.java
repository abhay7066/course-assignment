package LinkedListSolution;
public class Question1 {


        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            // Creating the linked list 14->21->11->30->10
            list.append(14);
            list.append(21);
            list.append(11);
            list.append(30);
            list.append(10);

            // Input X = 14
            int x = 14;

            // Search for X in the list
            list.printSearchResult(x);
        }
    }
class LinkedList {
    Node head; // Head of the linked list

    // Node class
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to check if the key 'X' is present in the linked list
    public boolean search(Node head, int x) {
        // Base case: If head is null, X is not present
        if (head == null) {
            return false;
        }

        // If the current node contains X, return true
        if (head.data == x) {
            return true;
        }

        // Recur for the next node
        return search(head.next, x);
    }

    // Utility function to print the result
    public void printSearchResult(int x) {
        if (search(head, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Utility function to add a new node at the end of the list
    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }


}

