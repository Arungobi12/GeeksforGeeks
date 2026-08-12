class Solution {
    public int[] find(int l, int b, int h) {
        // code here
        int area = 2*(l*b + b*h + h*l);
        int volume = l*b*h;
        
        int[] ans = {area,volume};
        
        return ans;
    }
}