class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode smallHead = new ListNode(0);
        ListNode bigHead = new ListNode(0);

        ListNode small = smallHead;
        ListNode big = bigHead;

        while(head != null) {
            if(head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }

        big.next = null;          // end big list
        small.next = bigHead.next; // connect lists

        return smallHead.next;
    }
}