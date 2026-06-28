//Solved only one DSA problem from today's leetcode contest
class Solution {
    public long maxSum(int[] arr, int k, int mul) {
        int n=arr.length;
        Arrays.sort(arr);
        long sum=0;
        int j=n-1;
        for(int i=0;i<k;i++){
            if(mul>1){
                sum += 1L*arr[j]*mul;
                mul--;
            }
            else{
                sum += 1L*arr[j];
            }
            j--;
        }
        return sum;
    }
}©leetcode
