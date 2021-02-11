class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i,j;
        String s="",t="";
        for(i=0;i<word1.length;i++){
            s+=word1[i];
        }
        for(i=0;i<word2.length;i++){
            t+=word2[i];
        }
        return s.equals(t);
    }
}
