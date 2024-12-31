package AlgorithmsPractices.LongestSubstring;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {


                String subStr = s.substring(i,j);

                for (int k = 0; k < subStr.length(); k++) {
                    String tmp = String.valueOf(subStr.charAt(k));
                    for (int l = k+1; l < subStr.length(); l++) {
                        if(String.valueOf(subStr.charAt(l)).equals(tmp))
                            subStr = "";
                    }
                }

                if(subStr.length() > result.length())
                    result = subStr;
            }
        }
        return result.length();
    }
}

