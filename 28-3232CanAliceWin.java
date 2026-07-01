//Solved a DSA problem based on array
class Solution {
    public boolean canAliceWin(int[] arr) {
        int n=arr.length;
        int singleSum=0;
        int doubleSum=0;

        for(int i=0;i<n;i++){
            if(arr[i]<=9){
                singleSum += arr[i];
            }
            else{
                doubleSum += arr[i];
            }
        }
        return (singleSum==doubleSum)? false:true;
    }
}
