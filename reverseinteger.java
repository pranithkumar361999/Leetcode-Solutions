class Solution {
    
    public int reverse(int x) {
        long rev=0,num=x,rem,act,flag=0;
        if(num<0){
            act=-(num);
            flag=1;
        }
        else{
            act=num;
        }
        while(act>0){
            rem=act%10;
            rev=rev*10+rem;
            act/=10;
        }
        if(rev>Integer.MAX_VALUE){
            return 0;
        }
        if(flag==0){
            return (int)rev;
        }
        else{
            int ans=0-(int)rev;
            return ans;
        }
    }
}
