package trees.java.recursive;

import java.util.ArrayList;
import java.util.List;

public class inorder {

    List<Integer> ans ;
    TreeNode root ;

    public inorder(TreeNode root){
        ans = new ArrayList<>();
        this.root = root;
    }

    public void traverseInOrder(TreeNode root){
        if(root == null)return ;
        traverseInOrder(root.left);
        ans.add(root.val);
        traverseInOrder(root.right);
    }

    public void print(){
        System.out.print("inorder traversal : ");
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void operation(){
        traverseInOrder(root);
        print();
    }

}
