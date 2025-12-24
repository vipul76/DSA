package leetcode.twopointers;

import java.util.Arrays;

public class SquaresOfSortedArrays {
    static void main() {
        int[] arr = {-4,-1,0,3,10};
        int[] result = sortedSquares(arr);
        Arrays.stream(result)
                .forEach(t->System.out.print(t+" "));
    }

    private static int[] sortedSquares(int[] arr) {
        int i=0, j=arr.length-1 , z = arr.length-1;
        int[] result = new int[arr.length];
        while(i<=j){
            int left = arr[i]*arr[i];
            int right = arr[j]*arr[j];

            if(left<right){
                result[z--]=right;
                j--;
            }
            else {
                result[z--]=left;
                i++;
            }
        }
        return result;
    }

    private static int[] sortedSquaresBF(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
