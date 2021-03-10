class Solution {
    public int findDuplicate(int[] nums) {
        int i,j,dup=0;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num)){
                dup= num;
            }
            else{
                set.add(num);
            }
        }
         return dup;   
    }
}
