package trees.java.iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorder {
    List<Integer> ans;
    TreeNode root ;

    public preorder(TreeNode root){
        ans = new ArrayList<>();
        this.root = root;
    }

    public void traversePreOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            if(node == null)continue;
            ans.add(node.val);
            st.push(node.right);
            st.push(node.left);
        }
    }

    public void print(){
        System.out.print("Pre order traversal : ");
        for(int i:ans){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public void operation(){
        traversePreOrder(root);
        print();
    }


}
