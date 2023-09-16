#include "headers.h"

int main()
{

    freopen("output.txt","w",stdout);
    constructtree *tree = new constructtree();
    tree->generateTree();

    TreeNode *root = tree->root;

    preorder *preOrder = new preorder(root);
    preOrder->operation();

    inorder *inOrder = new inorder(root);
    inOrder->operation();

    postorder *postOrder = new postorder(root);
    postOrder->operation();


}
