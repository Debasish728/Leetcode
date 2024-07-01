class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int counter = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                counter = 0;

            }else{
                counter++;
                if(counter == 3){
                    return true;
                    
                }
            }
        }
        return false;
    }
}