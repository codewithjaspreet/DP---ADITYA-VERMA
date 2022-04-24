public class lcs_recursive {

    // recursive solution for LCS
    // time limit exceeded on LeetCode

    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        return helper(text1 , text2 , n , m);

    }


    public static int helper( String s1 , String s2 , int n  , int m) {

        // base condition

        if(n == 0 || m == 0){
            return 0;
        }

        // if characters  at respective indexes found same

        if(s1.charAt(n-1) == s2.charAt(m - 1)){

            return 1 + helper(s1, s2 , n-1 , m - 1);

        }

        else{

            // choice diagram for selecting one of the scenarios
            return Math.max((helper(s1,s2,n,m-1)) , (helper(s1,s2,n-1,m)));
        }



    }
}
