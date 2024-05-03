class Solution {
    public int compareVersion(String version1, String version2) {
        String[] tokens1 = version1.split("\\.");
        String[] tokens2 = version2.split("\\.");
        int n1 = tokens1.length;
        int n2 = tokens2.length;
        int i=0;
        while(i<n1 || i<n2){
            int a = i<n1 ? Integer.parseInt(tokens1[i]):0;
            int b = i<n2 ? Integer.parseInt(tokens2[i]):0;
            if(a<b){
                return -1;
            }else if(a>b){
                return 1;
            }else{
                i++;
            }
            
        }
        return 0;
        
        
    }
}