class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        
        String a = "";
        
        String l1 = s1.replaceAll("["+ s2 +"]","");
        String l2 = s2.replaceAll("["+ s1 +"]","");

        a += l1 + l2;
        
        char[] ch = a.toCharArray();
        Arrays.sort(ch);
        
        String ans = new String (ch);
        StringBuilder sb = new StringBuilder();
        ans.chars().distinct().forEach(c -> sb.append((char) c));
        
        return sb.toString();
    }
}