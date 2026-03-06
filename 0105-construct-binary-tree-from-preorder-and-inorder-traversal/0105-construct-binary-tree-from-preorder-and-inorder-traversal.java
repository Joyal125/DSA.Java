/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
        
    }
    public TreeNode build(int[] preorder, int[] inorder,int left,int right){
        if(left>right) return null;
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        int index = 0;
        for(int i = left; i<=right; i++){
            if(inorder[i]==rootVal){
                index = i;
                break;
            
            }
        }

        root.left = build(preorder,inorder , left, index-1);
        root.right = build(preorder,inorder , index+1, right);

        return root;
    }
}