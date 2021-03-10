class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int i,j,ans=0;
        if(nums.length==1){
            return nums[0];
        }
        for(i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int c=map.get(nums[i])+1;
                if(c>(nums.length/2)){
                    ans=nums[i];
                    break;
                }
                else{
                    map.put(nums[i],c);
                }
            }
            else{
                map.put(nums[i],1);
            }
        }
        return ans;
    }
}
