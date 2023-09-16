#pragma once

class inorder{
    TreeNode *root;
    vector<int>ans;

    public: inorder(TreeNode *root){
        this->root=root;
    }

    public: void traverseInOrder(TreeNode *root){
        if(!root)return;
        traverseInOrder(root->left);
        ans.push_back(root->val);
        traverseInOrder(root->right);
    }

    public: void print(){
        cout<<"inorder traversal :\t";
        for(int i:ans){
            cout<<i<<" ";
        }
        cout<<"\n";
    }

    public: void operation(){
        traverseInOrder(root);
        print();
    }

};