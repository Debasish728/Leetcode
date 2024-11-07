class Solution {
    public int largestCombination(int[] candidates) {
        int len = 24;
        int maxCombination = 0;
        if(candidates.length == 1){
            return 1;
        }
        for(int i=0;i<len;i++){
            int count = 0;
            for(int j=0;j<candidates.length;j++){
                if((candidates[j]&(1<<i)) != 0){
                    count++;
                }


            }
            maxCombination = Math.max(maxCombination , count);


        }
        return maxCombination;
        
    }
}