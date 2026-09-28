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
    public int maxDepth(TreeNode root) {
        int num = 1;
        if (root==null) return 0;
        return Math.max(max(root.left,num), max(root.right,num));
        
    }
    private int max(TreeNode root, int num){
        
        if(root==null) return num;
        num++;
        return Math.max(max(root.left,num),max(root.right,num));
    }
}
