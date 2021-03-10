class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j;
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
