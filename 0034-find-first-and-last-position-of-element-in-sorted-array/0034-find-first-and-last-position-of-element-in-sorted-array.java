class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0 , hi = nums.length-1, first = -1 , last = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid] > target ) hi = mid-1;

            else if(nums[mid]<target) lo = mid+1;

            else{
                first = mid;
                hi = mid -1;
            }




        }

        lo = 0;
         hi = nums.length -1;
        

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]<target) lo = mid+1;
            else if(nums[mid]> target) hi = mid -1;

            else{
                last = mid;
                lo = mid+1;
            }
        }
        return new int[]{first,last};
    }
}