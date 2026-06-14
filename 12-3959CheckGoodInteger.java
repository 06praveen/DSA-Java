//Solved a easy DSA Problem from today's leetcode contest
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        Long squareSum=0L;

        while(n>0){
            int lDigit=n%10;
            digitSum += lDigit;
            squareSum += (lDigit*lDigit);
            n /= 10;
        }
        return (squareSum-digitSum) >= 50;
    }
}
