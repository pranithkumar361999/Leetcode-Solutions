class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];
        int i,j;
        for(i=0;i<code.length;i++){
            if(k==0){
                arr[i]=0;
            }
            else if(k>0){
                for(j=i+1;j<(i+1+k);j++){
                    arr[i]+=code[j%(code.length)];
                }
            }
            else{
               int ind=i-1;
               for(j=0;j<Math.abs(k);j++){
                   if(ind==-1){
                       ind=code.length-1;
                   }
                   arr[i]+=code[ind];
                   ind--;
               }
            }
        }
        return arr;
    }
}
