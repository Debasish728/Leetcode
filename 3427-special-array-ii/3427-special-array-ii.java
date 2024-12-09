class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int prefixSum[] = new int[nums.length];
        boolean res[] = new boolean[queries.length];
        Arrays.setAll(prefixSum , i->1);
        for(int i=1;i<nums.length;i++){
            if((nums[i-1]&1) != (nums[i]&1)){
                prefixSum[i]+=prefixSum[i-1];
            }
        }
        for(int i=0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int diff = (r-l)+1;
            if(prefixSum[r]>=diff){
                res[i] = true;
            }else if(prefixSum[r]<diff){
                res[i] = false;
            }

        }

        return res ;
        
    }
}