class Solution {
    public void setZeroes(int[][] matrix) {
        int i,j;
        boolean[] rows=new boolean[matrix.length];
        boolean[] cols=new boolean[matrix[0].length];
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }                                             
        
        for(i=0;i<rows.length;i++){
            if(rows[i]){
                nullifyRows(matrix,i);
            }
        }
        for(i=0;i<cols.length;i++){
            if(cols[i]){
                nullifyCols(matrix,i);
            }
        }
        
        
    }
    public void nullifyRows(int[][] matrix,int i){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
    public void nullifyCols(int[][] matrix,int i){
        for(int j=0;j<matrix.length;j++){
            matrix[j][i]=0;
        }
    }
}
