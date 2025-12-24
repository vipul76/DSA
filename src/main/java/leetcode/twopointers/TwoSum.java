package leetcode.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main() {
        //int[] arr = {2,7,11,15};
        //int target = 9;
        //int[] indexes = twoSum(arr,target);
        /*int[] arr = {2,3,4};
        int target = 6;
        int[] indexes = twoSumBF(arr,target);*/

        int[] arr = {2,3,4};
        int target = 6;
        int[] indexes = twoSumHM(arr,target);

        assert false;
        Arrays.stream(indexes)
                .forEach(System.out::print);
    }

    //Brute Force
    private static int[] twoSumBF(int[] arr, int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }

    //using Hashmap
    private static int[] twoSumHM(int[] arr, int target){
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int required = target - arr[i];
            if(hm.containsKey(required)){
                return new int[]{hm.get(required),i};
            }
            hm.put(arr[i],i);
        }
        return null;
    }

    //optimal
    private static int[] twoSum(int[] arr, int target) {
        int i=0, j=arr.length-1;

        while(i<j){
            if(arr[i]+arr[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
        }
        return null;
    }
}
