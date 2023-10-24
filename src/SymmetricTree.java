public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left, root.right);
    }

    private boolean isSym(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        if(node1.val != node2.val) return false;

        return isSym(node1.left, node2.right) && isSym(node1.right, node2.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//Input: root = [1,2,2,3,4,4,3]
//Output: true
//Input: root = [1,2,2,null,3,null,3]
//Output: false