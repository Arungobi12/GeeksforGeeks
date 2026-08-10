class Sol {
    int countCamelCase(String s) {
        // your code here
        String a = s.replaceAll("[abcdefghijklmnopqrstuvwxyz]","");

        int count = a.length();
        return count;
    }
}