#pragma once
class TreeNode{
    public :
    int val;
    TreeNode *left;
    TreeNode *right;

    public: TreeNode(int val, TreeNode *left, TreeNode *right){
        this->val=val;
        this->left=left;
        this->right=right;
    }
};