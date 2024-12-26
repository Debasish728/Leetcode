class Solution {
    int helper(int[] nums , int i , int target , int len ,int sum ){
        if(i==len-1){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }

        int add = helper(nums , i+1 , target , len , sum+nums[i+1] );
        int sub = helper(nums , i+1 , target , len , sum-nums[i+1] );
        return add+sub;

    }

    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
       
        
        return helper(nums ,0 , target , len , nums[0]) + helper(nums , 0 , target , len , -nums[0]) ;
    
        

        
    }
}