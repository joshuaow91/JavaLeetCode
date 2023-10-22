import javax.swing.tree.TreeNode;

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {

        TreeNode temp = root;
        int leftCount = 0;
        int rightCount = 0;

        while (temp != null) {
            temp = temp.left;
            leftCount++;
            if(temp.right != null) {
                temp = temp.right;
                rightCount++;
            }
        }

        return Math.max(leftCount, rightCount);
    }

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
}
