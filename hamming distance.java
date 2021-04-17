class Solution {
    public int hammingDistance(int x, int y) {
        int a=x,b=y,result=0;
        while(a>0||b>0){
            result+=(a%2)^(b%2);
            a/=2;b/=2;
        }
        return result;
    }
}
