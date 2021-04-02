class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i,j;
        List<Integer> arr=new ArrayList();
        HashSet<Integer> set=new HashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
        for(i=1;i<=nums.length;i++){
            if(set.contains(i)){
                continue;
            }
            else{
                arr.add(i);
            }
        }
        return arr;
    }
}
