package AlgorithmsPractices.ReverseInteger;

public class Solution {
    public int reverse (int x){

        int tmp = 1;
        if(x == 0 )return x;
        else if (x < 0)
            tmp *=-1;
        StringBuilder sb = new StringBuilder();
        String number = String.valueOf(Math.abs(x));
        sb.append(number);


        number = String.valueOf(sb.reverse());
        //Check overflow
        try{
            return Integer.parseInt(number) * tmp;
        }catch (NumberFormatException e){
            return 0;
        }

    }
}
