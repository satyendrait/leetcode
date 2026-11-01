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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int lh = height(root.left);
        int rh = height(root.right);
        if (Math.abs(lh - rh) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    int height(TreeNode node) {
        if (node == null)
            return 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(node);
        int d = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            d++;
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            }
        }
         return d;
    }
}