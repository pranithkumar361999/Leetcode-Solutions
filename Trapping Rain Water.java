class Solution {
    public int trap(int[] height) {
        int i,j,water=0;
        if(height.length==0){
            return 0;
        }
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        for(i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        for(i=height.length-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        for(i=0;i<height.length;i++){
            water+=Math.min(left[i],right[i])-height[i];
        }
        return water;
    }
}