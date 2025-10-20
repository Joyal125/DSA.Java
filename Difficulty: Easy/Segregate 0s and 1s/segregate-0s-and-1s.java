// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int NumberofZeroes = 0;
        int NumberOfOnes = 0;
        
        for(int ele : arr){
            if(ele ==0) NumberofZeroes++;
                
            
                
                
               
              
            
        }
        
        for(int i =0; i<NumberofZeroes; i++){
            arr[i] =0;
        }
        
        for(int i =NumberofZeroes; i<arr.length; i++){
            arr[i] =1;
        }
    }
}
