class Solution {
    public int minOperations(String s) {
        int i,j,c=0,d=0;
        String sb="";
        String t="";
        for(i=0;i<s.length();i++){
            if(i%2==0){
                sb+='0';
                t+='1';
            }
            else{
                sb+='1';
                t+='0';
            }
                
        }
        for(i=0;i<s.length();i++){
            if(sb.charAt(i)!=s.charAt(i)){
                c+=1;
            }
            if(t.charAt(i)!=s.charAt(i)){
                d+=1;
            }
        }
        if(c>d){
            return d;
        }
        else{
            return c;
        }
    }
}
