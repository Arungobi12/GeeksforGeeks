class Solution {
    String merge(String s1, String s2) {
        // code here
        String a = "" ;
        
        
        if(s1.length() < s2.length()){
            for(int i=0 ; i<s1.length() ; i++){
                a += s1.charAt(i);
                a += s2.charAt(i);
            }
            int len =s2.length() - (s2.length() - s1.length());
            for(int j=len ; j<s2.length() ; j++){
                a += s2.charAt(j);
            }
            
        }else{
            for(int i=0 ; i<s2.length() ; i++){
                a += s1.charAt(i);
                a += s2.charAt(i);
            }
            int len =s1.length() - (s1.length() - s2.length());
            for(int j=len ; j<s1.length() ; j++){
                a += s1.charAt(j);
            }
        }

        // int ch = s1.length() - 2;
        
        return a;
    }
}