class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1); // ensure nums1 is smaller

        int m = nums1.length, n = nums2.length;
        int lo = 0, hi = m;

        while (lo <= hi) {
            int cut1 = (lo + hi) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int R1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            int L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int R2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (L1 <= R2 && L2 <= R1) {
                if ((m + n) % 2 == 0)
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                else
                    return Math.max(L1, L2);
            } else if (L1 > R2) {
                hi = cut1 - 1;
            } else {
                lo = cut1 + 1;
            }
        }

        return 0.0; // should never reach here
    }
}
