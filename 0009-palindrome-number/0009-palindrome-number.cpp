class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)return 0;
        long long rev=0;
        long long tem=x;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x/=10;
        }
        return rev==tem;
    }
};