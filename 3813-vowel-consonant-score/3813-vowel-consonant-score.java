class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0; 
        int c= 0;
        for(char ch :s.toCharArray()){
            if(!Character.isLetter(ch)){
                continue;
            }
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v++;
            }else{
                c++;
            }
        }
        int result = (c==0)?0:v/c;
        return result;
    }
}