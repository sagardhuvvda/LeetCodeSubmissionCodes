class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0;
        int r =0;
        int n = nums.length;
        int min =Integer.MAX_VALUE;
        int sum = 0;
        int cur = 0;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                cur = sum;
                min = Math.min(min,r-l+1);
                sum -=nums[l];
                l++;
            }
            r++;
        }
        if(cur<target) return 0;
        else return min;
    }
}