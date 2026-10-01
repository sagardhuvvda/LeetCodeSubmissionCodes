class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        for(int price : prices){
            minValue = Math.min(minValue,price);
            maxValue = Math.max(maxValue,price - minValue);
        }
        return maxValue;
    }
}