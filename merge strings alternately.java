class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int k=0,l=0;
        while(k<word1.length()&&l<word2.length()){
            if(k<word1.length()){
                str+=word1.charAt(k++);
            }
            if(l<word2.length()){
                str+=word2.charAt(l++);
            }
        }
        if(k<word1.length()){
            for(int i=k;i<word1.length();i++){
                str+=word1.charAt(i);
            }
        }
        if(l<word2.length()){
            
            for(int i=l;i<word2.length();i++){
                str+=word2.charAt(i);
            }
        }
        return str;
    }
}
