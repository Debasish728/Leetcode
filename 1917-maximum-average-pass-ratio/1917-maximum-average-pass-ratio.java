class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int i = 0; i < classes.length; i++) {
            double currAvg = (double) classes[i][0] / classes[i][1];
            double newAvg = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            double possibleIncrement = newAvg - currAvg;
            maxHeap.offer(new double[]{possibleIncrement, i});
        }

        while (extraStudents-- > 0) {
            double[] top = maxHeap.poll();
            int idx = (int) top[1];
            classes[idx][0]++;
            classes[idx][1]++;

            double currAvg = (double) classes[idx][0] / classes[idx][1];
            double newAvg = (double) (classes[idx][0] + 1) / (classes[idx][1] + 1);
            double possibleIncrement = newAvg - currAvg;
            maxHeap.offer(new double[]{possibleIncrement, idx});
        }

        double finalAvg = 0.0;
        for (int[] clazz : classes) {
            finalAvg += (double) clazz[0] / clazz[1];
        }

        return finalAvg / classes.length;
    }
}