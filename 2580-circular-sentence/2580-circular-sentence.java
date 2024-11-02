class Solution {
    public boolean isCircularSentence(String sentence) {
        int len = sentence.length();
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(len-1);
        boolean res = true;
        for(int i=1;i<len-1;i++){
            if(sentence.charAt(i) == ' ')
            if( sentence.charAt(i-1) != sentence.charAt(i+1)){
                res = false;
                break;
            }
        }
        if(res == true && firstChar == lastChar ){
            return true;
        }
        return false;

        
    }
}