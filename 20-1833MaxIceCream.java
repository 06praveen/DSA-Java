//Solved a Easy DSA problem
class Solution {
    public int maxIceCream(int[] arr, int coins) {
        int n=arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            if(coins<=0){
                return count;
            }
            if(coins>0 && (coins-arr[i])>=0){
                count++;
                coins -= arr[i];
            }
        }
        return count;
    }
}
