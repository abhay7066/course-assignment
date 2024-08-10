package LinkedListSolution;

/*
Q5. Given two numbers represented by two lists, write a function that returns the sum list. The
sum list is a list representation of the addition of two input numbers.
 */
public class Question5 {



        public static void main(String[] args) {
            LinkedList5 firstList = new LinkedList5();
            LinkedList5 secondList = new LinkedList5();

            firstList.append(7);
            firstList.append(5);
            firstList.append(9);
            firstList.append(4);
            firstList.append(6);

            secondList.append(8);
            secondList.append(4);

            LinkedList5 result = firstList.addTwoLists(firstList.head, secondList.head);

            System.out.println("First List:");
            firstList.printList();

            System.out.println("Second List:");
            secondList.printList();

            System.out.println("Resultant List:");
            result.printList();
        }
    }


class LinkedList5 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public LinkedList5 addTwoLists(Node first, Node second) {
        first = reverse(first);
        second = reverse(second);

        Node result = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        while (first != null || second != null) {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;

            temp = new Node(sum);

            if (result == null) {
                result = temp;
            } else {
                prev.next = temp;
            }

            prev = temp;

            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                
                second = second.next;
            }
        }

        if (carry > 0) {
            temp.next = new Node(carry);
        }

        result = reverse(result);

        LinkedList5 resultList = new LinkedList5();
        resultList.head = result;
        return resultList;
    }

    private Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
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
