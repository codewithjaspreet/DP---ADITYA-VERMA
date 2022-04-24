public class lcs_topDown {
        public int longestCommonSubsequence(String text1, String text2) {

            int n = text1.length();
            int m = text2.length();

            int[][] dp = new int[1001][1001];

           // initialisation as the base condition in recursive solution
            for(int i = 0 ; i < n+1 ; i++){

                for(int j = 0 ; j < m + 1 ; j++){

                    if(i == 0 || j == 0){
                        dp[i][j] = 0;
                    }
                }
            }

            for(int i = 1 ; i < n+1 ; i++){
                for(int  j = 1 ; j < m +1  ; j++){

                    if(text1.charAt(i-1) == text2.charAt(j-1)){

                        dp[i][j] =  1 + dp[i-1][j-1];
                    }

                    else{

                        dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                    }
                }
            }
            return dp[n][m];


        }



    }
