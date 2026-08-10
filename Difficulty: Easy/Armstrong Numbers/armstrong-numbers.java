class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int ch = n ;
        int sum = 0;
        int mul = 0;

        while(n>0){
            mul = n%10;
            n = n/10;
            sum += Math.pow(mul,3);
        }
        if(sum == ch){
            return true;
        }
        return false;
    }
}