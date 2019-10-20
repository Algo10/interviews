
public class Leetcode_MaxAreaOfIsland {
	boolean [][] visited;
    public int maxAreaOfIsland(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                max = Math.max(max, maxArea(i,j,grid));
            }
        }
        return max;
      }
    
    private int maxArea(int i, int j, int[][] grid){
        if(i >= grid.length || j >= grid[0].length || i < 0 || j< 0 || visited[i][j]  || grid[i][j]==0){
            
            return 0;
        }
        visited[i][j] = true;
       
        return(1 + maxArea(i+1, j, grid) + maxArea(i-1, j, grid) + maxArea(i, j+1, grid) + maxArea(i, j-1, grid));
    }
}
