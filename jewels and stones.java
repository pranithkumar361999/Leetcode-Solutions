class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<Character>();
        int i,c=0;
        for(i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        for(i=0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                c+=1;
            }
        }
        return c;
    }
}
