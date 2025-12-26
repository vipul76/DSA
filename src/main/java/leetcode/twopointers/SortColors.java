package leetcode.twopointers;

import java.util.Arrays;
//Dutch National Flag Problem
// Used 3 pointers here as we need 0's...,1's....,unknown,2's.....
// low will handle 0 case , mid will handle  2 case and high will handle any other case i.e 2.
public class SortColors {
    static void main() {
        int [] nums = {2,0,2,1,1,0};
        int[] result = sortColors(nums);
        Arrays.stream(result)
                .forEach(t->System.out.println(t+" "));
    }

    private static int[] sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(low<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        return nums;
    }
    private static void swap(int[] nums,int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    private static int[] sortColorsBF(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
