class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int loop = 1;
        String[] arr = {"right", "down", "left", "up"};
        int toVisit = rows * cols;
        int[][] res = new int[toVisit][2];
        int resi = 0;
        int currRow = rStart;
        int currCol = cStart;
        int k = 0;
        
        res[resi][0] = currRow;
        res[resi][1] = currCol;
        toVisit--;
        resi++;

        while (toVisit > 0) {
            for (int loopCount = 0; loopCount < 2; loopCount++) {
                for (int i = 0; i < loop; i++) {
                    if (arr[k].equals("right")) {
                        currCol++;
                    } else if (arr[k].equals("down")) {
                        currRow++;
                    } else if (arr[k].equals("left")) {
                        currCol--;
                    } else if (arr[k].equals("up")) {
                        currRow--;
                    }

                    if (currRow >= 0 && currRow < rows && currCol >= 0 && currCol < cols) {
                        res[resi][0] = currRow;
                        res[resi][1] = currCol;
                        toVisit--;
                        resi++;
                    }
                }
                k++;
                if (k == 4) {
                    k = 0;
                }
            }
            loop++;
        }
        return res;
    }
}
