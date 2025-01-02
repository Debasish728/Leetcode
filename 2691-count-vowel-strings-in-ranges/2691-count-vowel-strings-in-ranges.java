class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int m = queries.length;
        int n = words.length;
        int res[] = new int [m];
        int wordsCount[] = new int[n];
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int sum = 0;
        for(int i=0;i<n;i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))){
                sum++;
            }
            wordsCount[i] = sum;

        }
         for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = wordsCount[r] - (l > 0 ? wordsCount[l - 1] : 0);
        }
        return res;
        
    }
}