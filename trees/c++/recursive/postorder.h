#pragma once

class postorder{
    vector<int>ans;
    TreeNode *root;

    public: postorder(TreeNode *root){
        this->root=root;
    }

    public: void traversePostOrder(TreeNode *root){
        if(!root)return ;
        traversePostOrder(root->left);
        traversePostOrder(root->right);
        ans.push_back(root->val);
    }

    public: void print(){
        cout<<"Postorder traversal :\t";
        for(int i:ans){
            cout<<i<<" ";
        }
        cout<<"\n";
    }

    public: void operation(){
        traversePostOrder(root);
        print();
    }

};