// BinaryTree PreOrder Code

public class BinaryTree1 {
    static class Nodes {
        int data;
        Nodes left;
        Nodes right;

        Nodes(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree3{
        static int idx = -1;
        public static Nodes BuildTree(int arr[]){
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            Nodes newNodes =  new Nodes(arr[idx]);
            newNodes.left = BuildTree(arr);
            newNodes.right = BuildTree(arr);
            return newNodes;
        }
        public static void Preorder(Nodes root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
        public static void main(String[]args){
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

            Nodes root = BinaryTree3.BuildTree(nodes);
           BinaryTree3.Preorder(root);

        }
    }
}
