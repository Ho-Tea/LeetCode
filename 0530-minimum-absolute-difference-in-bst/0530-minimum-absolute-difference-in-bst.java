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
public class Solution {
    int min = Integer.MAX_VALUE;
    int pre = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        getMinimumDifference(root.left);

        min = Math.min(min, Math.abs(root.val - pre));

        pre = root.val;

        getMinimumDifference(root.right);
    }
}