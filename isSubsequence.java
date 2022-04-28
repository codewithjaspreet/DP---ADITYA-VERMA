class isSubsequence{
    // can be solved using lcs but this is optimised

    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==s.length()) return true;
        return false;
    }

}