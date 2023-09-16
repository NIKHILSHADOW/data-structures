#pragma once
#include "headers.h"
#include "bits/stdc++.h"
using namespace std;

class preorder {
    TreeNode *root;
    vector<int>ans;

    public: preorder(TreeNode *root){
        this->root=root;
    }

    void traversePreOrder(TreeNode *root){
        TreeNode *temp = root;
        stack<TreeNode*> st;
        st.push(root);
        while(!st.empty()){
            TreeNode *temp = st.top();
            st.pop();
            if(temp==NULL){
                continue;
            }

            ans.push_back(temp->val);

            st.push(temp->right);
            st.push(temp->left);

        }
        root=temp;
    }

    void print(){
        cout<<"Preorder traversal :\t";
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