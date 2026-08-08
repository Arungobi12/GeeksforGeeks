class Solution {
    public int convertFive(int n) {
        // code here
        String s = String.valueOf(n);
        // for(int i=0 ; i<s.length() ; i++){
        //     if(s(i) == 0){
                
        //     }
        // }
        String ans = s.replaceAll("0","5");
        int a = Integer.parseInt(ans);
        return a;
    }
}