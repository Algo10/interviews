
public class Leetcode_NoOfIslands {
	/*
	 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
	 */
	 public int numIslands(char[][] grid) {
	        int noOfIslands = 0;
	        if(grid.length == 0) return 0;
	        boolean[] [] visited = new boolean[grid.length][grid[0].length];
	       
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[0].length;j++){
	                if(visited[i][j] == false && grid[i][j]=='1'){
	                    gatherIslandNodes(visited, grid, i, j);
	                    noOfIslands++;
	                }
	                                
	            }
	        }
	        return noOfIslands;
	    }
	    public void gatherIslandNodes(boolean[] [] visited, char[][] grid, int i, int j){
	        if(i >= grid.length || j >= grid[0].length || j< 0 || i< 0) return;
	        else if(visited[i][j] == true) return;
	        else if(grid[i][j] == '0'){
	            return;
	        }else{
	            visited[i][j] = true;
	            gatherIslandNodes(visited, grid, i+1, j);
	            gatherIslandNodes(visited, grid, i-1, j);
	            gatherIslandNodes(visited, grid, i, j+1);
	            gatherIslandNodes(visited, grid, i, j-1);
	        }
	    }

}
