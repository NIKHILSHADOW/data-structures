package trees.java.recursive;

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

        postorder postOrder = new postorder(root);
        postOrder.operation();

        inorder inOrder = new inorder(root);
        inOrder.operation();

        preorder preOrder = new preorder(root);
        preOrder.operation();

    }
}
