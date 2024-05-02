class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
           map.put(nums[i] , i);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(map.containsKey(0-nums[i])){
                max = Math.max(max ,nums[i]);

            }
        }
        return max==Integer.MIN_VALUE?-1:max;
        
        
    }
}