class Solution {
    public double average(int[] salary) {
        int max=0,min=999999;
        double avg,s=0;
        int i;
        for(i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
        }
        for(i=0;i<salary.length;i++){
            if(salary[i]!=min&&salary[i]!=max){
                s+=salary[i];
            }
        }
        return (s)/(salary.length-2);
    }
}
