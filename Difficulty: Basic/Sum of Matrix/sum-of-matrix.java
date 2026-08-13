class Solution {
    public int sumOfMatrix(int[][] mat) {
        // code here
        int len1 = mat.length;
        int len2 = mat[0].length;
        int a = 0 ;
        
        for(int i=0 ; i<len1 ; i++){
            for(int j=0 ; j<len2 ; j++){
                a += mat[i][j];
            }
        }
        return a;
    }
}