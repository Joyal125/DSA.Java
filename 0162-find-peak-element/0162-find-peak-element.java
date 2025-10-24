class Solution {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < nums[mid + 1]) {
                lo = mid + 1;  // move right
            } else {
                hi = mid;      // move left (including mid)
            }
        }
        return lo; // lo == hi, peak found
    }
}
