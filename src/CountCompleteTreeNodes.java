public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root.val == 0) return 0;
        if (root.val == 1) return 1;

        int count = 0;

        if (countNodes(root.left) != null && countNodes(root.right) != null) {
            count++;
        }
        return count;
    }



     public class TreeNode {
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
