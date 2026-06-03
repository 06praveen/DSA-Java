//I got the maxmimum sum from the subarray using kadane algorithm
class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum+=arr[i];
           if(sum>max){
            max=sum;
           }
        }
        return max;
    }
}
