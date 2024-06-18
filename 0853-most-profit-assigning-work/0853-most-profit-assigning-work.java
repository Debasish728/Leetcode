class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;

        // Create a max-heap using a priority queue
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // Max-heap by profit

        for (int i = 0; i < n; i++) {
            int diff = difficulty[i];
            int prof = profit[i];

            pq.offer(new int[]{prof, diff});
        }

        // Sort worker array in descending order
        Arrays.sort(worker);
        for (int i = 0; i < worker.length / 2; i++) {
            int temp = worker[i];
            worker[i] = worker[worker.length - 1 - i];
            worker[worker.length - 1 - i] = temp;
        }

        int i = 0;
        int totalProfit = 0;
        while (i < m && !pq.isEmpty()) {
            if (pq.peek()[1] > worker[i]) {
                pq.poll();
            } else {
                totalProfit += pq.peek()[0];
                i++;
            }
        }

        return totalProfit;
    }
}