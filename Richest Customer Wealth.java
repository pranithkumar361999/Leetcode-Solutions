class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0,s=0;
        int i,j;
        int inner=accounts[0].length;
        int outer=accounts.length;
        for(i=0;i<outer;i++){
            s=0;
            for(j=0;j<inner;j++){
                s+=accounts[i][j];
            }
            if(s>max){
                max=s;
            }
        }
        return max;
    }
}
