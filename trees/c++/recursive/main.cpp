#include "helper.h"


int main()
{
    freopen("output.txt","w",stdout);
    constructTree *tree = new constructTree();
    tree->generateTree();
    TreeNode *root = tree->root;

    preorder *preOrder = new preorder(root);
    preOrder->operation();

    postorder *postOrder = new postorder(root);
    postOrder->operation();

    inorder *inOrder = new inorder(root);
    inOrder->operation();
}