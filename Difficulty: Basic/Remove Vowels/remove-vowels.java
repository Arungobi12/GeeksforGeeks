class Solution {
    String removeVowels(String s) {
        // code here
        // int len = s.length();
        // char[] a = s.toCharArray();
        // String[] ans = {};
        
        // char[] ch = {'a','e','i','o','u','A','E','I','O','U'};
        // for(int i=0 ; i<len ; i++){
        //     if(ch[i] == a[i]){
        //         ans = add + (a[i]);
        //     }
        // }return ans;
        return s.replaceAll("[aeiouAeiou]","");
    }
}