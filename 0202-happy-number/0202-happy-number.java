import java.util.HashSet;
class Solution {
    static int SquareSum(int n ){
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum += r*r;
            n /=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            n = SquareSum(n);
        }
        return n==1;
    }
}