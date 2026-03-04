/*
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        while (root != null) {
            if (n1 < root.data && n2 < root.data)
                root = root.left;
            else if (n1 > root.data && n2 > root.data)
                root = root.right;
            else
                return root;
        }
        return null;
    }
}
