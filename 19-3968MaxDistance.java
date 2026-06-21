//Solved a leetcode weekly contest DSA problem based on 2D plane
//Its same question like the robot question in 2D plane
class Solution {
    public int maxDistance(String moves) {
        int n=moves.length();
        int x=0,y=0;
        int dashCount=0;
        for(int i=0;i<n;i++){
            char ch=moves.charAt(i);
            if(ch=='R'){
                x++;
            }
            else if(ch=='L'){
                x--;
            }
            else if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='_'){
                dashCount++;
            }
        }
        return Math.abs(x)+Math.abs(y)+dashCount;
    }
}
