class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        int right=0;
        int left=0;
        int winCount = 0;
        int maxCount = 0;
        Arrays.sort(nums);
        while(right<n){
            while(right<n && (nums[right]-nums[left]<=2*k)){
                winCount++;
                right++;
            }
            maxCount = Math.max(winCount,maxCount);
            if(right == n) break;
            while(left<=right && (nums[right]-nums[left]>2*k)){
                winCount--;
                left++;
            }

        }
        return maxCount;
        
    }
}