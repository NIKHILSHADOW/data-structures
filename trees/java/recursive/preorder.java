package trees.java.recursive;

import java.util.ArrayList;
import java.util.List;

public class preorder{
    List<Integer> ans;
    TreeNode root;


    public preorder(TreeNode root){
        ans = new ArrayList<>();
        this.root = root;
    }
    public void traversePreOrder(TreeNode root){
        if(root == null)return ;
        ans.add(root.val);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void print(){
        System.out.print("Preorder traversal : ");
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void operation(){
        traversePreOrder(root);
        print();
    }

}