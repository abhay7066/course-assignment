package LinkedListSolution;
/*
Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 */
public class Question4 {

        public static void main(String[] args) {
            LinkedList4 list = new LinkedList4();

            list.append(1);
            list.append(2);
            list.append(3);
            list.append(2);
            list.append(1);

            System.out.println(list.isPalindrome());  // Output: true
        }
    }
class LinkedList4 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head, fast = head;
        Node prevSlow = null, midNode = null;
        Node secondHalf, prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }

        if (fast != null) {
            midNode = slow;
            slow = slow.next;
        }

        secondHalf = slow;
        prevSlow.next = null;

        secondHalf = reverse(secondHalf);

        boolean result = compareLists(head, secondHalf);

        secondHalf = reverse(secondHalf);

        if (midNode != null) {
            prevSlow.next = midNode;
            midNode.next = secondHalf;
        } else {
            prevSlow.next = secondHalf;
        }

        return result;
    }

    private Node reverse(Node node) {
        Node prev = null, current = node, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private boolean compareLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return (temp1 == null && temp2 == null);
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
