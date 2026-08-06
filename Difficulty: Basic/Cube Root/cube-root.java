class Solution {
    static int cubeRoot(int n) {
        // code here
        float r =(float) 1/3;
        
        int s =(int) Math.pow(n, r);
        return s;
    }
}