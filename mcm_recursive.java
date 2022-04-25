// step 1 :  find i and j
// step 2 : find base condition
// step 3 : find k loop scheme
// step 4 : calculate temp ans then apply the function to get final ans
// great article to refer :

// time complexity for this naive solution is exponential

//  * https://leetcode.com/discuss/general-discussion/1278305/all-about-matrix-chain-multiplication-easy *

public class mcm_recursive {
    int solve(int i, int j,int arr[])
    {
        if(i>=j)return 0;

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int tempAns = solve(i,k,arr) + solve(k+1,j,arr)
                    + arr[i-1]*arr[k]*arr[j];

            ans=Math.min(ans,tempAns);
        }
        return ans;
    }
    int matrixMultiplication(int N, int arr[])
    {
        return solve(1,N-1,arr);
    }
}
