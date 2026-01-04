package leetcode.slidingwindow;

public class MaximumSubarray {
    static void main() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    private static int maxSubArray(int[] nums) {
        int low = 0, maxSum = Integer.MIN_VALUE, sum = 0;
        for(int high = 0;high<nums.length;high++){
            if(sum <= 0 ){
                low = high;
                sum = 0;
            }
            sum = sum + nums[high];
            maxSum = Integer.max(maxSum, sum);
        }

        return maxSum;
    }
}
