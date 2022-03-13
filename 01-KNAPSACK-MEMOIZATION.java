class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 

         // create a matrix using that variables that are changing in recursive dp solution
         // initialise all with  - 1

         // store in variables each tym while calling recursive 

         
         int [][] dp=new int[n+1][W+1];
          for(int i=0;i<dp.length;i++){
              for(int j =0;j<dp[i].length;j++){
                  dp[i][j]=-1;
              }
          }
         
          return helper(W,wt,val,n,dp);
        
    } 
    
    
    static int helper(int W, int wt[], int val[], int n,int [][] dp){
    
    
         if(n==0 || W==0){
             return dp[n][W]=0;
         }
         
         if(dp[n][W]!=-1){
             return dp[n][W];
         }
         if(wt[n-1]<=W){
             
            // 
             return dp[n][W]= Math.max(val[n-1]+helper(W-wt[n-1],wt,val,n-1,dp),helper(W,wt,val,n-1,dp));
         }
         else{
             return dp[n][W]=helper(W,wt,val,n-1,dp);
         }
    }


}