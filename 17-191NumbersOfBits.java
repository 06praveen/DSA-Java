//Solved a DSA problem based on bitwise topic to count the no. of 1's in binary form
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n /= 2;
        }
        return count;
    }
}
