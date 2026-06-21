//Solved a leetcode weekly contest DSA problem based on Subarray topic by using Brutt force 
class Solution {
    public int countValidSubarrays(int[] arr, int x) {
        int n=arr.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                long temp=sum;
                int l = (int)(temp%10);
                while(temp>=10){
                    temp /= 10;
                }
                int f = (int)(temp%10);
                if(f==x && l==x){
                    count++;
                }
            }
        }
    return count;
    }
}
