//Solved a DSA problem to calculate x to the power of n using bit manipulation
class Solution {
    public double myPow(double base, int n) {
        double ans=1;
        long power=1L*n;
        if(power<0){
            power=Math.abs(power);
        }

        while(power>0){
            if((power&1)==1){
                ans *= base;
            }
            base *= base;
            power=power>>1;
        }
        return (n>0)? ans:1/ans;
    }
}
