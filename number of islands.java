class Solution {
    public int numIslands(char[][] grid) {
        int i,j,c=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    c+=1;
                    bfs(grid,i,j);
                }
            }
        }
        return c;
    }
    public void bfs(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0'){
            return;
        }
        else{
            grid[i][j]='0';
            bfs(grid,i+1,j);
            bfs(grid,i-1,j);
            bfs(grid,i,j+1);
            bfs(grid,i,j-1);
            
        }
        
    }
}
