package leetcode.twopointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> results = threeSum(nums);

        results.forEach(System.out::println);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left = i+1, right = nums.length-1;
            int target = -nums[i];
            if(i>0 && nums[i]==nums[i-1]) continue;

            while(left<right){

                if(nums[left]+nums[right]==target){
                    List<Integer> list = List.of(nums[i],nums[left],nums[right]);
                    result.add(list);
                    while(left < right && nums[left+1]==nums[left]) {left++;}
                    while(left < right && nums[right-1] == nums[right]) {right--;}
                    left++;
                    right--;
                } else if (nums[left]+nums[right]<target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
