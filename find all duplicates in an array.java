class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls=new ArrayList();
        int i,j;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num)){
                ls.add(num);
            }
            else{
                set.add(num);
            }
        }
        return ls;
    }
}
