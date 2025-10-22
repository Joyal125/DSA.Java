class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null; // important check

        ListNode i = head;
        ListNode j = head.next;  // start from next node

        while (j != null) {
            if (i.val == j.val) {
                j = j.next; // skip duplicate
            } else {
                i.next = j; // link to next unique node
                i = j;      // move i forward
                j = j.next; // move j forward
            }
        }

        i.next = null; // terminate the list properly
        return head;
    }
}

