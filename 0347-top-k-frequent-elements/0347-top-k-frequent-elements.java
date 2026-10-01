class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int [] arr = new int[k];
        for(int i =0;i<k;i++){
            int maxValue =0;
            int maxKey=0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>maxValue){
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }

            }
            arr[i]=maxKey;
            map.remove(maxKey);
        }
        return arr;
    }
}