class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        int i,j,t,c=0;
        for(i=0;i<arr.length;i++){
            arr[i]=heights[i];
        }
        for(i=0;i<(arr.length)-1;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];arr[i]=arr[j];arr[j]=t;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]){
                c+=1;
            }
        }
        return c;
    }
}
