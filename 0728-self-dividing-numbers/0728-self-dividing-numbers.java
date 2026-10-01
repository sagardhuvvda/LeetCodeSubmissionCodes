class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left ; i<=right;i++){
            int n = i;
            boolean isTrue = true;
            while(n>0){
                int digit = n%10;
                if(digit==0||i%digit!=0){
                    isTrue = false;
                    break;
                }
                n/=10;
            }
            if(isTrue){
                list.add(i);
            }
        }
        return list;
    }
}