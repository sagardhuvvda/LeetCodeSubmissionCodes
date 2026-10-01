class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int i = n/2;
        long t = 0;
        long leftsum = 0;
        for(int j = 0;j<i;j++){
            leftsum += nums[j];
        }
        for(int num : nums){
            t+=num;
        }
        int count = 0;
        for(int k = 0; k<n;k++){
            long rightsum = t-leftsum;
            if(leftsum>rightsum){
                count++;
            }
            if(k < n-1){
                leftsum -=nums[k];
                leftsum +=nums[(k+i)%n];
            }
        }
        return count;
    }
}