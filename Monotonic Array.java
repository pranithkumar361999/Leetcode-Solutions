class Solution {
    public boolean isMonotonic(int[] A) {
        int i,j,c=0,d=0;
        for(i=0;i<A.length-1;i++){
            if(A[i]<=A[i+1]){
                c+=1;
            }
            if(A[i]>=A[i+1]){
                d+=1;
            }
        }
        if(c==A.length-1||d==A.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}
