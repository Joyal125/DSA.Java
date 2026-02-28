/* Node of a linked list
 class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}
*/

class Solution {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        // Your code here
        System.out.print(head.data+" ");
        Node temp = head.next;
        
        while(temp!= head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}