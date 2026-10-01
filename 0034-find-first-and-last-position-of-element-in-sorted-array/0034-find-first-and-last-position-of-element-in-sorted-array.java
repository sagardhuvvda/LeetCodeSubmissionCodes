class Solution {
    public int FindFirst(int [] nums,int target){
        int l = 0;
        int h = nums.length-1;
        int ans = -1;
        while(l<=h){
            int m = (l+h)/2;
            if(nums[m]==target){
                ans = m;
                h = m-1;
            }else if(nums[m]<target){
                l = m +1;
            }else{
                h = m-1;
            }
        }return ans;
    }
    public int FindLast(int [] nums,int target){
        int l = 0;
        int h = nums.length-1;
        int ans = -1;
        while(l<=h){
            int m = (l+h)/2;
            if(nums[m]==target){
                ans = m;
                l=m+1;
            }else if(nums[m]<target){
                l = m +1;
            }else{
                h = m-1;
            }
        }return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = FindFirst(nums,target);
        int last = FindLast(nums,target);
        return new int[]{first,last};
    }
}