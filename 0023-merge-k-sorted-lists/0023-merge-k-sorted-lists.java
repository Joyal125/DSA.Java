import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min-heap to store all node values
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 1: Add all nodes' values into heap
        for (ListNode list : lists) {
            while (list != null) {
                minHeap.add(list.val);
                list = list.next;
            }
        }

        // Step 2: Create dummy node for the merged list
        ListNode dummy = new ListNode(-1);
        ListNode merge = dummy;

        // Step 3: Build sorted merged list from heap
        while (!minHeap.isEmpty()) {
            merge.next = new ListNode(minHeap.remove());
            merge = merge.next;
        }

        // Step 4: Return merged sorted list
        return dummy.next;
    }
}
