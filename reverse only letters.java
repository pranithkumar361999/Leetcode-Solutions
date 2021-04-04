class Solution {
    public String reverseOnlyLetters(String S) {
        String alp="";
        String original="";
        for(int i=0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                alp+=S.charAt(i);
            }
        }
        int k=alp.length()-1;
        for(int i=0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                original+=alp.charAt(k--);
            }
            else{
                original+=S.charAt(i);
            }
        }
        return original;
    }
}
