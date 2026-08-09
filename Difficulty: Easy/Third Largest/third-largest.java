class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        int l1 = arr.get(0);
        int l2 = 0;
        int l3 = 0;
        
        if(arr.size()<3){
            return -1;
        }
        
        for(int i=1 ; i<arr.size() ; i++){
            if(l1<=arr.get(i)){
                l3 = l2;
                l2 = l1;
                l1 = arr.get(i);
                
            }else if(l2<=arr.get(i) && l1>=l2 && l3<=l2){
                l3 = l2;
                l2 = arr.get(i);
            }
            else if(l3<=arr.get(i) && l1>=l2 && l2>=l3){
                l3 = arr.get(i);
            }
        }return l3;
    }
}