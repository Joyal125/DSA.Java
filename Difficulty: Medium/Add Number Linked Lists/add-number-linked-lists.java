/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node first, Node second) {
        first = removeLeadingZeros(first);
        second = removeLeadingZeros(second);

        first = reverse(first);
        second = reverse(second);

        int carry = 0;
        Node head = null, tail = null;

        while (first != null || second != null || carry != 0) {
            int sum = carry;
            if (first != null) {
                sum += first.data;
                first = first.next;
            }
            if (second != null) {
                sum += second.data;
                second = second.next;
            }

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        head = reverse(head);
        head = removeLeadingZeros(head);

        return head;
    }

    private Node reverse(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private Node removeLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        // if all were zeros, return a single 0 node
        return (head == null) ? new Node(0) : head;
    }
}
