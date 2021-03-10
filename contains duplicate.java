class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i,j;
        HashSet<Integer> h=new HashSet<Integer>();
        for(int num:nums){
            if(h.contains(num)){
                return true;
            }
            else{
                h.add(num);
            }
        }
        return false;
    }
}
