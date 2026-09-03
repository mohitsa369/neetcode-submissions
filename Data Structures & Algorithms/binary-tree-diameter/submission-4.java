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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftTree = maxHeight(root.left);
        int rightTree = maxHeight(root.right);
        int height = leftTree + rightTree;
        int sub = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        int res = Math.max(height, sub);
        return res;
    }

    public int maxHeight(TreeNode root){
        if(root ==null){
            return 0;
        }
        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }
}
