class Solution {
    public static void flatten(TreeNode root) {
        if(root == null) return;

        TreeNode lst = root.left;
        TreeNode Rst = root.right;

        root.left = null;

        flatten(lst);
        flatten(Rst);

        root.right = lst;

        TreeNode last = root;

        while(last.right != null){
            last = last.right;
        }

        last.right = Rst;
    }
}