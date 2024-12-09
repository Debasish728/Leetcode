class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int n = stones.length;
        for(int i=0;i<n;i++){
            maxHeap.add(stones[i]);
        }
        for(int i=0;i<n-1;i++){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            maxHeap.add(x-y);
        }
        return maxHeap.peek();


        
    }
}