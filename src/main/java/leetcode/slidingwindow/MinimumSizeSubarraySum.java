package leetcode.slidingwindow;

public class MinimumSizeSubarraySum {
    static void main() {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        //int[] arr = {1,4,4};
        //int target = 4;
        int result = minSubArrayLen(target,arr);
        System.out.println(result);
    }

    private static int minSubArrayLen(int target, int[] arr) {
        int low=0, high=0, sum=0, minLength = Integer.MAX_VALUE;

        while (high<arr.length){
            sum = sum+arr[high];
            while (sum>=target){
                minLength = Integer.min(minLength,high-low+1);
                sum=sum-arr[low];
                low++;
            }
            high++;
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
