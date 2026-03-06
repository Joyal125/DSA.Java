/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Solution {
    public static int treePathsSum(Node root) {
        return dfs(root,0);
    }
    public static int dfs(Node node , int nums){
        if(node==null)return 0;
        
        nums = nums*10+node.data;
        
        if(node.left == null && node.right == null) return nums;
        
        return dfs(node.left,nums) +dfs(node.right,nums);
    }
}