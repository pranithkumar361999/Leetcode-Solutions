class Solution {
    public int totalMoney(int n) {
        int init=1,total=0,s=1;
        for(int i=0;i<n;i++){
            if(i%7==0&&i!=0){
                init+=1;
                s=init;
            }
            total+=s;
            s++;
            
        }
        return total;
    }
}
