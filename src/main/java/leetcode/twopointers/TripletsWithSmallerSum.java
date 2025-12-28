package leetcode.twopointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {
    static void main() {
        int n = 5, sum = 12;
        int[] arr = {5, 1, 3, 4, 7};
        int result = countTriplets(n,sum,arr);
        System.out.println(result);
    }

    private static int countTriplets(int n, int sum, int[] arr) {
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            int left = i+1, right = arr.length-1;

            while(left<right){
                int currentSum = arr[i] + arr[left] + arr[right];
                if(currentSum >= sum) right--;
                else {
                    count = count + (right-left);
                    left++;
                }
            }
        }
        return count;
    }
}
