//Solved only one question of DSA from today's leetcode contest
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int count=0;
        int i=Math.max(0,n-k);
        int diff=0;
        while(diff<=n+k){
            diff=Math.abs(i-n);
            if(i!=n && diff<=k && (i&n)==0){
                count += i;
            }
            i++;
        }
        return count;
    }
}
