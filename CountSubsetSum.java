class Solution{
    
    // as per gfg but idea is same


	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    
	    int[][] dp = new int[n+1][sum+1];
	    
	      dp[0][0]=1;
           for(int j=1;j<sum+1;j++)
           {
                   dp[0][j]=0;
               
           }
      for(int i=1;i<n+1;i++) 
          {
           for(int j=0;j<sum+1;j++)
           {
               if(arr[i-1]<=j)
               {
                   dp[i][j]=dp[i-1][j]%1000000007 + dp[i-1][j-arr[i-1]]%1000000007;
               }
               else{
                  dp[i][j]=dp[i-1][j]%1000000007; 
               }
           }
       }
       
       return dp[n][sum]%1000000007;
	    
	    
	    
	    // Your code goes here
	}
	
	
}