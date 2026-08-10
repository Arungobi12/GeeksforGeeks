class Solution {
    public String modify(String s) {
        // code here
        char[] ch = s.toCharArray();
        
        int i = 0;
        int j = s.length() - 1;
        
        while(i<j){
            if(i<j && !isvowels(ch[i])){
                i++;
            }
            else if(i<j && !isvowels(ch[j])){
                j--;
            }
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
        
    }
    
    public static boolean isvowels(char ch){
        
        if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
        
    }
}