class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        
        long[] dp = new long[n];
        Arrays.fill(dp,-1);
        return func(0, questions,dp);
    }
    
    public long func(int idx, int[][] ques, long[] dp){
        if(idx >= ques.length){
            return 0;
        }
        
        if(dp[idx] != -1){
            return dp[idx];
        }
        
        long takeit = ques[idx][0] + func(idx + ques[idx][1] + 1, ques, dp);
        long leaveit = func(idx+1, ques, dp);
        
        return dp[idx] =  Math.max(takeit, leaveit);
    }
    
}