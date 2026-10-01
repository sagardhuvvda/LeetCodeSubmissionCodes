class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] fq = new int[101];
        for(int num : nums){
            fq[num]++;
        }
        int[]arr = new int [nums.length];
        int i = 0;
        while(i<nums.length){
            for(int j= 1;j<=100;j++){
                if(fq[j]>0){
                    arr[i++]=j;
                    fq[j]--;
                }
            }
        }
        return arr;
    }
}