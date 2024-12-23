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
    int countMinimumSwap(int nums[]){
        int swaps = 0;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        HashMap<Integer, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            idxMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sortedNums[i]) {
                swaps++;
                int j = idxMap.get(sortedNums[i]);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                idxMap.put(nums[i], i);
                idxMap.put(nums[j], j);
            }
        }

        return swaps;

    }
    
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int currentLevel[] = new int[levelSize];
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                currentLevel[i] = currentNode.val;
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            count += countMinimumSwap(currentLevel);

        }
        return count;


        
    }
}