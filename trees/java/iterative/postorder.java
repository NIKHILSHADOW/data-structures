package trees.java.iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorder {
    List<Integer> ans ;
    TreeNode root;

    public postorder(TreeNode root){
        ans = new ArrayList<>();
        this.root = root;
    }

    public void traversePostOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            if(node == null)continue;
            temp.push(node.val);
            st.push(node.left);
            st.push(node.right);
        }

        while(!temp.isEmpty()){
            ans.add(temp.pop());
        }
    }

    public void print(){
        System.out.print("Post Order traversal : ");
        for(int i:ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void operation(){
        traversePostOrder(root);
        print();
    }

}
