class Solution {
    public boolean isPalindrome(String s) {
        
        String str="";
        int i,j;
        char[] ch_array=new char[s.length()];
        for(i=0;i<s.length();i++){
            ch_array[i]=s.charAt(i);
        }
        for(char ch:ch_array){
            if(Character.isLetterOrDigit(ch)){
                str+=ch;
            }
        }
        int start=0,end=str.length()-1,c=0;
        for(i=0;i<(str.length())/2;i++){
            if(Character.toLowerCase(str.charAt(start))==Character.toLowerCase(str.charAt(end))){
                c++;
            }
            start++;end--;
        }
        if(c==(str.length())/2){
            return true;
        }
        return false;
    }
}
