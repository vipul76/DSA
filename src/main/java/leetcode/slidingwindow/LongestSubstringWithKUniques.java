package leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniques {
    static void main() {
        String s = "aabacbebebeb";
        int k = 3;
        int result = longestKSubstr(s,k);
        System.out.println(result);
    }

    private static int longestKSubstr(String s, int k) {
        int low = 0, maxLength = -1;
        Map<Character,Integer> hm = new HashMap<>();

        for (int high=0;high<s.length();high++){
            char ch = s.charAt(high);

            hm.put(ch, hm.getOrDefault(ch,0)+1);

            while (hm.size()>k){
                char removeElement = s.charAt(low);
                hm.put(removeElement,hm.get(removeElement)-1);

                if(hm.get(removeElement)==0){
                    hm.remove(removeElement);
                }
                low++;
            }

            if(hm.size()==k){
                maxLength = Integer.max(maxLength,high-low+1);
            }
        }
        return maxLength;
    }

    /*My Approach
    private static int longestKSubstr(String s, int k) {

        int low = 0, maxLength = Integer.MIN_VALUE;
        char[] chArr = s.toCharArray();

        Map<Character,Integer> hm = new HashMap<>();

        for(int high = 0; high<chArr.length;high++){
            char ch = chArr[high];
            if(hm.size()>k){
                maxLength=Integer.max(maxLength,high-low-2);
                char removeElement = chArr[low];
                while (hm.containsKey(removeElement) && low<high) {
                    if(hm.get(removeElement)==0){
                        hm.remove(removeElement);
                    }
                    else {
                        hm.put(removeElement,hm.get(removeElement)-1);
                        low++;
                    }
                }
            }
            else {
                //maxLength=Integer.max(maxLength,high-low+1);
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)+1);
                }
                else {
                    hm.put(ch,1);
                }
            }
            //maxLength=Integer.max(maxLength,high-low+1);
        }

        return maxLength;
    }

     */
}
