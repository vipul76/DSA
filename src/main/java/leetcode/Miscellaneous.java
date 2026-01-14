package leetcode;

import java.util.Arrays;

public class Miscellaneous {
    static void main() {
        int[] arr1 = {2,4,7,15,39};
        int[] arr2 = {2,5,6,17,22,32,45,67};
        int[] sortedArray = mergeArray(arr1,arr2);
        Arrays.stream(sortedArray)
                .forEach(output -> System.out.print(output+" , "));
    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int itr1 = 0 , itr2 =0, itr= 0;
        int size = arr1.length+arr2.length;
        int[] mergeSortedArray = new int[size];
        while (itr1<arr1.length && itr2< arr2.length){
            if(arr1[itr1]<arr2[itr2]){
                mergeSortedArray[itr] = arr1[itr1];
                itr1++;
            }
            else {
                mergeSortedArray[itr] = arr2[itr2];
                itr2++;
            }
            itr++;
        }
        while (itr1< arr1.length){
            mergeSortedArray[itr] = arr1[itr1];
            itr1++;
            itr++;
        }
        while (itr2<arr2.length){
            mergeSortedArray[itr] = arr2[itr2];
            itr2++;
            itr++;
        }
        return mergeSortedArray;
    }
}
