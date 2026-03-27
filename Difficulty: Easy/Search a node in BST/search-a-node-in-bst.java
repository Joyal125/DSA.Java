class Solution {
    public boolean search(Node root, int key) {
        while (root != null) {
            if (root.data == key)
                return true;
            
            if (key < root.data)
                root = root.left;
            else
                root = root.right;
        }
        return false;
    }
}