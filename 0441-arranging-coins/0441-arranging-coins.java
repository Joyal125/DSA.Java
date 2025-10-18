class Solution {
    public int Sqrt(long n) {
        if (n == 0) return 0;

        long lo = 1, hi = n;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            if (mid <= n / mid)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return (int) hi;
    }

    public int arrangeCoins(int n) {
        long m = n; 
        return (Sqrt(8 * m + 1) - 1) / 2;
    }
}
