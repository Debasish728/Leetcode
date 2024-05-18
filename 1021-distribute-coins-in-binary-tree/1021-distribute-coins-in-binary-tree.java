/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int helper(TreeNode root , int[] steps){
      if(root == null){
        return 0;
      }
      int l = helper(root.left , steps);
      int r = helper(root.right , steps);
       int totalExtraCoins = (l + r + root.val) - 1;
      steps[0] += Math.abs(l)+Math.abs(r);
      return totalExtraCoins;

    }
    public int distributeCoins(TreeNode root) {
         if(root == null || (root.left == null && root.right == null)){
            return 0;
        }

        int steps[] = {0};
        helper(root,steps);
        return steps[0];
        
    }
}