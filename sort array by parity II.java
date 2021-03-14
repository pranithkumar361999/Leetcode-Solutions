class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i,j=0,index=0,jindex=1;
        int[] arr=new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[index]=nums[i];
                index+=2;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                arr[jindex]=nums[i];
                jindex+=2;
            }
        }
        return arr;
    }
}
