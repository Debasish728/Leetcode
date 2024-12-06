class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>set = new HashSet<>();
        for(int num : banned){
            set.add(num);
        }
        int currentSum = 0;
        int count = 0;
        for(int i=1;i<=n;i++){
            currentSum += i;
            if(set.contains(i) || (currentSum > maxSum)){
                currentSum -= i;
            }else{
                count++;
            }

        }
        return count;
        
    }
}