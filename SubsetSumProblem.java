class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean[][] dp = new boolean[N + 1][sum + 1];
        // code here
        for(int i=0;i<N+1;i++)
       for(int j=0;j<sum+1;j++)
       {
           if(i==0)
           dp[i][j]= false;
           
           if(j==0)
           dp[i][j]= true;
           
           if(i==0&&j==0)
           dp[i][j]=true;
       }
       
       for(int i=1;i<N+1;i++)
        for(int j=1;j<sum+1;j++)
        {
            if(arr[i-1]<=j)
            {
               dp[i][j]= dp[i-1][j]||dp[i-1][j-arr[i-1]]; 
            }
            
            else if(arr[i-1]>j)
            
            {
                dp[i][j]= dp[i-1][j];
            }
            
        }
        return dp[N][sum];
}
}