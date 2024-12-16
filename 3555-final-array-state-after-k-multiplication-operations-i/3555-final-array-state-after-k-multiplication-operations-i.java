 class IndexValuePair{
    int index;
    int value;
    IndexValuePair(int index , int value){
        this.index = index;
        this.value = value;
    }

}

class Solution {
 int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<IndexValuePair> pq = new PriorityQueue<>((a, b) -> {
            if (a.value == b.value) {
                return Integer.compare(a.index, b.index);
            }
            return Integer.compare(a.value, b.value);
        });

        for (int i = 0; i < nums.length; i++) {
            pq.add(new IndexValuePair(i, nums[i]));
        }

        
        for (int i = 1; i <= k; i++) {
            IndexValuePair pair = pq.poll();

            nums[pair.index] = multiplier * pair.value;

            pq.add(new IndexValuePair(pair.index, nums[pair.index]));
        }

        return nums;
    }
}