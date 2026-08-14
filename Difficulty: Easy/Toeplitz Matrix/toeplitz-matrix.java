class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        int len = mat.length - 1;
        int len2 = mat[0].length - 1;
        
        for(int i=0 ; i<len ; i++){
            for(int j=0 ; j<len2 ; j++){
                if(mat[i][j] != mat[i + 1][j + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}


