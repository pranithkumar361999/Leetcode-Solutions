class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i,j,res=0,min=99999;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                res=Math.abs(i-start);
                if(res<min){
                    min=res;
                }
            }
        }
        return min;
    }
}
