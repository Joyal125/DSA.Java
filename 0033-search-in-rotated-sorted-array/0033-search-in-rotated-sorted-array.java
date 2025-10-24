
class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target)
                return mid;

            // Check which half is sorted
            if (nums[lo] <= nums[mid]) { 
                // Left half is sorted
                if (nums[lo] <= target && target < nums[mid]) {
                    hi = mid - 1; // target is in left part
                } else {
                    lo = mid + 1; // target is in right part
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[hi]) {
                    lo = mid + 1; // target in right part
                } else {
                    hi = mid - 1; // target in left part
                }
            }
        }
        return -1; // not found
    }
}
