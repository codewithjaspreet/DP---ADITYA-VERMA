class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         if(W == 0 || n == 0) return 0;
         
         if(wt[n-1] <= W) {
             return Math.max(val[n-1] + knapSack(W-wt[n-1] , wt , val , n-1) ,
             
                knapSack(W , wt , val , n-1));
             
         }
         
         else if(wt[n-1] > W){
             
             return knapSack(W , wt , val , n-1); 
         }
         
         return 0;
         
    } 
}