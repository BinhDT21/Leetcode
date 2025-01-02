package AlgorithmsPractices.PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        int tmp = x;
        int result = 0;
            while(x > 0){
                result *=10;
                result += x%10;
                x /=10;
            }

        if(result != tmp)return false;
        return true;
    }
}
