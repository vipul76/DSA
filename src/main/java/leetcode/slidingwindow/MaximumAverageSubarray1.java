package leetcode.slidingwindow;

public class MaximumAverageSubarray1 {
    static void main() {
        /*int[] nums = {1,12,-5,-6,50,3};
        int k = 4;*/
        int[] nums = {4,0,4,3,3};
        int k = 5;
        double avg = findMaxAverage(nums,k);
        System.out.println("Average : "+ avg);
    }

    private static double findMaxAverage(int[] nums, int k) {
        int low = 0, sum=0;
        double avg = 0;
        for(int high=0;high<nums.length;high++){
            sum = sum + nums[high];
            if(high-low+1>k){
                sum = sum - nums[low];
                low++;
            }
            if(high-low+1 == k){
                avg = Double.max(avg, (double)sum /k);
            }
        }
        return avg;
    }
}
