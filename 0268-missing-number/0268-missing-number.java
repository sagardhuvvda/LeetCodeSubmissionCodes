class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        int k = nums.length;
        int actualSum = (k*(k+1))/2;
        return actualSum-sum;
    }
}