/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
        
    }
    public Node build(int[] nums , int left, int right){
        if(left>right) return null;
        
        int mid = left+(right-left)/2;
        
        Node root = new Node(nums[mid]);
        
        root.left = build(nums,left, mid-1);
        root.right = build(nums,mid+1,right);
        return root;
    }
}