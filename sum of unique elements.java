class Solution {
    public int sumOfUnique(int[] nums) {
        int[] hash=new int[101];
        int i,s=0;
        for(i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(i=0;i<101;i++){
            if(hash[i]==1){
                s+=i;
            }
        }
        return s;
    }
}
