# TREES
* It is hierarchical data structure.
* The connections are called with parent-child relatioship.
```
             7
           /    \
          6       5
        /   \   /   \
       3    4  67    9
      /
    5566
```

* Here we consider **7** the starting point of the tree. We call it root node of the tree.
* The nodes below **7** **6** , **5** are the children of the **7**. **7** is called parent.


**Root** : It is the starting point of tree. Root has no parent.
**Leaf** : It is the one of the ending point of tree. Leaves have no children.
**Edge** : It is the connection between two nodes. There will be **n-1** edges for **n** nodes.

```
- Height of node : Distance from the node to the farthest reachable leaf node from this node.
Eg : In the above for 7 farthest reachable node is 5566, so height is distance between them is 3

height(7) : 3(leaf - 5566)
height(6) : 2(5566)
height(3) : 1(5566)
height(4) : 0(4)
height(5) : 1(67 or 9)
height(67) : 0(67)
height(9) : 0(9)

- Height of Tree : It is the height of the root node.
Eg : In the above tree height is 3(root - 7).

- Depth of node : Distance from root node.
```

* **Depth of tree is not defined because it is not the maximum/minimum. So it is defined only for each node.**

* Tree with atmost three children is called ternary tree.
* Tree with atmost two children is called binary tree.


Binary Tree : 
Tree with maximum 2 nodes.

structure of binary tree
```
class TreeNode  {
    int val;
    TreeNode left;
    TreeNode right;
}

```

Visiting node requires some order traversal.
The most common traversals
1. Pre order - DFS 
2. Post order - DFS
3. In order - DFS
4. Level order - BFS
**Left node is visited before right node**

* **Pre order** : Root, Left, Right
* **In order** : Left, Root, Right
* **Post order** : Left, Right, Root

![Tree](/trees/static/tree-img-0.png)

* Pre order : 1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 13, 7, 14
* In order : 8, 4, 9, 2, 10, 5, 11, 1, 6, 13, 3, 14, 7
* Post order : 8, 9, 4, 10, 11, 5, 2, 13, 6, 14, 7, 3, 1

**Pre order**
```
void preOrder(TreeNode *root) {
    //  root is null mean no node present so do nothing just get out 
    if(root==NULL)return ;
    
    // if node is present first print then visit left and right
    print(root->val);
    preOrder(root->left);
    preOrder(root->right);
    return ;
}

```

**Post Order**
```
void postOrder(TreeNode* root){
    // root node should be after left and right
    if(root==NULL)return ;

    postOrder(root->left);
    postOrder(root->right);

    print(root->data)
    return ;
}
```

**In order**
```
void inOrder(TreeNode* root){
    if(root == NULL)return;

    // root node should be printed after its left sub tree and before right sub tree

    inOrder(root->left);

    print(root->val);

    inOrder(root->right);
}
```
* Skewed Tree : It is tree which is unbalanced. It will have all nodes either to left of root or right of root.
* TC : O(n)
* SC : O(n)
