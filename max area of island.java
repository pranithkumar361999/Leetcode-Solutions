class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int i,j,max=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        
            grid[i][j]=0;
            int c=1;
            c+=dfs(grid,i-1,j);
            c+=dfs(grid,i+1,j);
            c+=dfs(grid,i,j-1);
            c+=dfs(grid,i,j+1);
        return c;
    }
}
