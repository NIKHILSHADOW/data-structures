package trees.java.iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class NodeInfo{
    
    TreeNode node;
    boolean visited;

    public NodeInfo(TreeNode node,boolean visited){
        this.node = node;
        this.visited = visited;
    }

}


public class inorder {
    List<Integer> ans ;
    TreeNode root;

    public inorder(TreeNode root){
        ans = new ArrayList<>();
        this.root = root;
    }

    public void traverseInOrder(TreeNode root){
        Stack<NodeInfo> st = new Stack<>();
        st.push(new NodeInfo(root, false));

        while(!st.isEmpty()){
            NodeInfo temp = st.peek();
            if(temp.node==null){
                st.pop();
                continue;
            }
            if(temp.visited){
                st.pop();
                ans.add(temp.node.val);
                st.push(new NodeInfo(temp.node.right, false));
            }else{
                temp.visited=true;
                st.push(new NodeInfo(temp.node.left, false));
            }
        }

    }

    public void print(){
        System.out.print("In order traversal : ");
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
