//Solved a DSA problem on bits in which we have to check that alternating bits of given number should be different
class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=n%2;
        n /= 2;
        while(n>0){
            if(n%2==prev){
                return false;
            }
            else{
                prev=n%2;
                n /= 2;
            }
        }
        return true;
    }
}
