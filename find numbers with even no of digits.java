class Solution {
    public int findNumbers(int[] nums) {
        int i,c=0,tot=0;
        for(i=0;i<nums.length;i++){
            int num=nums[i];
            while(num>0){
                c++;
                num/=10;
            }
            if(c%2==0){
                tot+=1;
            }
            c=0;
        }
        return tot;
    }
}
