class Solution {
    public boolean identicalMat(int[][] mat1, int[][] mat2) {
        // code here
        int len1 = mat1.length;
        int len2 = mat2[0].length;
        
        for(int i=0 ; i<len1 ; i++){
            for(int j=0 ; j<len2 ; j++){
                if(mat1[i][j] != mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}