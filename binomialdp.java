class Solution{
    static int nCr(int n, int r)
    {
        // code here
        // basic formula here is C(n,k)= 1, if k=0 or n=k
        // 							   = else C(n-1, k-1)+c(n-1, k)
        int dp[][] = new int[n+1][r+1];
        for(int i = 0;i<n+1; i++){
            for(int j = 0; j<r+1; j++){
                if(i == j || j == 0){
                    dp[i][j] = 1;
                }
                else if(j > i){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 1000000007;
                }
            }
        }
        
        return dp[n][r];
        
    }
}
