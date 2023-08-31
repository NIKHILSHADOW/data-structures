# TREES
* It is hierarchical data structure.
* The connections are called with parent-child relatioship.

             7
           /    \
          6       5
        /   \   /   \
       3    4  67    9
      /
    5566

* Here we consider **7** the starting point of the tree. We call it root node of the tree.
* The nodes below **7** **6** , **5** are the children of the **7**. **7** is called parent.


**Root** : It is the starting point of tree. Root has no parent.
**Leaf** : It is the one of the ending point of tree. Leaves have no children.
**Edge** : It is the connection between two nodes. There will be **n-1** edges for **n** nodes.

```
* Height of node : Distance from the node to the farthest reachable leaf node from this node.
Eg : In the above for 7 farthest reachable node is 5566, so height is distance between them is 3
height(7) : 3(leaf - 5566)
height(6) : 2(5566)
height(3) : 1(5566)
height(4) : 0(4)
height(5) : 1(67 or 9)
height(67) : 0(67)
height(9) : 0(9)

* Height of Tree : It is the height of the root node.
Eg : In the above tree height is 3(root - 7).
```