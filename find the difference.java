class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq=new int[26];
        int[] freq2=new int[26];
        int i,diff=-1;
        for(i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(i=0;i<t.length();i++){
            freq2[t.charAt(i)-'a']++;
        }
        for(i=0;i<26;i++){
            if(freq[i]!=freq2[i]){
                diff=i;
            }
        }
        return (char)(diff+97);
    }
}
