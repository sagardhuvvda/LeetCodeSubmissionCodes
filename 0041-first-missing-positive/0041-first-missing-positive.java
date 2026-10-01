class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            set.add(nums[i]);
        }
        int ans  = 1;
        for(int i = 0;i<set.size()+1;i++){
            if(set.contains(ans)){
                ans++;
            }
        }
        return ans;
    }
}