package leetcode.stream.string_stream;

import java.util.stream.Collectors;

public class RemoveVowels {
    static void main() {
        String str = "interview";

        String result = str.chars()
                .filter(c->!"aeiouAEIOU".contains(String.valueOf(c)))
                .mapToObj(c->(String.valueOf((char)c)))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
