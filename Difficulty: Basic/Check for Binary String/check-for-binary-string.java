class Solution {
    public boolean isBinary(String s) {
        // code here
        for (int i = 0; i < s.length(); i++) {
            char chk = s.charAt(i);
            if (chk != '0' && chk != '1') {
                return false;
            }
        }
        return true;
    }
}