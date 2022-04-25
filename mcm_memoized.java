import java.util.Arrays;

public class mcm_memoized {
    static int[][] dp = new int[1001][1001];


    int solve(int i, int j,int arr[])
    {
        for(int[] row  : dp){
            Arrays.fill(row , -1);
        }


        if(i>=j)return 0;

        if(dp[i][j] != -1) return dp[i][j];   // important

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int tempAns = solve(i,k,arr) + solve(k+1,j,arr)
                    + arr[i-1]*arr[k]*arr[j];

            ans=Math.min(ans,tempAns);
        }
        return dp[i][j] = ans;  // memoized
    }
    int matrixMultiplication(int N, int arr[])
    {
        return solve(1,N-1,arr);
    }
}
