#pragma once
#include "headers.h"
#include "bits/stdc++.h"
using namespace std;

class postorder{
    TreeNode *root;
    vector<int>ans;

    public: postorder(TreeNode *root){
        this->root = root;
    }

    void traversePostOrder(TreeNode *root){
        TreeNode *temp = root;

        stack<TreeNode*> st;
        st.push(temp);

        while(!st.empty())
        {
            TreeNode *currNode  = st.top();
            st.pop();
            if(currNode==NULL)continue;
            ans.push_back(currNode->val);

            st.push(currNode->left);
            st.push(currNode->right);
        }

        reverse(ans.begin(),ans.end());

    }

    void print(){
        cout<<"postorder traversal : \t";
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