package trees.java.iterative;

public class construct_tree {
    public TreeNode constructTree(){
        TreeNode root = new TreeNode(1,null,null);
        root.left= new TreeNode(2,null,null);
        root.right = new TreeNode(3,null,null);
        root.left.left= new TreeNode(4,null,null);
        root.left.right =  new TreeNode(5,null,null);
        root.right.left = new TreeNode(6,null,null);
        root.right.right = new TreeNode(7,null,null);
        root.left.left.left = new TreeNode(8,null,null);
        root.left.left.right = new TreeNode(9,null,null);
        root.left.right.left = new TreeNode(10,null,null);
        root.left.right.right = new TreeNode(11,null,null);
        root.right.left.left = new TreeNode(12,null,null);
        root.right.left.right = new TreeNode(13,null,null);
        root.right.right.left = new TreeNode(14,null,null);
        root.right.right.right = new TreeNode(15,null,null);

        return root;
    }
}
