/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    struct ListNode *temp=head;
    int count =0;
    while(temp!=NULL)
    {
        count++;
        temp=temp->next;
    }
    int sum=0;
     struct ListNode *temp1=head;
  while(temp1!=NULL)
  {
    sum+=temp1->val*pow(2,--count);
    temp1= temp1->next;
  }
    return sum;
}