class Solution {
    int helper(int[] nums , int i , int target , int len ,int sum , HashMap<String , Integer> map ){
        if(i==len-1){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        String key = String.valueOf(i)+'_'+String.valueOf(sum);
        if(map.containsKey(key)){
            return map.get(key);
        }

        int add = helper(nums , i+1 , target , len , sum+nums[i+1] , map );
        int sub = helper(nums , i+1 , target , len , sum-nums[i+1] , map );
        map.put(key , add+sub);
        return  add+sub;

    }

    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
        HashMap<String , Integer> map = new HashMap<>();
       
        
        return helper(nums ,0 , target , len , nums[0] , map) + helper(nums , 0 , target , len , -nums[0] , map) ;
    
        

        
    }
}