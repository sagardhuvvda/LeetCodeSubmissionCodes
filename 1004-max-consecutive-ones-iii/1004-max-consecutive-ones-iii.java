class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        for(int i = 0; i<n;i++){
            int zeros = 0;
            int len = 0;
            for(int j = i;j<n;j++){
                if(nums[j]==0){
                    zeros++;
                }
                if(zeros<=k){
                    len++;
                max = Math.max(max,len);
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}

