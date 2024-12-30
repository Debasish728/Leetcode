class Solution {
    int l , h , z , o;
    int Mod = 1000000007;
    int solve(int len , int memo[]){
        if(len>h){
            return 0;
        }
        if(memo[len] != -1){
            return memo[len];
        }
        boolean addOne = false;
        if(len>=l){
            addOne = true;
        }
        int takeZero = solve(len+z , memo);
        int takeOne = solve(len+o , memo);
        memo[len] =  ((addOne ? 1:0)+takeZero+takeOne);
        memo[len] = memo[len]%Mod;
        return memo[len];

        }
    public int countGoodStrings(int low, int high, int zero, int one) {
        l = low;
        h = high ;
        z = zero;
        o = one;
        int memo[] = new int[high+1];
        Arrays.fill(memo , -1);
        return solve(0,memo);
        
    }
}