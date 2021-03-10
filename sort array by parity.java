class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] nums=new int[A.length];
        int i,j,k=0;
        for(i=0;i<A.length;i++){
            if(A[i]%2==0){
                nums[k++]=A[i];
            }
        }
        for(i=0;i<A.length;i++){
            if(A[i]%2==1){
                nums[k++]=A[i];
            }
        }
        return nums;
    }
}
