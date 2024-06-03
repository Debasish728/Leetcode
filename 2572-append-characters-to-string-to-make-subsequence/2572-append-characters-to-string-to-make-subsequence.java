class Solution {
    public int appendCharacters(String s, String t) {
        int n = t.length();
        int tlen = n;
        int slen = s.length();
        int si = 0;
        int ti = 0;
        while(si< slen && ti < tlen){
            if(s.charAt(si) != t.charAt(ti)){
                si++;
            }else{
                si++;
                ti++;
                n--;
            }
        }
        return n;
        
    }
}