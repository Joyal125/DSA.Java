class Solution {
    public int maxCircularSum(int arr[]) {
        int totalSum = 0;
        
        int maxSum = arr[0];
        int curmax = 0;
        int minSum = arr[0];
        int curmin = 0;
        
        for(int ele: arr){
            curmax = Math.max(curmax+ ele, ele);
            maxSum = Math.max(maxSum,curmax);
            curmin = Math.min(curmin +ele,ele);
            minSum = Math.min(minSum, curmin);
            
            totalSum += ele; 
            
            
            
        }
        
        return maxSum>0 ? Math.max(maxSum,totalSum-minSum):maxSum;
        
    }
}
