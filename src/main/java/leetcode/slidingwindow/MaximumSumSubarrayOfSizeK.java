package leetcode.slidingwindow;

public class MaximumSumSubarrayOfSizeK {
    static void main() {
        //int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        //int k = 4;
        int[] arr = {100, 200, 300, 400};
        int k = 1;
        int maxSum = maxSubarraySum(arr,k);
        System.out.println(maxSum);
    }

    private static int maxSubarraySum(int[] arr, int k) {
        int sum = 0,result=0;
        for( int i=0;i<k;i++){
            sum += arr[i];
        }
        int low = 0, high = k-1;
        while(low<=high){
            result = Integer.max(result,sum);
            low++;
            high++;
            if(high>=arr.length){
                break;
            }
            sum = sum + arr[high] - arr[low-1];
        }
        return result;
    }
}
