class Solution {
    public String truncateSentence(String s, int k) {
        String strArr[]=s.split(" ");
        int i,j;
        String str="";
        for(i=0;i<k-1;i++){
           str+=strArr[i];
            str+=' ';
        }
        str+=strArr[k-1];
        return str;
    }
}
