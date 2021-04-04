class Solution {
    public String reverseVowels(String s) {
        String vowels="";
        String original="";
        int i,j;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                vowels+=s.charAt(i);
            }
        }
        int k=vowels.length()-1;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                original+=vowels.charAt(k--);
            }
            else{
                original+=s.charAt(i);
            }
        }
        return original;
    }
}
