class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0;i<=(int)Math.sqrt(c);i++){
            int bSquare = c-(i*i);
            int b = (int)Math.sqrt(bSquare);
            if(bSquare == b*b){
                return true;
            }
        }
        return false;
        
    }
}