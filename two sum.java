class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int i,j;
        int[] result=new int[2];
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    
                }
            }
        }
        return result;
    }
}
