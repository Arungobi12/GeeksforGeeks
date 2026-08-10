class Solution {
    public int reverseDigits(int n) {
        // Code here
        int temp = 0;
        int a = 0;

        while(n>0){
            temp = n%10;
            a = a*10+temp;
            n =  n/10;
        }
        return a;
    }
}