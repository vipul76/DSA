package leetcode.slidingwindow;

public class LongestRepeatingCharacterReplacement {
    static void main() {
        String s = "AABABBA";
        int k=1;
        int result = characterReplacement(s,k);
        System.out.println(result);
    }

    private static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low = 0, maxCount = 0, maxLength = 0;

        for (int high = 0; high < s.length(); high++) {
            maxCount = Math.max(maxCount, ++freq[s.charAt(high) - 'A']);

            while ((high - low + 1) - maxCount > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
            }

            maxLength = Math.max(maxLength, high - low + 1);
        }

        return maxLength;
    }
}

