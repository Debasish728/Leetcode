class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] res = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] <= prices[st.peek()]) {
                res[st.pop()] -= prices[i];
            }
            res[i] = prices[i];
            st.push(i);
        }
        return res;
    }
}