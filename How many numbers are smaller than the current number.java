class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i,j,c=0;
        int[] arr=new int[nums.length];
        for(i=0;i<nums.length;i++){
            int num=nums[i];
            for(j=0;j<nums.length;j++){
                if(i!=j){
                    if(num>nums[j]){
                        c+=1;
                    }
                }
            }
            arr[i]=c;
            c=0;
        }
        return arr;
    }
}
