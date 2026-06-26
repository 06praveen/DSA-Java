//Solved a DSA problem in which we have to sum the maximize number till k times and after every sum we have increase the value of any element in the array by 1
class Solution {
    public int maximizeSum(int[] arr, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i:arr){
            if(i>max){
                max=i;
            }
        }

        int i=0;
        while(i<k){
            sum += max+i;
            i++; 
        }
        return sum;
    }
}
