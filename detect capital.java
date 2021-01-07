class Solution {
    public boolean detectCapitalUse(String word) {
        int i,c=0;
        for(i=0;i<word.length();i++){
            if(word.charAt(i)>=65&&word.charAt(i)<=90){
                c+=1;
            }
        }
        if(c==word.length()){
            return true;
        }
        if(c>1){
            return false;
        }
        
        if(c==0){
            return true;
        }
        if(word.charAt(0)>=65&&word.charAt(0)<=90){
            return true;
        }
        return false;
    }
}
