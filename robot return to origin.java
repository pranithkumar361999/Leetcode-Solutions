class Solution {
    public boolean judgeCircle(String moves) {
        int i,j,x=0,y=0;
        for(i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                y+=1;
            }
            else if(moves.charAt(i)=='D'){
                y-=1;
            }
            else if(moves.charAt(i)=='R'){
                x+=1;
            }
            else{
                x-=1;
            }
        }
        if(x==0&&y==0){
            return true;
        }
        return false;
    }
}
