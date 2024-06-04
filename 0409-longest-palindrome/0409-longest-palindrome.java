class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character , Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            Character c = s.charAt(i);
             if (map.containsKey(c)) {
                   map.put(c, map.get(c) + 1);
            } else {
                   map.put(c, 1);
    }
        }
        int len = 0;
        Boolean oneOddTaken = false;
        int maxOdd = 0;
        for(Character key: map.keySet()){
            int count = map.get(key);
            if(count%2 == 0){
                len+=count;
            }else{
                len += count-1;
                maxOdd = Math.max(maxOdd, count);
                
            }
        }
        return len+(maxOdd > 0 ? 1 : 0);


        
    }
}