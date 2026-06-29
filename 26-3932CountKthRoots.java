//Solved a DSA problem in which learned about how to count kth roots within a range with o(1) complexity
class Solution {
    public int countKthRoots(int l, int r, int k) {
        int left =(int) Math.ceil(Math.pow(l,1.0/k) - 1e-9);
        int right =(int) Math.floor(Math.pow(r,1.0/k) + 1e-9);

        return Math.max(0,right-left+1);
    }
}
