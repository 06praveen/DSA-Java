//Used brute force approad to solve
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;

        int min=Integer.MAX_VALUE;
        int diff1=0,diff2=0;
        for(int i=0;i<n;i++){
            int land=landStartTime[i]+landDuration[i];
            for(int j=0;j<m;j++){
                int water=waterStartTime[j]+waterDuration[j];

                //Calculate for land
                if(land<waterStartTime[j]){
                    diff1=water;
                }
                else{
                    diff1=land+waterDuration[j];
                }

                //Calculate for water
                if(water<landStartTime[i]){
                    diff2=land;
                }
                else{
                    diff2=water+landDuration[i];
                }
                int temp=(diff1>diff2)? diff2:diff1;
                min = (temp<min)? temp:min;
            }
        }
        return min;
    }
}
