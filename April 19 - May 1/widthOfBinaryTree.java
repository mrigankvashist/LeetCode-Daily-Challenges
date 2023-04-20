import java.util.LinkedList;
import java.util.Queue;

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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(); // queue for bfs order
        Queue<Integer> queueIdx = new LinkedList<>(); // queue for index of corresponding node
        
        queue.add(root); // first node to root
        queueIdx.add(1); // assuming first index to be 1
        
        int width = 0;
        
        //level order traversal
        while(!queue.isEmpty()){
            int size = queue.size();
            int start = 0; // index of the first node in the level
            int end = 0; // index of the last node in the level
            
            for(int i = 0; i<size; i++){
                //removing from both queues
                TreeNode node = queue.poll();
                int index = queueIdx.poll();
                
                if(i==0){
                    start = index;
                }
                if(i==size - 1){
                    end = index;
                }
                
                if(node.left != null){
                    queue.add(node.left);
                    queueIdx.add(index * 2);
                }
                if(node.right != null){
                    queue.add(node.right);
                    queueIdx.add(index*2 + 1);
                }
            }
            width = Math.max(width, end - start + 1);
            
        }
        return width;
        
        
        
    }
}