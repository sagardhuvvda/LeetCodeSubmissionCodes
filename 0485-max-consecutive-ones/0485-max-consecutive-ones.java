class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
       ArrayList<Integer> List= new ArrayList<>(); 
        for(int a:nums){
            if(a==1){
                count++;
                List.add(count);
            }
            else{ 
                count =0;
            }
        }
        if(!List.isEmpty()){
            int max = Collections.max(List);
            return max;
        }
        return count;
    }
}