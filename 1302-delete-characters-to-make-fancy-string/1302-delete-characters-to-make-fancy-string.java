class Solution {
    public String makeFancyString(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int freq = 1;
        for(int i=1;i<len;i++){
            if(s.charAt(i) == sb.charAt(sb.length()-1)){
                sb.append(s.charAt(i));
                freq++;
            }else{
                sb.append(s.charAt(i));
                freq = 1;
            }
            if(freq>2){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}