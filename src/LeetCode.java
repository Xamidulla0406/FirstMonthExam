import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        int[] check = new int[] {-1,-2,3,4};
        int[] res = maxSubsequence(check, 3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        Arrays.sort(nums);
        int[] arr = new int[k];
        int i = 0;
        int reverse = 1;
        while (i < k) {
            arr[i] = nums[nums.length-reverse];
            i++;
            reverse++;
        }
        return arr;
    }
}
