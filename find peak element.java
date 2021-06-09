class Solution {
    public int findPeakElement(int[] nums) {
        int i,j,res=0;
        if(nums.length==0||nums.length==1){
            return 0;
        }
        for(i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]>nums[i+1]){
                    res= i;
                }
            }
            else if(i==nums.length-1){
                if(nums[nums.length-1]>nums[i-1]){
                    res= i;
                }
            }
            else if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                res= i;
            }
        }
        return res;
    }
}
