class Solution {
    public String addStrings(String num1, String num2) {
        int i,j;
        int carry=0;
        StringBuilder result = new StringBuilder();
        int x=num1.length()-1,y=num2.length()-1;
        while(x>=0||y>=0){
            int sum=carry;
            if(x>=0){
                sum+=num1.charAt(x--)-'0';
            }
            if(y>=0){
                sum+=num2.charAt(y--)-'0';
            }
            result.append(sum%10);
            carry=sum/10;
            
        }
        if(carry!=0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
