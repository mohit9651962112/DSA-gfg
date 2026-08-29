class Solution {
    public int countSubsequences(String s, int n) {

        final int MOD = 1_000_000_007;

        long[] dp = new long[n];

        for (char ch : s.toCharArray()) {

            int digit = ch - '0';

            long[] newDp = dp.clone();

            // Start a new subsequence with this digit
            newDp[digit % n] =
                (newDp[digit % n] + 1) % MOD;

            // Add current digit to existing subsequences
            for (int r = 0; r < n; r++) {

                int newRemainder =
                    (r * 10 + digit) % n;

                newDp[newRemainder] =
                    (newDp[newRemainder] + dp[r]) % MOD;
            }

            dp = newDp;
        }

        return (int) dp[0];
    }
}