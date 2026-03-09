/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int x) {
        if(root==null) return false;
        if(root.data==x) return true;
        else if(root.data>x)return search(root.left,x);
        else return search(root.right,x);
        
        
        
        
    }
}