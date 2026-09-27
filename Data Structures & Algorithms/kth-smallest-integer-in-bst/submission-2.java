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
    public int kthSmallest(TreeNode root, int k) {
        int count =0;
        List<Integer> l = new ArrayList<>();
        dfs(root,l,count);
        return l.get(k-1);
    }
    private void dfs(TreeNode root, List<Integer> l, int count){
        if(root == null) return;
        dfs(root.left,l,count);
        l.add(root.val);
        count++;
        dfs(root.right,l,count);
        return;
    }

}
