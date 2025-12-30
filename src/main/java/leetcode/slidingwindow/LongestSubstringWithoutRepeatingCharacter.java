package leetcode.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    static void main() {
        String s = "abcabcbb";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println(maxLength);
    }

    /*
    “If the problem requires tracking frequency, I use a HashMap.
     If it only requires presence, I use a HashSet.”

     Interviewers love this clarity.
     */

    private static int lengthOfLongestSubstring(String s) {
        int low =0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        for (int high=0;high<s.length();high++){
            char ch = s.charAt(high);
            while (set.contains(ch)){
                set.remove(ch);
                low++;
            }

            set.add(ch);
            maxLength = Integer.max(maxLength,high-low+1);
        }
        return maxLength;
    }

    //My Code
    private static int lengthOfLongestSubstringUsingHashMap(String s) {
        int low = 0, maxLength = 0;
        Map<Character,Integer> hm = new HashMap<>();

        for(int high=0;high<s.length();high++){
            char ch = s.charAt(high);
            boolean isCharacterPresent = hm.containsKey(ch);

            if(isCharacterPresent){
                while(hm.containsKey(ch)){
                    hm.remove(s.charAt(low));
                    low++;
                }
            }
            hm.put(ch,1);
            maxLength = Integer.max(maxLength,high-low+1);
        }
        return maxLength;
    }
}
