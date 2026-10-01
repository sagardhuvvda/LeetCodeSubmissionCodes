/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    int *output=(int *)malloc(100*sizeof(int ));
        int j=0;
    void my_inorder(struct TreeNode *root){
        
      if(root!=NULL)
      {
         output[j++]=root->val;
        my_inorder(root->left);
        my_inorder(root->right);
      }
    }
    my_inorder(root);
    *returnSize=j;
    return output;
}
