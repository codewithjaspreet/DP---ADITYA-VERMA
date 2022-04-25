public class longestcommonsubstring {

        int[][] dp  = new int[1001][1001];

        int longestCommonSubstr(String S1, String S2, int n, int m){
            // code here
            for(int i = 0 ; i < n+1 ; i++){

                for(int j = 0 ; j < m + 1 ;  j ++){

                    if(i == 0|| j == 0){

                        dp[i][j] = 0;
                    }

                }
            }

            for(int i = 1 ; i < n+1 ; i++){
                for(int  j = 1 ; j < m +1  ; j++){

                    if(S1.charAt(i-1) == S2.charAt(j-1)){

                        dp[i][j] =  1 + dp[i-1][j-1];
                    }

                    else{

                        // difference from lcs , taking the longest always , any discontinuity  make it 0

                        dp[i][j] = 0;

                    }
                }
            }

            int ans = Integer.MIN_VALUE;
            for(int i = 0 ; i < n+1 ; i++){

                for(int j = 0 ; j < m + 1 ;  j ++){

                    ans = Math.max(ans , dp[i][j]);
                }
            }

            return ans;


        }
    }
