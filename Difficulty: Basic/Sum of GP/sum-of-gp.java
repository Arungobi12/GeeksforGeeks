class Solution {
    public int sumOfGP(int n, int a, int r) {
        // code here
        int geo = a;
        
        for(int i=1 ; i<n ; i++){
            geo += a*Math.pow(r,i);
        }
        return geo;
    }
}