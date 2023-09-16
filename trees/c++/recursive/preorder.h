#pragma once
#include "helper.h"
#include<bits/stdc++.h>

using namespace std;


class preorder {

    vector<int> ans ;
    TreeNode *root;


    public: preorder(TreeNode *root){
        this->root = root;
    }

    public: void traversePreOrder(TreeNode *root){
        if(!root)return ;
        ans.push_back(root->val);
        traversePreOrder(root->left);
        traversePreOrder(root->right);
    }

    public: void print(){
        cout<<"PreOrder traversal :\t";
        for(int i:ans){
            cout<<i<<" ";
        }
        cout<<"\n";
    }

    public: void operation(){
        traversePreOrder(root);
        print();
    }

};