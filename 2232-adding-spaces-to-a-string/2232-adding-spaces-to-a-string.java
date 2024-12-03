class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i=0;i<spaces.length;i++){
            sb.insert(spaces[i]+count , ' ');
            count++;
        }
        return (sb.toString());

        
    }
}