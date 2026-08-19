class Solution {
    public int oppositeFaceOfDice(int n) {
        // code here
        int pos = 0;
        
        if(n>0 && n<=6){
            n = n-6;
            pos += Math.abs(n)+1;
        }
        return pos;
    }
}