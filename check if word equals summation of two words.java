class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String alp="abcdefghijklmnopqrstuvwxyz";
        int one=0,two=0,three=0;
        int i,j,k=0;
        for(i=firstWord.length()-1;i>=0;i--){
            one+=(alp.indexOf(firstWord.charAt(i)))*(Math.pow(10,k++));
        }
        k=0;
        for(i=secondWord.length()-1;i>=0;i--){
            two+=(alp.indexOf(secondWord.charAt(i)))*(Math.pow(10,k++));
        }
        k=0;
        for(i=targetWord.length()-1;i>=0;i--){
            three+=(alp.indexOf(targetWord.charAt(i)))*(Math.pow(10,k++));
        }
        return ((one+two)==three);
    }
}
