class Solution {
    public String longest(String[] arr) {
        // code here
        if(arr == null || arr.length == 0){
            return "";
        }
        
        String a = arr[0];
        
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i].length() > a.length()){
                a = arr[i];
            }
        }
        return a;
    }
}