class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        int i,j,t;
        for(i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        for(i=0;i<(nums.length)-1;i++){
            for(j=i+1;j<nums.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];arr[i]=arr[j];arr[j]=t;
                }
            }
        }
        return arr;
    }
}
