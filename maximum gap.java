class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int i,max=0;
        for(i=0;i<nums.length-1;i++){
            if((nums[i+1]-nums[i])>max){
                max=nums[i+1]-nums[i];
            }
        }
        return max;
    }
}
