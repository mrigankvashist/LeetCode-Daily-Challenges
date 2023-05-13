class Solution {
    private static final int MOD = 1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
                int[] dp = new int[high + 1];
                dp[0] = 1;
                int ans = 0;
                for (int len = 1; len <= high; len++) {
                    if (len >= zero) {
                    dp[len] = dp[len - zero];
                }
                if (len >= one) {
                    dp[len] = (dp[len] + dp[len - one]) % MOD;
                }
                if (len >= low) {
                    ans = (ans + dp[len]) % MOD;
                }
            }
        return ans;
        }
    }