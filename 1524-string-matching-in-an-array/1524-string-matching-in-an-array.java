class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(words[j].contains(words[i])){
                    count++;
                }
            }
            if(count>1){
                result.add(words[i]);
            }



        }
        return result;
        
    }
}