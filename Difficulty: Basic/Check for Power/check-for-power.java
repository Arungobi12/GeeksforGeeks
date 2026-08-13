class Solution {
    public boolean isPower(int x, int y) {
        // code here
        // double a = Math.pow(x,3);
        // System.out.println(a);
        
        for(int i=0 ; i<=1000 ; i++){
            double a = Math.pow(x,i);
            if(a==y){
                return true;
            }
        }
        return false;
    }
}