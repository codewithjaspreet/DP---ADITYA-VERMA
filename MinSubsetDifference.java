class Solution
{
  // extension of subset sum  
  // s1 , s2 two subsets
  // range s1,s2  - > ( 0 , sigma(arr[i]))
  // s1 , range - s1
  // range - s1 - s1
  // minimise  - > range - 2s1
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum = Arrays.stream(arr).sum();
	   boolean [][] dp = new boolean[arr.length + 1][sum + 1];
        List<Integer>ls=subset_sum(dp,sum,arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=ls.size()/2;i++){
            min=Math.min(min,Math.abs(sum-2*ls.get(i)));
        }
        return min;
	}
	
	 private static List<Integer> subset_sum(boolean[][] dp, int sum,int[] arr) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else dp[i][j]=dp[i-1][j];
                }
            }

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==dp.length-1){
                    if(dp[i][j]==true)
                        ans.add(j);
                }
            }
        }

        return ans;
        }
}
