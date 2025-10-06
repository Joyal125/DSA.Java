class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        // Handle base cases
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int rob1 = 0; 
        int rob2 = 0;
        int max1 = 0;
        int max2 = 0;

        // Case 1: Rob houses 0 to n-2
        for (int i = 0; i < n - 1; i++) {
            int temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        max1 = rob2;

        // Reset variables for next case
        rob1 = 0;
        rob2 = 0;

        // Case 2: Rob houses 1 to n-1
        for (int i = 1; i < n; i++) {
            int temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        max2 = rob2;

        // Return the maximum of both cases
        return Math.max(max1, max2);
    }
}
