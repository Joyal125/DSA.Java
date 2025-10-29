class Solution {
    public double myPow(double x, int n) {
        long myPow = n;
        if (n < 0) {
            x = 1 / x;
            myPow = -myPow;
        }

        double ans = 1;

        while (myPow > 0) {
            if (myPow % 2 == 1) {  // if odd
                ans *= x;
            }
            x *= x;       // square the base
            myPow /= 2;   // reduce the exponent
        }

        return ans;
    }
}
