class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int i,j,mid=n,k=0,start=0;
        for(i=0;i<nums.length;i++){
            if(i%2==0){
                arr[k++]=nums[start];
                start++;
            }
            else{
                arr[k++]=nums[mid];
                mid++;
            }
        }
        return arr;
    }
}
