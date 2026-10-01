/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 int get_successor(struct TreeNode *current )
 {
    struct TreeNode *temp = current;
    while(temp->left!=NULL)
    {
        temp=temp->left;
    }
    return temp->val;
 }
struct TreeNode* deleteNode(struct TreeNode* root, int key) {
    if(root ==NULL)return NULL;
    else if(root ->val>key)
    {
        root->left=deleteNode(root->left ,key);
    }
    else if(root->val < key)
    {
        root ->right =deleteNode(root->right,key);
    }
    else
    {
        if(root->left==NULL&&root->right ==NULL)
        {
            free(root);
            return NULL;
        }
        else if (root->left ==NULL||root ->right ==NULL)
        {
            struct TreeNode *temp;
            if(root->left ==NULL)
            {
                temp=root->right;

            }
            else
            {
                temp=root->left;
            }
            free(root);
            return temp;
        }
        else {
            int in_successor=get_successor(root->right);
            root ->val=in_successor;
            root->right = deleteNode(root->right , in_successor);
        }
    }
    return root;
}