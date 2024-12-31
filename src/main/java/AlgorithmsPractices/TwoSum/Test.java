package AlgorithmsPractices.TwoSum;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] result =  solution.twoSum(nums, target);

        for(int i: result){
            System.out.print(i + " ");
        }
    }
}
