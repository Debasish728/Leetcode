class Solution {
    int helper(int[] nums , int i , int target , int len ,int sum , int[][] memo , int s ){
        if(i==len-1){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        if(memo[i][sum+s] != 0){
            return memo[i][sum+s];
        }

        int add = helper(nums , i+1 , target , len , sum+nums[i+1] , memo , s );
        int sub = helper(nums , i+1 , target , len , sum-nums[i+1] , memo , s );
        
        return  memo[i][sum+s] = add+sub;

    }

    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
        HashMap<String , Integer> map = new HashMap<>();
        int s = 0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        int memo[][] = new int[len+1][s+s+1];
       
        
        return helper(nums ,0 , target , len , nums[0] , memo , s) + helper(nums , 0 , target , len , -nums[0] , memo , s) ;
    
        

        
    }
}