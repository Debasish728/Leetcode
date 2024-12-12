class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int num = pq.poll();
            int sqrValue = (int)Math.floor(Math.sqrt(num));
            pq.add(sqrValue);

        }
        long res = 0;
        for(Integer value:pq){
            res+=value;

        }
        return res;

        
    }
}