#pragma once
#include "headers.h"

class constructtree{

    public: TreeNode *root;
    public: constructtree(){
        root = new TreeNode(1,NULL,NULL);
    }
    public: TreeNode* generateTree(){
        root->left= new TreeNode(2,NULL,NULL);
        root->right = new TreeNode(3,NULL,NULL);
        root->left->left= new TreeNode(4,NULL,NULL);
        root->left->right =  new TreeNode(5,NULL,NULL);
        root->right->left = new TreeNode(6,NULL,NULL);
        root->right->right = new TreeNode(7,NULL,NULL);
        root->left->left->left = new TreeNode(8,NULL,NULL);
        root->left->left->right = new TreeNode(9,NULL,NULL);
        root->left->right->left = new TreeNode(10,NULL,NULL);
        root->left->right->right = new TreeNode(11,NULL,NULL);
        root->right->left->left = new TreeNode(12,NULL,NULL);
        root->right->left->right = new TreeNode(13,NULL,NULL);
        root->right->right->left = new TreeNode(14,NULL,NULL);
        root->right->right->right = new TreeNode(15,NULL,NULL);
        return root;
    }

};