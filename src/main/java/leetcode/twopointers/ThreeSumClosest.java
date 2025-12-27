package leetcode.twopointers;

import java.util.Arrays;

public class ThreeSumClosest {
    static void main() {
        //int[] nums = {-1,1,2,4};
        //int target = 1;
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int closest = threeSumClosest(nums,target);
        System.out.println(closest);
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int left = i+1, right = nums.length-1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum-target) < Math.abs(closestSum-target)){
                    closestSum = sum;
                }
                if(sum == target){
                    return sum;
                } else if (sum<target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return closestSum;
    }

/*    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            int left = i+1, right = nums.length-1;
            int newTarget = target-nums[i];
            while(left<right){
                if(nums[left]+nums[right]==newTarget) return 0;
                else if(nums[left]+nums[right]<newTarget){
                    closest = findClosest(nums,i,left,right,closest);
                    left++;
                }
                else{
                    closest = findClosest(nums,i,left,right,closest);
                    right--;
                }
            }
        }

        return closest;
    }

    private static int findClosest(int[] nums, int i, int left, int right, int closest) {

        int sum = nums[i]+nums[left]+nums[right];
        if(sum<0) sum = -sum;
        if(sum<closest){
            closest = sum;
        }
        return closest;
    }*/
}
