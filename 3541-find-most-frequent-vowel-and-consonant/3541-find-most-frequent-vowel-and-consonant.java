class Solution {
    public int maxFreqSum(String s) {
        int []fre = new int[26];
        for(char ch:s.toCharArray()) fre[ch-'a']++;
        int vmax = 0;
        int cmax = 0;
        for(int i =0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20) vmax=Math.max(vmax,fre[i]);
            else cmax = Math.max(cmax,fre[i]);
        }return vmax+cmax;
    }
}