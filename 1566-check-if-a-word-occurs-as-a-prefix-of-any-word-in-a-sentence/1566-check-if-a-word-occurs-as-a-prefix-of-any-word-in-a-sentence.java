class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String words[] = sentence.split(" ");
        int n = words.length;
        for(int i=0;i<n;i++){
            if(words[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}