import java.util.Arrays;

public class lcs_memoized {

        public int longestCommonSubsequence(String text1, String text2) {

            int n = text1.length();
            int m = text2.length();

            int[][] t = new int[1001][1001];   // matrix initialized with variables changing in recursion

            for(int[] row  : t){                    // default set with -1
                Arrays.fill(row , -1);
            }

            return helper(text1 , text2 , n , m , t);

        }


        public static int helper( String s1 , String s2 , int n  , int m,int[][] dp) {

            if(n == 0 || m == 0){
                return 0;
            }

            if(dp[n][m] != -1){
                return dp[n][m];            // if value already present return rather than again going in recursion
            }

            if(s1.charAt(n-1) == s2.charAt(m - 1)){

                // storing for further use

                return  dp[n][m] = 1 + helper(s1, s2 , n-1 , m - 1,dp);

            }

            else{

                // storing for further use
                return dp[n][m] = Math.max((helper(s1,s2,n,m-1,dp)) , (helper(s1,s2,n-1,m,dp)));
            }



        }
}
