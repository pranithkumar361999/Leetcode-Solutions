class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        if(nums.length*nums[0].length!=r*c){
            return nums;
        }
        int[][] matrix=new int[r][c];
        int i,j;
        int[] arr=new int[r*c];
        int k=0;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums[0].length;j++){
                arr[k++]=nums[i][j];
            }
        }
        k=0;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                matrix[i][j]=arr[k++];
            }
        }
        return matrix;
    }
}
