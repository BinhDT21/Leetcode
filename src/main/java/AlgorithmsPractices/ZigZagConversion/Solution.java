package AlgorithmsPractices.ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int n) {
        if(n == 1)return s;

        StringBuilder sb = new StringBuilder();

        List<Character>[] rows = new List[n];



        int k =0;
        int directions = -1;

        //create arrays follow the n (numRow)
        for(int i=0;i<n;i++){
            rows[i] = new ArrayList<>();
        }

        //read each characters in the String
        for(char c: s.toCharArray()){
            rows[k].add(c);  

            if(k == 0 || k == n-1){
                directions*=-1;
            }

            k+=directions;
        }

        for(List<Character> row: rows){
            for(Character c : row){
                sb.append(c);
            }
        }

        return sb.toString();


    }
}
