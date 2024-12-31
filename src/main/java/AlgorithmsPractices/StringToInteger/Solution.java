package AlgorithmsPractices.StringToInteger;

public class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        s = s.trim();
        String result = "";
        int rs = 0;

        String[] arrCharacter = s.split("");
        if (arrCharacter[0].matches("[a-zA-Z.]")) return 0;
        for (int i = 0; i < arrCharacter.length; i++) {
            if (arrCharacter[i].equals("-") && i == 0) {
                sign = -1;
                continue;
            } else if (arrCharacter[i].equals("+") && i == 0) {
                continue;
            } else if (!arrCharacter[i].matches("[0-9]")) {
                break;
            }

            result += arrCharacter[i];
        }


        try {
            if(result.isEmpty())
                return 0;
            rs = Integer.parseInt(result) * sign;
        } catch (NumberFormatException e) {
            rs = Integer.MAX_VALUE;
            if (sign == -1) {
                rs = Integer.MIN_VALUE;
            }
        }
        return rs;

    }
}
