//Solved a DSA problem in which count the no. of corresponding bits are different
class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(x>0 || y>0){
            int xbit=x&1;
            int ybit=y&1;
            if(xbit != ybit){
                count++;
            }
            x=x>>1;
            y=y>>1;
        }
        return count;
    }
}
