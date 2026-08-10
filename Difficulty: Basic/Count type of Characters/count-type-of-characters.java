class Sol {
    int[] count(String s) {
        // your code here
        
        String a = s.replaceAll("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]","");

        String b = s.replaceAll("[abcdefghijklmnopqrstuvwxyz]","");

        String c = s.replaceAll("[1234567890]","");

        int ch = s.length() ;

        int l1 = a.length() ;
        int l2 = b.length() ;
        int l3 = c.length() ;
        int l4 = (ch-l1) + (ch-l2) + (ch-l3);

        int a1 = ch - l1;
        int a2 = ch - l2;
        int a3 = ch - l3;
        int a4 = ch - l4;

        int[] arr = {a1,a2,a3,a4};
        return arr;
    }
}