class Solution {
    public String removeDuplicates(String s) {
        // code here
        String ans = s.replaceAll("(.)\\1+","$1");

        return ans;
    }
}