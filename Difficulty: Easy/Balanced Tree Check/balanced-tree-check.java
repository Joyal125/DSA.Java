/*
class Node {
    int data;
    Node left, right;
 
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        if(root == null) return true;
        
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        if(Math.abs(leftlevels - rightlevels)>1) return false;
        return isBalanced( root.left) && isBalanced( root.right);
    
        
    }
    public int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left), levels(root.right));
    }
}