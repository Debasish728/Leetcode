class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int lowCount = 1;
        int highCount = 1;
        int maxHigh = 1;
        int maxLow = 1;
        for(int i = 0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                lowCount++;
                maxLow = Math.max(maxLow,lowCount);
            }else{
                lowCount = 1;
            }
            if(nums[i]>nums[i+1]){
                highCount++;
                maxHigh = Math.max(maxHigh,highCount);
            }else{
                highCount = 1;
            }

        }
        return (Math.max(maxLow,maxHigh));
        
    }
}