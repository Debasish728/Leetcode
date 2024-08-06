public class Solution {
    public int minimumPushes(String word) {
   
        Map<Character, Integer> letterCounts = new HashMap<>();
     
        for (char c : word.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }
        
   
        List<Integer> counts = new ArrayList<>(letterCounts.values());
        

        Collections.sort(counts, Collections.reverseOrder());
        
  
        int ans = 0, row = 1;

        for (int i = 0; i < counts.size(); i++) {
         
            if (i > 7 && i % 8 == 0) {
                row++;
            }
    
            ans += row * counts.get(i);
        }
        

        return ans;
    }
}