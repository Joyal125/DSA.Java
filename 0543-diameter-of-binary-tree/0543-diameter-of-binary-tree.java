class Solution {

    int max = 0;   // stores maximum diameter

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        // Update diameter
        max = Math.max(max, left + right);

        // Return height
        return 1 + Math.max(left, right);
    }
}