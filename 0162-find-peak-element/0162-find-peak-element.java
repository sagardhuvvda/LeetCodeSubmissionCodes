class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0; 
        int h = n-1;
        int k = 0;
        while(l<=h){
            int m = l+(h-l)/2;
            k=m;
            if(m+1<n&&nums[m]<nums[m+1]){
                l=m+1;
            }else if(m>0&&nums[m]<nums[m-1]){
                h=m;
            }else{
                return m;
            }
        }
        return k;
    }
}