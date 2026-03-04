class Solution {
    public static void flatten(Node root) {
        if(root == null) return;

        Node lst = root.left;
        Node Rst = root.right;

        root.left = null;

        flatten(lst);
        flatten(Rst);

        root.right = lst;

        Node last = root;

        while(last.right != null){
            last = last.right;
        }

        last.right = Rst;
    }
}