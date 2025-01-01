class Solution {
    
    int solve(int idx , int[] cost ,int[] memo){
        
        if(idx>=cost.length){
            return 0;
        }
        if(memo[idx] != -1){
            return memo[idx];
        }
        int oneStepCost = cost[idx]+solve(idx+1 , cost  , memo);
        int twoStepCost = cost[idx]+solve(idx+2 , cost  , memo);
         memo[idx] = Math.min(oneStepCost , twoStepCost);
         return memo[idx];
    }
    public int minCostClimbingStairs(int[] cost) {
        int memo[] = new int[cost.length+1];
        Arrays.fill(memo , -1);

        return Math.min(solve(0,cost  , memo) , solve(1,cost  , memo));
        
    }
}