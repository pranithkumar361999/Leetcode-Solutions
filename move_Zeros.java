class Solution {
    public void moveZeroes(int[] nums) {
        int i,j,k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        for(i=k;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
