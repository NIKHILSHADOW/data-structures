package trees.java.recursive;

import java.util.ArrayList;
import java.util.List;

public class postorder {
    List<Integer> ans;
    TreeNode root;

    public postorder(TreeNode root){
        ans = new ArrayList<>();
        this.root = root;
    }

    public void traversePostOrder(TreeNode root){
        if(root == null)return ;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        ans.add(root.val);
    }

    public void print(){
        System.out.print("Post order traversal : ");
        for(int i:ans){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public void operation(){
        traversePostOrder(root);
        print();
    }
}
