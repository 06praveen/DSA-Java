//Solved a DSA question in which we have to check the robot should start from origin and end at origin
class Solution {
    public boolean judgeCircle(String s) {
        int n=s.length();
        int l=0,r=0,u=0,d=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='L'){
                l++;
            }
            else if(ch=='R'){
                r++;
            }
            else if(ch=='U'){
                u++;
            }
            else if(ch=='D'){
                d++;
            }
        }
        if((l==r) && (u==d)){
            return true;
        }
        return false;
    }
}
