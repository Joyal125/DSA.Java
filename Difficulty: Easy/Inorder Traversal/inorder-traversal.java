/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    
    ArrayList<Integer> inOrder(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;
    
    }
    
    
    
         void dfs(Node root  , ArrayList<Integer> ans){
        if(root == null) return;
        
        
        dfs(root.left,ans);
        ans.add(root.data);
        dfs(root.right,ans);
    

    
    
        
    }
}