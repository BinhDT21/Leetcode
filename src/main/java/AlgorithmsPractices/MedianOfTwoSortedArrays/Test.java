package AlgorithmsPractices.MedianOfTwoSortedArrays;

public class Test {



    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10,11,12,13,14,15,16,17};

        Solution solution = new Solution();

        double rs = solution.findMedianSortedArrays(arr1, arr2);
        System.out.println(rs);
    }
}
