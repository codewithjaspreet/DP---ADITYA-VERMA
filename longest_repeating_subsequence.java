public class longest_repeating_subsequence {
    int[][] dp = new int[1001][1001];
    public int LongestRepeatingSubsequence(String str)
    {

        // code here
        String a = str;
        String b = str;
        for(int i = 0 ; i < a.length()+1 ; i++){

            for(int j = 0 ; j < b.length() + 1 ; j++){

                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i = 1 ; i < a.length()+1 ; i++){
            for(int  j = 1 ; j < b.length() +1  ; j++){

                if(a.charAt(i-1) == b.charAt(j-1) && i !=j ){  // variation of lcs- >  i != j to avoid same index


                    dp[i][j] =  1 + dp[i-1][j-1];
                }

                else{

                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
            }
        }
        return dp[a.length()][b.length()];


    }
}
