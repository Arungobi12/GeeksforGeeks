class Solution {
    public String isAutomorphic(int n) {
        // code here
        int s = (int) Math.pow(n, 2);

        String ch = String.valueOf(n);
        String ch1 = String.valueOf(s);
        
        if(ch1.endsWith(ch)){
            return "Automorphic" ;
        }
        return "Not Automorphic" ;
    }
}