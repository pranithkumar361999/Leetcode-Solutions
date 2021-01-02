class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int i,j,s=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j||i+j==n-1){
                    s+=mat[i][j];
                }
            }
        }
        return s;
    }
}
