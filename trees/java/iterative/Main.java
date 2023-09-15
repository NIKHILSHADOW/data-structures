package trees.java.iterative;

class TreeNode{
    TreeNode left;
    int val;
    TreeNode right;
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
};



public class Main {
    public static void main(String[] args){
        construct_tree tree = new construct_tree();
        TreeNode root = tree.constructTree();

        inorder inOrder = new inorder(root);
        inOrder.operation();

        postorder postOrder = new postorder(root);
        postOrder.operation();

        preorder preOrder = new preorder(root);
        preOrder.operation();

    }
}
