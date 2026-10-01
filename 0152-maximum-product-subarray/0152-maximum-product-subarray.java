class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int priPro = 1;
        int sufPro = 1;  
        for(int i =0;i<n;i++){
            priPro *= nums[i];
            sufPro*= nums[n-i-1];
            max = Math.max(max,Math.max(priPro,sufPro));
            if(priPro==0)priPro=1;
            if(sufPro==0)sufPro=1;
        }
        return max;
    }
}