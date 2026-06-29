//Solved a DSA problem based on String topic
class Solution {
    public int numOfStrings(String[] arr, String word) {
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            String s = arr[i];
            if(word.contains(s)){
                count++;
                
            }
        }
        return count;
    }
}
