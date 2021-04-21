class Solution {
    public String addBinary(String a, String b) {
        int x=a.length()-1,y=b.length()-1;
        int sum;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(x>=0||y>=0){
            sum=carry;
            if(x>=0){
                sum+=a.charAt(x--)-'0';
            }
            if(y>=0){
                sum+=b.charAt(y--)-'0';
            }
            sb.append(sum%2);
            carry=sum/2;
            
            
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
