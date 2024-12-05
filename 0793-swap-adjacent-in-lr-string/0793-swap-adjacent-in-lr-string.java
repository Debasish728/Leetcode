class Solution {
    public boolean canTransform(String start, String result) {
        if(start.length() != result.length()){
            return false;
        }
        int n = start.length();
        int i=0,j=0;
        while(i<n || j<n){
            while(i<n && start.charAt(i) == 'X'){
                i++;
            }
            while(j<n && result.charAt(j) == 'X'){
                j++;
            }

            if(i<n && j<n){
                char c1 = start.charAt(i);
                char c2 = result.charAt(j);
                if(c1 != c2){
                    return false;
                }
                if(c1 == 'L' && i<j){
                    return false;
                }
                if(c1 == 'R' && i>j){
                    return false;
                }
            }
            i++;
            j++;
        }
        while(i<n && start.charAt(i) == 'X'){
            i++;
        }
        while(j<n && result.charAt(i) == 'X'){
            j++;
        }
        return i==j;
        
    }
}