class Solution {
    public List<String> extractInt(String s) {
        // code here
        List<String> a = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for(int i=0 ; i<s.length() ; i++){
            if(flag == true && !sb.isEmpty()){
                a.add(sb.toString());
                sb.setLength(0);
            }
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
                flag = false;
                
            }else{
                flag = true;
                // sb.setLength(0);
            }
            
        }
        if(!sb.isEmpty()){
            a.add(sb.toString());
        }
        return a;
    }
}