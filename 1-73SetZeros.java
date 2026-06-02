class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();

      //To get the index of row & column of 0th element
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

      //Make 0 to the elements having same row or column number
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
                }
            }
    }
}
