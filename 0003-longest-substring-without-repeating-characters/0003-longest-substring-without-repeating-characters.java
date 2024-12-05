class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int maxSize = 0;
        for(int i=0;i<n;i++){
            int j = i;
            while(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                if(j<n-1){
                    j++;
                }
            }
            maxSize = Math.max(maxSize,set.size());
            set.clear();

        }
        return maxSize;
        
    }
}