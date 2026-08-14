

class Solution {
    public int diagonalSum(int[][] mat) {
        // code here
        int len1 = mat.length;
        int len2 = mat[0].length;

        int a = 0;
        
        int i = 0;
        int j = len2 - 1;
        
        while(i<len1 && j>=0){
            a += mat[i][j];
            i++;
            j--;
        }
        
        for(int k=0 ; k<len1 ; k++){
            for(int l=0 ; l<len2 ; l++){
                if(k==l){
                    a += mat[k][l];
                }
            }
        }
        return a;
    }
}