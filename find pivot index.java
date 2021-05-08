class Solution {
    public int pivotIndex(int[] nums) {
        int i,j,left=0,right=0,res=-1;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(i<j){
                    left+=nums[j];
                }
                if(i>j){
                    right+=nums[j];
                }
            }
            if(left==right){
                res=i;break;
            }
            left=0;right=0;
        }
        return res;
    }
}
