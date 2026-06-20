//Solved only 1 DSA problem from the biweekly contest of leetcode
class Solution {
    public String[] createGrid(int r, int c) {
        char[][] ch = new char[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ch[i][j]='#';
            }
        }

        for(int j=0;j<c;j++){
            ch[0][j]='.';
        }

        for(int i=0;i<r;i++){
            ch[i][c-1]='.';
        }

        String[] arr = new String[r];
        for(int i=0;i<r;i++){
            arr[i] = new String(ch[i]);
        }
        return arr;
    }
}
