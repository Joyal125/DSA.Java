class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int Curmax = 0;
        int minSum = nums[0];
        int Curmin = 0;

        for(int ele : nums){

            Curmax = Math.max(Curmax +ele ,ele);
            maxSum = Math.max(maxSum,Curmax);
            Curmin = Math.min(Curmin +ele ,ele);
            minSum = Math.min(minSum , Curmin);

            totalSum += ele;




        }

        return maxSum>0 ? Math.max(maxSum,totalSum-minSum):maxSum;
    }
}