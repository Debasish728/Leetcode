class Solution {
    int getMax(int grid[][] , int row , int col){
        int maxVal = Integer.MIN_VALUE;
        for(int i=row;i<=row+2;i++){
            for(int j=col;j<=col+2;j++){
                maxVal = Math.max(maxVal , grid[i][j]);
            }
        }
        return maxVal;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int maxLocal[][] = new int[n-2][n-2];
        for(int row=0;row<n-2;row++){
            for(int col=0;col<n-2;col++){
                maxLocal[row][col] = getMax(grid,row,col);
            }
        }
        return maxLocal;

        
    }
}