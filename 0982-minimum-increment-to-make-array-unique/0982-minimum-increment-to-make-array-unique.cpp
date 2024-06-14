class Solution {
public:
    int minIncrementForUnique(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int minMoves=0,prev=nums[0];
        for(int i=1;i<nums.size();i++){
            if(prev>=nums[i]){
                minMoves+=prev+1-nums[i];
                nums[i]=prev+1;
            }
            prev=nums[i];
        }
        return minMoves;
    }
};