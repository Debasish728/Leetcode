class Solution {
    public int scoreOfString(String s) {
        int len = s.length();
        int res=0;
        for(int i=0;i<len-1;i++){
            int j=i+1;
            res+=Math.abs(s.charAt(i)-s.charAt(j));

        }
        return res;
    }
}