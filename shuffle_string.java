class Solution {
    public String restoreString(String s, int[] indices) {
        int i,j,num;
        String str="";
        for(i=0;i<indices.length;i++){
            num=i;
            for(j=0;j<indices.length;j++){
                if(num==indices[j]){
                    str+=s.charAt(j);
                }
            }
        }
        return str;
    }
}
