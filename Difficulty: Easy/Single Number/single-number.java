// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        
        int result = 0;
        
        for(int arrs : arr){
            
            result ^= arrs;
        }
        
        return result;

        
    }
}