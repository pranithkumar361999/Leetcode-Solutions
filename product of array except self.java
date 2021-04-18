class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,j;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] output=new int[nums.length];
        left[0]=1;
        for(i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for(i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        
        for(i=0;i<nums.length;i++){
            output[i]=left[i]*right[i];
        }
        return output;
            
        
    }
}
