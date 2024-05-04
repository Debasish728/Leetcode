class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int l = 0;
        int r = n-1;
        int boatNum = 0;
        while(l<=r){
            if((people[l]+people[r])<=limit){
                l++;
                r--;
            }else{
                r--;
            }
            boatNum++;
        }
        return boatNum;
        
    }
}