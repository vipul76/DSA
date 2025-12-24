package leetcode.twopointers;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        MergeTwoSortedArray mergeArray = new MergeTwoSortedArray();
        int[] nums1 = {1,2,3,7,9};
        int[] nums2 = {2,5,6};


        int[] result = mergeArray.merge(nums1,nums1.length,nums2,nums2.length);
        Arrays.stream(result)
                .forEach(t->System.out.print(t+" "));
    }

    //Not in place array as we have added a new array
    //TC : o(m+n)
    //SC : o(m+n)
    private int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,idx=0;
        int[] result = new int[m+n];
        //int[] nums = new int[m+n];

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                result[idx++] = nums1[i];
                i++;
            }
            else {
                result[idx++] = nums2[j];
                j++;
            }
        }
        while(i<m){
            result[idx++] = nums1[i];
            i++;
        }
        while(j<n){
            result[idx++] = nums2[j];
            j++;
        }
        return result;
    }
}
