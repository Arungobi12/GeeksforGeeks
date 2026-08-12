class Solution {
    static int cubeRoot(int n) {
        // code here
        float a = (float) 1/3;

        int s =(int) Math.pow(n, a);
        return s;
    }
}