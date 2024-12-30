class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int dp[] = new int [high+1];
        dp[0] = 1;
        int Mod = 1000000007;
        for(int i=1;i<=high;i++){
            if(i-zero>=0){
                dp[i] = (dp[i]%Mod + dp[i-zero]%Mod)%Mod;
            }
            if(i-one>=0){
                dp[i] = (dp[i]%Mod+dp[i-one]%Mod)%Mod;
            }
            
        }
        int res=0;
        for(int i=low;i<=high;i++){
            res= (res%Mod + dp[i]%Mod)%Mod;

        }
        return res;
        
    }
}