class Solution {
    public static int findMean(int[] arr) {
        // code here
        int mean = 0;
        int len = arr.length;

        for(int i=0 ; i<len ; i++){
            mean += arr[i];
        }
        
        int avg = mean/len;
        return avg;
    }
}