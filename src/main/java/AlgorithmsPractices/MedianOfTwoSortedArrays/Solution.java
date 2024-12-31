package AlgorithmsPractices.MedianOfTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr3 = new int[n+m];
        for (int i = 0; i < n; i++) {
            arr3[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[i+n] = nums2[i];
        }

        //sort array
        for (int i = 0; i < arr3.length; i++) {
            int min = arr3[i];
            int id = i;
            for (int j = i+1; j < arr3.length; j++) {
                if(arr3[j] < min)
                {
                    min = arr3[j];
                    id = j;
                }
            }
            int tmp = arr3[i];
            arr3[i] = arr3[id];
            arr3[id] = tmp;
        }

        if(arr3.length==1)return arr3[0];

        //get median
        int medianIndex = arr3.length/2;
        double result;
        if(arr3.length %2 ==0){
            result =  ((double)arr3[medianIndex] + (double)arr3[medianIndex - 1]) /2;
        }else result = arr3[medianIndex];

        return result;
    }
}
