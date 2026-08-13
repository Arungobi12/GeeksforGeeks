class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        // int i = 1;
        
        // while(i<=n){
        //     if(n%i==0){
        //         s.add(i);
        //         s.add(n/i);
        //     }i++;
        // }

        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                s.add(i);
                
                if (i != n / i) { 
                    s.add(n / i);
                }
            }
        }
        Collections.sort(s);
        return s;
    }
}
