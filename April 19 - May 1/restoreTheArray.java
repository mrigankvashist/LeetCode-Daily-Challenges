import java.util.Arrays;

class Solution {
    public int numberOfArrays(String s, int k) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return dfs(s,k,0,dp);
    }
    
    private int mod = (int)1e9 + 7;
    
    public int dfs(String s, int k, int i, int[] dp){
        if(i == s.length()){
            return 1;
        }
        if(s.charAt(i) == '0') return 0;
        
        if(dp[i] != -1) return dp[i];
        
        int ans = 0;
        long num = 0;
        for(int j = i; j<s.length() ; j++){
            num = num * 10 + s.charAt(j) - '0';
            
            if(num > k) break;
            ans = (ans + dfs(s,k,j+1,dp)) % mod ;
            
        }
        dp[i] = ans;
        return dp[i];
    }
}