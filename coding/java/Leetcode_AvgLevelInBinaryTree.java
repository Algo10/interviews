import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_AvgLevelInBinaryTree {
/*
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 */
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
     }
	 public List<Double> averageOfLevels(TreeNode root) {
	        List<TreeNode> nodesAtLevel = new LinkedList<>();
	        List<Double> levelSum = new ArrayList<>();
	        Double currentLevelSum = 0.0d;
	        int currentLevelCount = 0;
	        nodesAtLevel.add(root);
	        while(!nodesAtLevel.isEmpty()){
	            List<TreeNode> parents = nodesAtLevel;
	            currentLevelCount = nodesAtLevel.size();
	            currentLevelSum = 0.0d;
	            for(TreeNode node:nodesAtLevel){
	                currentLevelSum = currentLevelSum + node.val;
	            }
	            levelSum.add(currentLevelSum/currentLevelCount);
	            nodesAtLevel = new ArrayList<>();
	            for(TreeNode parent: parents){
	                if(parent.left!=null) nodesAtLevel.add(parent.left);
	                if(parent.right!=null) nodesAtLevel.add(parent.right);
	            }
	             
	             
	        }
	        
	        return levelSum;
	        
	    }
}
