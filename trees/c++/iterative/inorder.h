#pragma once
#include "headers.h"
#include "bits/stdc++.h"
using namespace std;

class NodeInfo{
    public :
    TreeNode *root;
    bool isVisited;

    public: NodeInfo(TreeNode *root){
        this->root=root;
        this->isVisited = false;
    }

};

class inorder {
    vector<int>ans;
    TreeNode *root;

    public: inorder(TreeNode *root){
        this->root = root;
    }

    void traverseInOrder(TreeNode *root){
        stack<NodeInfo*> st;
        st.push(new NodeInfo(root));
        while(!st.empty())
        {
            NodeInfo *temp = st.top();
            if(temp->root==NULL){st.pop();continue;}
            if(temp->isVisited){
                st.pop();
                ans.push_back(temp->root->val);
                st.push(new NodeInfo(temp->root->right));
            }else{
                st.top()->isVisited=true;
                st.push(new NodeInfo(temp->root->left));
            }
        }
    }

    void print(){
        cout<<"Inorder traversal : \t";
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