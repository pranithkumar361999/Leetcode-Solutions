class Solution {
    public int[][] transpose(int[][] matrix) {
        int i,j;
        int m=matrix[0].length,n=matrix.length;
        int[][] original=new int[m][n];
        int ind=0,jind=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                original[ind][jind++]=matrix[j][i];
            }
            ind+=1;jind=0;
        }
        return original;
    }
}
