public class BinaryTree{
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

    static class BinaryTree1{
        static int idx = -1;
        public static Nodes BuildTree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }
Nodes newNodes = new Nodes (Nodes[idx]);
            newNodes.left = BuildTree(Nodes);
            newNodes.right = BuildTree(Nodes);
            return newNodes;
        }
    }
    public static void main (String[]args){
        int Node[] = {1,2,4,-1,-1,5,-1,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Nodes root = BinaryTree1.BuildTree(Node);
        System.out.println(root.data);
    }
}
