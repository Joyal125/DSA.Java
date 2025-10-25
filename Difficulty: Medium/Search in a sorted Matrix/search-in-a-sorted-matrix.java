class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        // code here
        int row = arr.length , col = arr[0].length;
        
        int lo = 0 , hi = row*col-1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            
            int midRow = mid/col , midcol = mid%col;
            
            if(arr[midRow][midcol]== tar) return true;
            
            else if(arr[midRow][midcol] >tar) hi = mid -1;
            
            else lo = mid+1;
        }
        
        return false;
    }
}
