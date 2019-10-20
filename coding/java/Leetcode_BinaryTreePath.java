import java.util.ArrayList;
import java.util.List;

public class Leetcode_BinaryTreePath {
/*
 * Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
   }
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(root==null) return paths;
        else getPaths(paths, sb, root);
        return paths;
    }
    
    private void getPaths(List<String> paths, StringBuilder sb, TreeNode root){
        if(sb.length() > 0) sb.append("->");
        sb.append(root.val);
        if(root.left == null && root.right == null){
            paths.add(sb.toString());
        }
        if(root.left != null) getPaths(paths, new StringBuilder(sb), root.left);
        if(root.right != null) getPaths(paths, new StringBuilder(sb), root.right);
    }
}
