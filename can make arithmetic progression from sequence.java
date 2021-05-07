class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        Arrays.sort(arr);
        int diff=Math.abs(arr[0]-arr[1]);
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==diff){
                c+=1;
            }
        }
        if(c==arr.length-1){
            return true;
        }
        return false;
    }
}
