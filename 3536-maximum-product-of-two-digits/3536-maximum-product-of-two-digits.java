class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while(n>0){
           int r = n%10;
           list.add(r);
           n/=10;
        }
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        int k = list.size();
         Collections.sort(list);
        int result = list.get(k-1)*list.get(k-2);
        return result;
    }
}