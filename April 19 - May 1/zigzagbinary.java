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
    int maxlen = 0;
    
    public int longestZigZag(TreeNode root) {
        recur(root.left, 0, 1); // 0 is for left
        recur(root.right, 1, 1); // 1 is for right
        return maxlen;
        
    }
    
    public void recur(TreeNode root, int dir, int len){
        if(root == null){
            return;
        }
        
        maxlen = Math.max(maxlen, len);
        if(dir == 0){
            recur(root.left, dir, 1);
            recur(root.right, 1, len + 1);
        }
        else {
            recur(root.left, 0, len + 1);
            recur(root.right, dir, 1);

        }
        return;
    }
}