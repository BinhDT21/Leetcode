package AlgorithmsPractices.LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        String result = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String tmp = s.substring(i,j);

                int right = tmp.length()-1;
                int left = 0;
                String previousResult = result;
                while (right>left){
                    if(tmp.charAt(left) != tmp.charAt(right)){
                        result = previousResult;
                        break;
                    }
                    else{
                        if(tmp.length()>result.length()){
                            result = tmp;
                        }
                    }
                    right--;
                    left++;
                }


            }
        }
        return result;
    }
}
