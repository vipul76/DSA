package leetcode.slidingwindow;
/*https://leetcode.com/problems/max-consecutive-ones-iii/description/
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */
public class MaxConsecutiveOnesIII {
    static void main() {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int result = longestOnes(nums, k);
        System.out.println(result);
    }

    private static int longestOnes(int[] nums, int k) {
        int[] freq = new int[2];
        int low=0, maxCount=0, length=0, maxLength=0;

        for(int high=0;high<nums.length;high++){
            length=high-low+1;
            maxCount = Integer.max(maxCount,++freq[nums[high]]);
            while((length-maxCount)>k || freq[0]>k){
                freq[nums[low]]--;
                low++;
                length = high-low+1;
            }

            maxLength = Integer.max(maxLength, length);
        }
        return maxLength;
    }
}
