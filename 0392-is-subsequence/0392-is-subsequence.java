class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int j = 0;
        for(int i=0;i<n2;i++){
            if(j<n1 && (t.charAt(i) == s.charAt(j))){
                j++;
            }
        }
        return j==n1;
        
    }
}